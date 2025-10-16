public class Motor extends Vehicle{

    boolean takcharkh;

    Motor (String name) {
        System.out.println(name + " (motor) is created");
    }

    boolean takcharkh () {
        takcharkh = true;
        return takcharkh;
    }

    boolean harekat () {
        return true;
    }
}
