package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase estática
 * - Ser una clase final
 * - Que todos los métodos deben ser métodos estáticos
 *
 */
public final class FechaUtil {
    /**
     * Ejemplo de sumar dos números
     */
    public static int sumarDos(int a, int b) {
        //int s = a + b;
        return a + b;
    }

    /**
     * Fecha y hora actual
     * Java Time --> Manejar fechas y horas
     */
    public static String obtenerFechaHora() {
        LocalDateTime fechaHora = LocalDateTime.now();
        // LocalDate date = LocalDate.now();
        // LocalTime time = LocalTime.now();
        return DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm").format(fechaHora);
    }
}
