package si.f5.pa_union.mwj.instances;

import org.bukkit.entity.Player;
import si.f5.pa_union.mwj.MWJCore;

public class Game {
    private Player host;

    public Game(Player host) {
        this.host = host;
    }

    public void stop() {
        MWJCore.getInstance().setCurrentGame(null);
    }
}
