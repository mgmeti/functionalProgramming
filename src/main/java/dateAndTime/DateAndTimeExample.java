package dateAndTime;

import java.time.LocalDate;

public class DateAndTimeExample {
     public static void getFutureDate(){
         LocalDate today = LocalDate.now();
         LocalDate futureDate = today.plusYears(3);
         futureDate.minusMonths(1);
         futureDate.plusDays(3);
         System.out.println(today);
         System.out.println(futureDate);
     }

    public static void main(String[] args) {
         getFutureDate();

    }
}
