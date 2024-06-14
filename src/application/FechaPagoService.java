package application;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import domain.Festivos;
import ports.FechaPagoRepository;

// Aquí está cómo se implementamos la interfaz FechaPagoRepository en el servicio FechaPagoService
// para conectar el puerto con la lógica de este adaptador
public class FechaPagoService implements FechaPagoRepository {

    @Override
    public boolean esNoHabil(LocalDate fecha) {
        return fecha.getDayOfWeek().getValue() >= 6 || Festivos.esFeriado(fecha);
    }

    public LocalDate calcularProximaFechaPago(LocalDate fecha) {
        int dia = fecha.getDayOfMonth();

        // Podrmos determinar la próxima fecha de pago (15 o 30)
        LocalDate fechaPago = dia <= 15 ? fecha.withDayOfMonth(15) : fecha.withDayOfMonth(30);

        // Si el día 30 no existe en el mes, ajustamos al último día del mes
        if (fechaPago.getDayOfMonth() != 30 && fecha.getDayOfMonth() > 15) {
            fechaPago = fecha.withDayOfMonth(fecha.lengthOfMonth());
        }

        // Ajustamos la fecha de pago si cae un fin de semana o puente
        while (esNoHabil(fechaPago)) {
            fechaPago = fechaPago.minus(1, ChronoUnit.DAYS);
        }

        // Si la fecha calculada ya pasó, ajustamos al siguiente periodo de pago
        if (fechaPago.isBefore(fecha)) {
            fechaPago = fecha.plusMonths(1).withDayOfMonth(15);
            while (esNoHabil(fechaPago)) {
                fechaPago = fechaPago.minus(1, ChronoUnit.DAYS);
            }
        }

        return fechaPago;
    }
}
