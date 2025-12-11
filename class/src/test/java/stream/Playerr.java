package stream;

import java.util.Objects;

public class Playerr {
    private  String name;
    private  int goal;

    // Constructor : misazim
    public Playerr(String name, int goal) {
        this.name = name;
        this.goal = goal;
    }

    public String getName() {
        return name;
    }

    public int getGoal() {
        return goal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Playerr playerr = (Playerr) o;
        return goal == playerr.goal && Objects.equals(name, playerr.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, goal);
    }
}
