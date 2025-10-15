package test;

class Car {
    boolean onn;
    boolean open;

    Car (String mark) {
        System.out.println("constructor was created without data; ");
        System.out.println(mark + " (car) is created");
    }

    void on () {
        System.out.println("test.Car is on");
    }

    void off() {
        System.out.println("test.Car is off");
    }


    void open() {
        System.out.println("test.Car is open");
    }

    void close() {
        System.out.println("test.Car is close");
    }

    boolean is_start() {
        if (onn && !open) {
            System.out.println("test.Car can start");
            return true;
        } else {
            System.out.println("test.Car can't start");
            return false;
        }
    }

}
