package app;

import lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Denar";
            }
        };
        System.out.println(simpleAction1.action());

        SimpleAction simpleAction2 = () -> {
            return "Denar from lambda";
        };
        System.out.println(simpleAction2.action());
    }
}
