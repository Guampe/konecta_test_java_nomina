package infrastructure;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import application.FechaPagoService;

public class Main {

    public static void main(String[] args) {
        // Ejemplo de la entrada (Punto de entrada a este sistema de nómina) como el que se me da
        // en el escrito del test
        String inputDate = "2024-02-05";
        LocalDate fechaEntrada = LocalDate.parse(inputDate, DateTimeFormatter.ISO_LOCAL_DATE);

        FechaPagoService fechaPagoService = new FechaPagoService();
        LocalDate proximaFechaPago = fechaPagoService.calcularProximaFechaPago(fechaEntrada);

        System.out.println("La próxima fecha de pago es: " + proximaFechaPago);
    }
}
