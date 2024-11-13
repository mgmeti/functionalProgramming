package functionalInterfaces.supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    static void supplierWithDateExample(){
        Supplier<LocalDateTime> dateTimeSupplier = LocalDateTime::now;

        System.out.println(dateTimeSupplier.get());

        Supplier<String> dateTimeInStringSupplier = () -> dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(dateTimeInStringSupplier.get());

    }

    public static void main(String[] args) {
        supplierWithDateExample();

    }
}
