import org.junit.jupiter.api.Test;

public class Multiplication {
    @Test
    void multipicatoin () {
        multitable(5);
    }

    private void multitable (int n1) {
        System.out.println("Multiplication Table of " + n1);
        for (int i = 0; i <= 10; i++) {
            System.out.println(i * n1);
            i++;
        }
    }

}
