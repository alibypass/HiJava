public abstract class Vehicle {

    boolean on;
    boolean off;
    boolean start;

    public void offer () {
        off = true;
    }

    boolean onner () {
        on = true;
        return on;
    }

     boolean starter () {
        start = true;
        return start;
    }

    abstract boolean harekat ();
}
