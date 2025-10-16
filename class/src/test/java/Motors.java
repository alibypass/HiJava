import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Motors {


    @Test
    void work_with_motor () {

        Motor motor = new Motor("Honda");

        boolean start = motor.starter();

        Assertions.assertTrue(start);

        boolean takchatkh = motor.takcharkh();

        Assertions.assertTrue(takchatkh);

    }
}
