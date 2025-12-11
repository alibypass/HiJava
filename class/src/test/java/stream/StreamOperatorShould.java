package stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamOperatorShould {

    @Test
    void filter_data () {

        final List<Playerr> players = new PlayerHelper().getplayers();

        Predicate<? super Playerr> findgoal = player -> player.getGoal() > 100;
        Predicate<? super Playerr> findname = player -> player.getName().contains("ali");
        List<Playerr> topgoalnameali = players.stream()
                .filter(findgoal)
                .filter(findname)
                .collect(Collectors.toList());

        final List<Playerr> ali = new LinkedList<>();
        ali.add(new Playerr("ali", 120));


        Assertions.assertThat(topgoalnameali).isEqualTo(ali);
    }

    @Test
    void map_data () {
        final List<Playerr> players = new PlayerHelper().getplayers();

        Function<? super Playerr, ?> function = Playerr::getName;
        List<?> playerNames = players.stream().map(function).collect(Collectors.toList());

        final List<String> expectedresult = new LinkedList<>();
        expectedresult.add("messi");
        expectedresult.add("ali");


        Assertions.assertThat(playerNames).isEqualTo(expectedresult);

    }
}

