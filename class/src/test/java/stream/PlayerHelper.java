package stream;

import sun.plugin.javascript.navig.Link;

import java.util.LinkedList;
import java.util.List;

public class PlayerHelper {

    List<Playerr> getplayers() {
        final List<Playerr> players = new LinkedList<>();
        players.add(new Playerr("messi", 110));
        players.add(new Playerr("messi", 110));
        players.add(new Playerr("ali", 120));

        return players;
    }

}
