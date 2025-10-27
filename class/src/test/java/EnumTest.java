import org.junit.jupiter.api.Test;

public class EnumTest {

    @Test
    void printer () {
        System.out.println("in english: ");
        Dandeh.print();

    }

    @Test
    void  print_fa () {
        System.out.println("in Persian: ");
        Dandeh.print_fa();
    }

    @Test
    void  print_fa2 () {
        System.out.println("in Persian2: ");
        Dandeh.print_fa2();
    }
}
