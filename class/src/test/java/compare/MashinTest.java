package compare;

public class MashinTest implements Comparable<MashinTest> {

    public int gonjayesh_bak;

    MashinTest (String name, int gonjayesh_bak) {

    }


    @Override
    public int compareTo(MashinTest o) {
        int compare = Integer.compare(this.gonjayesh_bak, o.gonjayesh_bak);
        
        return compare;
    }
}
