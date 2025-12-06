package intefaces;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BifunctionsShould {

    @Test
    void takes_two_type_as_entry_and_return_one_type() {

        Map<String, Integer> players = new HashMap<>();

        players.put("Ali", 44);
        players.put("ahmad", 54);

        BiFunction<? super String, ? super Integer, Integer> biFunction =
                (key, value) -> key.contains("h") ? value + 1 : value - 1;

        final Integer ali = players.compute("Ali", biFunction);
        final Integer ahmad = players.compute("ahmad", biFunction);

        Assertions.assertThat(ali).isEqualTo(43);
        Assertions.assertThat(ahmad).isEqualTo(55);
    }
}