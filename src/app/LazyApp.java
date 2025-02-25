package app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(60, () -> getName());
    }
    public static void testScore(int value, Supplier<String> name){
        if(value > 80){
            System.out.println("Selamat " + name.get() + " Kamu lulus!");
        }else {
            System.out.println("Coba lagi tahun depan!");
        }
    }
    public static String getName(){
        System.out.println("Method getName() dipanggil");
        return "denar";
    }
}
