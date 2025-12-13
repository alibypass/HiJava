package stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamOperatorShould {

    private List<Playerr> players;

    @BeforeEach
    void setUp() {
        players = new PlayerHelper().getplayers();
    }

    @Test
    void filter_data () {

//        final List<Playerr> players = new PlayerHelper().getplayers();

        Predicate<? super Playerr> findgoal = player -> player.getGoal() > 100;
        Predicate<? super Playerr> findname = player -> player.getName().contains("ali");
        List<Playerr> topgoalnameali = players.stream()
                .filter(findgoal)
                .filter(findname)
                .distinct()  // remove data tekrari
                .collect(Collectors.toList());

        final List<Playerr> ali = new LinkedList<>();
        ali.add(new Playerr("ali", 120));


        Assertions.assertThat(topgoalnameali).isEqualTo(ali);
    }

    @Test
    void map_data () {
//        final List<Playerr> players = new PlayerHelper().getplayers();

        Function<? super Playerr, ?> function = Playerr::getName;
        List<?> playerNames = players.stream()
                .map(function)
                .distinct() // remove data tekrari
                .collect(Collectors.toList());

        final List<String> expectedresult = new LinkedList<>();
        expectedresult.add("messi");
        expectedresult.add("ali");


        Assertions.assertThat(playerNames).isEqualTo(expectedresult);

    }

    @Test
    void sort_data () {

        List<Integer> sorted_data_goals = players.stream()
                .map(Playerr::getGoal)
                .sorted()
                .collect(Collectors.toList());

        final List<Integer> expectedresult1 = new LinkedList<>();
        expectedresult1.add(110);
        expectedresult1.add(110);
        expectedresult1.add(120);

        Assertions.assertThat(sorted_data_goals).isEqualTo(expectedresult1);

        List<Integer> sorted_data_goals_reverse = players.stream()
                .map(Playerr::getGoal)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        final List<Integer> expectedresult2 = new LinkedList<>();
        expectedresult2.add(120);
        expectedresult2.add(110);
        expectedresult2.add(110);

        Assertions.assertThat(sorted_data_goals_reverse).isEqualTo(expectedresult2);
    }
}

