import org.junit.jupiter.api.Test;

public class Sums {

    @Test
    void sums_num () {
        stonwhile(10);
        stonfor(10);
        stondo(10);


    }

    private void stonwhile (int n1) {
        int i = 0;
        int result = 0;
        while (i <= n1) {
            result += i;
            i++;
        }
        System.out.println("the sum of 1 to " + n1 + " is " + result);

    }


    private void stonfor (int n1) {
        int result = 0;
        for (int i = 0; i <= n1; i++) {
            result += i;
        }
        System.out.println("the sum of 1 to " + n1 + " is " + result);
    }

    private void stondo (int n1) {
        int result = 0;
        int i = 0;
        do {
            result += i;
            i++;
        } while (i <= n1);
        System.out.println("the sum of 1 to " + n1 + " is " + result);
    }


}
