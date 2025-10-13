public class Cleasses {

    class Car {

        boolean onn;
        boolean open;

        void on () {
            System.out.println("Car is on");
        }

        void off () {
            System.out.println("Car is off");
        }


        void open () {
            System.out.println("Car is open");
        }

        void close () {
            System.out.println("Car is close");
        }

        void start () {
            if (onn && open) {
                System.out.println("Car can start");
            } else {
                System.out.println("Car can't start");
            }
        }
    }
}

