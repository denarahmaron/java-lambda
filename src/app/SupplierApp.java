package app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Denar A";
        System.out.println(supplier.get());
    }
}
