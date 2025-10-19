import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void mathworks () {

        double n1 = -1.3;

        double motlagh = Math.abs(n1);

        Assertions.assertEquals(1.3, motlagh);

        Assertions.assertEquals(1, Math.cos(0));
    }
}
