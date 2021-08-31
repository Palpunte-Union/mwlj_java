package si.f5.pa_union.mwj.instances;

import org.bukkit.entity.Player;
import si.f5.pa_union.mwj.MWJCore;
import si.f5.pa_union.mwj.instances.players.MWLPlayer;

import java.util.HashMap;
import java.util.UUID;

public class Game {
    private final Player host;
    private Thread thread;
    private Phase phase = Phase.SETTING;
    private HashMap<UUID, MWLPlayer> playerMap;

    public Game(Player host) {
        this.host = host;
        start();
    }

    private void start() {
        thread = new Thread(() -> {

        }, "MWL");
        thread.start();
    }

    public void stop() {
        thread = null;
        MWJCore.getInstance().setCurrentGame(null);
    }

    public Phase getPhase() {
        return phase;
    }

    public Player getHost() {
        return host;
    }
}
