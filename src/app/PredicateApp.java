package app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicateCheck = value -> value.isBlank();
        System.out.println(predicateCheck.test(""));
        System.out.println(predicateCheck.test("Not Blank"));
    }
}
