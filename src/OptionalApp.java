import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        String name = null;

        sayHello(name);
    }
    public static void sayHello(String name){
        String upperName =  Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("FRIEND");

        System.out.println("Hello " + upperName);



//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> upperName = optionalName.map(value ->value.toUpperCase());
//        upperName.ifPresent(value -> System.out.println("Hello " + value));
    }
}
