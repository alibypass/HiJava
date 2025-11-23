package functional.principles;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class FunctionShould {

    @Test
    void get_an_entry_and_produce_an_output () {

        Map<String, Integer> map = new HashMap<>();

        Function<? super String, Integer> function = String::length;
        final Integer result = map.computeIfAbsent("Ali", function);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void get_a_primitive_type_an_entry () {

        int var = 6;

        IntFunction<String> to_string = String::valueOf;
        String result = to_string.apply(var);

        Assertions.assertThat(result).isEqualTo("6");

        DoubleFunction<Float> to_float;
        LongFunction<Integer> to_int;

    }

    @Test
    void return_a_primitive_type_given_any_type () {

        String var = "5";
        ToIntFunction<String> toIntFunction = string -> Integer.valueOf(string).intValue();

        int result = toIntFunction.applyAsInt(var);

        Assertions.assertThat(result).isEqualTo(5);

        ToDoubleFunction<Boolean> toDoubleFunction;
        ToLongFunction<Integer> toLongFunction;

    }

    @Test
    void give_a_primitive_type_as_input_and_output () {}

    IntToDoubleFunction intToDoubleFunction;
    LongToDoubleFunction longToDoubleFunction;
}
