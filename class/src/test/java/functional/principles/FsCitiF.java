package functional.principles;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FsCitiF {

    @Test
    void be_passed_as_method () {

        List<String> players = new ArrayList<>();

        players.add("messi");
        players.add("ronaldo");
        players.add("ali daei");

        Collections.sort(players, (a, b) -> a.compareTo(b));


        Comparator<String> variable = (a, b) -> a.compareTo(b);
        Collections.sort(players, variable);



    }
}
