package si.f5.pa_union.mwj.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import si.f5.pa_union.mwj.MWJCore;
import si.f5.pa_union.mwj.Utils;
import si.f5.pa_union.mwj.instances.Game;

public class Start {
    public static boolean execute(Player host) {
        if (MWJCore.getInstance().getCurrentGame() != null) {
            MWJCore.getInstance().setCurrentGame(new Game(host));
        } else {
            Utils.broadcastMessages(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Error",
                    "  ゲーム中に、新たなゲームは開始できません。",
                    "  以下のコマンドで、ゲームを中断してください。",
                    ChatColor.LIGHT_PURPLE + "    /mwj stop"
            );
        }
        return false;
    }
}
