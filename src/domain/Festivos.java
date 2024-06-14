package domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Festivos {

    private static final Set<LocalDate> FERIADOS = new HashSet<>();

    static {
        FERIADOS.add(LocalDate.of(2024, 1, 1));  // Año Nuevo
        FERIADOS.add(LocalDate.of(2024, 1, 8));  // Día de los Reyes Magos
        FERIADOS.add(LocalDate.of(2024, 3, 25)); // Día de San José
        FERIADOS.add(LocalDate.of(2024, 3, 28)); // Jueves Santo
        FERIADOS.add(LocalDate.of(2024, 3, 29)); // Viernes Santo
        FERIADOS.add(LocalDate.of(2024, 5, 1));  // Día del Trabajo
        FERIADOS.add(LocalDate.of(2024, 5, 13)); // Día de la Ascensión
        FERIADOS.add(LocalDate.of(2024, 6, 3));  // Corpus Christi
        FERIADOS.add(LocalDate.of(2024, 6, 10)); // Sagrado Corazón
        FERIADOS.add(LocalDate.of(2024, 7, 1));  // San Pedro y San Pablo
        FERIADOS.add(LocalDate.of(2024, 7, 20)); // Día de la Independencia
        FERIADOS.add(LocalDate.of(2024, 8, 7));  // Batalla de Boyacá
        FERIADOS.add(LocalDate.of(2024, 8, 19)); // La Asunción
        FERIADOS.add(LocalDate.of(2024, 10, 14)); // Día de la Raza
        FERIADOS.add(LocalDate.of(2024, 11, 4)); // Todos los Santos
        FERIADOS.add(LocalDate.of(2024, 11, 11)); // Independencia de Cartagena
        FERIADOS.add(LocalDate.of(2024, 12, 8));  // Inmaculada Concepción
        FERIADOS.add(LocalDate.of(2024, 12, 25)); // Navidad
    }

    public static boolean esFeriado(LocalDate fecha) {
        return FERIADOS.contains(fecha);
    }
}

