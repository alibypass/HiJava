package intefaces;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;

public class BiFunctionPrimitivesShould {

    @Test
    void return_primitive_type () {
        Integer int1 = 5;
        Integer int2 = 90;

        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction =
                Integer::sum;
        final double result = toDoubleBiFunction.applyAsDouble(int1, int2);

        Assertions.assertThat(result).isEqualTo(95);
    }

}
