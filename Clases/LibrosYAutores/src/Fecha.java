import java.time.LocalDateTime;
import java.time.Month;
/*
 * Tenemos 3 tipos de datos de Fecha
 * LocalDate: Fecha sin hora
 * LocalTime: Hora sin fecha
 * LocalDateTime: Fecha y hora
 */

public class Fecha {
    public static void main(String[] args){
        LocalDateTime fecha = LocalDateTime.now();
        System.out.println("La fecha es: " + fecha);

        System.out.println("Esto es el año: " + fecha.getYear());
        System.out.println("Estos es el numero del mes: " + fecha.getMonthValue());
        System.out.println("Esto es el dia del mes: " + fecha.getDayOfMonth());
        System.out.println("Estos son los dias del año en numero: " + fecha.getDayOfYear());
        // System.out.println(fecha.getDayOfWeek());
        System.out.println("Estos son las horas: " + fecha.getHour());
        System.out.println("Estos son los min: " + fecha.getMinute());
        System.out.println("Estos son los sec: " + fecha.getSecond());
        
        Month mes = Month.AUGUST;
        fecha = LocalDateTime.of(1998,mes,12,12,7);
        System.out.println("La fecha es: " + fecha);
    }
}
// El constructor de LocalDateTime public static LocalDateTime of(int year, Month month,int dayofMonth, int hour, int min)