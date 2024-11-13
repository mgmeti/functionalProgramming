package dateAndTime;

import java.time.LocalDate;

public class DateAndTimeExample {
     public static void getFutureDate(){
         LocalDate today = LocalDate.now();
         LocalDate futureDate = today.plusYears(2);
         futureDate = futureDate.minusMonths(1);
         futureDate = futureDate.plusDays(3);
         System.out.println(today);
         System.out.println(futureDate);
     }

     public static void getFutureDateWithMethodChaining(){
         LocalDate futureDate = LocalDate.now().plusYears(2).minusMonths(1).plusDays(3);
         System.out.println(LocalDate.now());
         System.out.println(futureDate);
     }

    public static void main(String[] args) {
         getFutureDate();
         getFutureDateWithMethodChaining();

    }
}
