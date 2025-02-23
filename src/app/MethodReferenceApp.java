package app;

import util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        // Static Method
//        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase; // Method Reference

        System.out.println(predicateIsLowerCase.test("denar"));
        System.out.println(predicateIsLowerCase.test("Denar"));

        // Non Static Method
        MethodReferenceApp app = new MethodReferenceApp();
        app.run();

        // Method Reference di Object
        System.out.println("Reference Object");
        app.run2();

        // Method Reference di parameter
//        Function<String, String> functionUpper = (String value) -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase; // Method Reference
        System.out.println(functionUpper.apply("denar"));
        System.out.println(functionUpper.apply("small"));
    }

    public void run(){
        Predicate<String> predicateIsLowerCase = this::isLowerCase;
        System.out.println(predicateIsLowerCase.test("Wawan"));
        System.out.println(predicateIsLowerCase.test("wawan"));
    }

    public void run2(){
        MethodReferenceApp objectApp = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase = objectApp::isLowerCase;
        System.out.println(predicateIsLowerCase.test("Ciro"));
        System.out.println(predicateIsLowerCase.test("Ciro"));
    }

    public boolean isLowerCase(String value){
        for(char c : value.toCharArray()){
            if(!Character.isLowerCase(c)) return false;
        }
        return true;
    }
}
