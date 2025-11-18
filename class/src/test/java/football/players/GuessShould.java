package football.players;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class GuessShould {

    @Test
    void guess() {
        final List<Playerr> scorers = new LinkedList<>();

        scorers.add(new Playerr("ali daei", 109));
        scorers.add(new Playerr("ronaldo", 115));
        scorers.add(new Playerr("ali dari", 102));


        Playerr bestscorrer = scorers.stream().max(Comparator.comparing(playerr -> playerr.goall())).get();

        Assertions.assertThat(bestscorrer.namee()).isEqualTo("ronaldo");
    }


}
