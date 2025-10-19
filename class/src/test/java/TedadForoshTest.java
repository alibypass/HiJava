import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TedadForoshTest {


    @Test
    void foroshcheck() {
        Foroshandeh foroshandeh = new Foroshandeh();


        foroshandeh.foroshmashin();

        Assertions.assertEquals(1, Car.sellscount);
    }
}
