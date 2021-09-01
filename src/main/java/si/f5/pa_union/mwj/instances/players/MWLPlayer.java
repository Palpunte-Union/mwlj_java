package si.f5.pa_union.mwj.instances.players;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class MWLPlayer {
    private RoleType currentRole;
    private final RoleType prevRole;
    private final UUID uuid;

    public MWLPlayer(Player player, RoleType prevRole) {
        uuid = player.getUniqueId();
        this.prevRole = prevRole;
        currentRole = prevRole;
    }
    
    public Player getPlayer() {
        return Bukkit.getPlayer(uuid);
    }

    public RoleType getCurrentRole() {
        return currentRole;
    }

    public RoleType getPrevRole() {
        return prevRole;
    }

    public void setCurrentRole(RoleType currentRole) {
        this.currentRole = currentRole;
    }
}
