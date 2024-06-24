import java.time.LocalDate; // java.time.LocalDate: Representa una fecha sin hora en el formato ISO-8601 (YYYY-MM-DD).
import java.time.Period; // java.time.Period: Representa una cantidad de tiempo en términos de años, meses y días.
import java.time.temporal.ChronoUnit; // java.time.temporal.ChronoUnit: Proporciona unidades de tiempo como DAYS, WEEKS, MONTHS.

public class Fecha {
    public static void main(String[] args) {
        // Definir las fechas de inicio y fin
        LocalDate startDate = LocalDate.of(2024, 6, 23);
        LocalDate endDate = LocalDate.of(2024, 9, 18);

        // Calcular la diferencia en días usando ChronoUnit.DAYS.between
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        // Calcular la diferencia en términos de años, meses y días usando
        // Period.between:

        Period periodBetween = Period.between(startDate, endDate);
        // Imprimir la diferencia en días:

        System.out.println("\nFaltan " + daysBetween + " Dias para El 18");

    }
}
