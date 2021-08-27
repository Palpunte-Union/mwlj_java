package si.f5.pa_union.mwj.instances;

import org.bukkit.entity.Player;
import si.f5.pa_union.mwj.MWJCore;
import si.f5.pa_union.mwj.instances.players.MWLPlayer;

import java.util.HashMap;
import java.util.UUID;

public class Game {
    private final Player host;
    private Phases phase = Phases.SETTING;
    private HashMap<UUID, MWLPlayer> playerMap;

    public Game(Player host) {
        this.host = host;
        start();
    }

    private void start() {

    }

    public void stop() {
        MWJCore.getInstance().setCurrentGame(null);
    }

    public Phases getPhase() {
        return phase;
    }

    public Player getHost() {
        return host;
    }
}
