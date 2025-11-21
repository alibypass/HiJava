package functional.principles;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HigherFuctionOrderShould {

    @Test
    void take_one_or_many_other_function_as_parameter_and_return_a_function () {
        Operation operation = number -> number + 5;
        final int result = operation_to(7, operation).apply();

        Assertions.assertThat(result).isEqualTo(12);
    }


    private Addoperationto operation_to (int number, Operation operation) {
        return () -> operation.applyoperation(number);
    }

    @FunctionalInterface
    interface Addoperationto {
        int apply();
    }


    @FunctionalInterface
    interface Operation {
        int applyoperation(int number);
    }

}
