package function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        Function<Integer, String> changeTypeAndReplace = changeTypeFunction.andThen(replaceFunction);
        System.out.println(changeTypeAndReplace.apply(125125));

        Integer result = multiplyBy10AndDivisionBiFunction.apply(100, 5);
        System.out.println(result);

        System.out.println(multiplyBy10AndDivisionBiFunction.apply(100, 5));

    }

    static Function<Integer, String> changeTypeFunction = String::valueOf;
    static Function<String, String> replaceFunction = msg -> msg.replace(String.valueOf(1), String.valueOf(2));

    static BiFunction<Integer, Integer, Integer> multiplyBy10AndDivisionBiFunction = (numberMultiplyBy10, numberDivisionBy)
            -> (numberMultiplyBy10 * 10) / numberDivisionBy;
}
