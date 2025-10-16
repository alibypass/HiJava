import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class cars {

        @Test
        void work_with_car () {

            Car car = new Car("Sina");

            car.open();

            boolean start = car.starter();

            System.out.println("---------------------------------------");

            Vehicle pride = new Car("pride");



            boolean is_harekat = pride.harekat();

            Assertions.assertTrue(is_harekat);


        }

    }

