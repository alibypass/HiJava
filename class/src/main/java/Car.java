public class Car extends Vehicle implements GearBox, Sandogh{

    public static int sellscount;

    Car (String mark) {
        System.out.println("constructor was created without data; ");
        System.out.println(mark + " (car) is created");
    }

    Car () {

    }


    void open() {
        System.out.println("Car is open");
    }

    void close() {
        System.out.println("Car is close");
    }

    boolean harekat () {
        return true;
    }

    @Override
    public String typedandeh() {
        return null;
    }

    @Override
    public int  gonjayeshsandogh() {
        return 60;
    }
}
