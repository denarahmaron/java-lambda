package app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> names = List.of("Denar", "Ahmaron");

        // for loop
        for(var name : names){
            System.out.println(name);
        }

        // foreach anon class
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // lambda
        names.forEach(name -> System.out.println(name));

        // lambda method reference
        names.forEach(System.out::println);
    }
}
