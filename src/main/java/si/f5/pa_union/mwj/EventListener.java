package si.f5.pa_union.mwj;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import si.f5.pa_union.mwj.instances.Phases;

public class EventListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (MWJCore.getInstance().getCurrentGame().getPhase() == Phases.SETTING) {

        }
    }
}
