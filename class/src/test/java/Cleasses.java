import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Cleasses {

    @Test
    void work_with_car () {

        Car car = new Car("Sina");

        car.open();
        car.on();
        boolean start_carcar = car.is_start();

        System.out.println("---------------------------------------");

        Car pride = new Car("pride");


        pride.on();
        boolean is_start = pride.is_start();

        Assertions.assertFalse(is_start);


    }

    class Car {

        boolean onn;
        boolean open;

        Car (String mark) {
            System.out.println("constructor was created without data; ");
            System.out.println(mark + " (car) is created");
        }

        void on () {
            System.out.println("Car is on");
        }

        void off() {
            System.out.println("Car is off");
        }


        void open() {
            System.out.println("Car is open");
        }

        void close() {
            System.out.println("Car is close");
        }

        boolean is_start() {
            if (onn && !open) {
                System.out.println("Car can start");
                return true;
            } else {
                System.out.println("Car can't start");
                return false;
            }
        }
    }
}

