package si.f5.pa_union.mwj.instances.players;

import org.bukkit.entity.Player;

import java.util.UUID;

public class MWLPlayer {
    private RoleType role = RoleType.NONE;
    private UUID uuid;

    public MWLPlayer(Player player) {
        uuid = player.getUniqueId();
    }
}
