import java.time.LocalDateTime;
import java.time.Month;
/*
 * Tenemos 3 tipos de datos de Fecha
 * LocalDate: Fecha sin hora
 * LocalTime: Hora sin fecha
 * LocalDateTime: Fecha y hora
 */
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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

        LocalDateTime fecha1 = LocalDateTime.now();
        LocalDateTime fechaOf = LocalDateTime.of(2024, 2, 26, 8, 30, 10);
        
        //Muestra el año
        System.out.println(fecha1.getYear());
        //Muestra el dia del mes en letra
        System.out.println(fecha1.getDayOfMonth());
        //Muestra el dia del mes
        System.out.println(fecha1.getMonthValue());
        //Muestra la hora
        System.out.println(fecha1.getHour());
        //Muestra los minutos
        System.out.println(fecha1.getMinute());
        //Año bisiesto
        System.out.println(fecha1.toLocalDate().isLeapYear());

        // X dias despues de una fecha
        System.out.println(fecha1.plusDays(7));

       //No modifica la fecha
       System.out.println(fecha1);
       //X horas antes de una fecha
       System.out.println(fecha1.minusHours(2));
       
       if(fecha1.equals(fechaOf)){
        System.out.println("Es la misma fecha");
       }else if(fecha1.isBefore(fechaOf)){
        System.out.println("Es una fecha anterior");
       }else{ //El else es como pone fecha1.isAfter(fechaOf);
        System.out.println("Es una fecha posterior. La fecha que llama al metodo es posterior a la fecha con la que comparamos");
         
        //Le damos formato a la fecha de tipo LocalDateTime
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss");
        System.out.println(fecha1.format(formato));
        // System.out.println(fecha1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.)));
    
        }
    }
}
// El constructor de LocalDateTime public static LocalDateTime of(int year, Month month,int dayofMonth, int hour, int min)