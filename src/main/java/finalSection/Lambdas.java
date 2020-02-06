package finalSection;

import java.util.function.BiFunction;

public class Lambdas {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            // logic
            if (name.isEmpty()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Alex", null));
    }
}
