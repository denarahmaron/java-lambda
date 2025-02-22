package app;

import lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Denar";
//            }
//        };
//        System.out.println(simpleAction1.action());
//
//        SimpleAction simpleAction2 = () -> {
//            return "Denar from lambda";
//        };
//        System.out.println(simpleAction2.action());

        SimpleAction simpleAction1 = (String name) ->{
            return "Hello " + name;
        };
        System.out.println(simpleAction1.action("Budi"));

        SimpleAction simpleAction2 = (value) -> {
            return "Hello " + value;
        };
        System.out.println(simpleAction2.action("Agus"));

        SimpleAction simpleAction3 = (String name) -> "Hello " + name;
        System.out.println(simpleAction3.action("Boy"));

        SimpleAction simpleAction4 = (value) -> "Hello " + value;
        System.out.println(simpleAction4.action("Ciro"));

        SimpleAction simpleAction5 = name -> "Hello " + name;
        System.out.println(simpleAction5.action("David"));
    }
}
