package si.f5.pa_union.mwj;

import com.sun.istack.internal.Nullable;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import si.f5.pa_union.mwj.commands.Start;
import si.f5.pa_union.mwj.commands.Stop;
import si.f5.pa_union.mwj.instances.Game;

import java.util.Arrays;
import java.util.List;

public final class MWJCore extends JavaPlugin {
    private static MWJCore instance;
    private static Game current = null;

    private final String[] defaultMessage = new String[] {
            "----------------------------------",
            ChatColor.RED.toString() + ChatColor.BOLD + "Minecraft Werewolf Light",
            ChatColor.GREEN.toString() + ChatColor.BOLD + "  - Minecraft version " + Utils.getVersion(),
            " %MESSAGE%",
            "----------------------------------"
    };

    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getPluginManager().registerEvents(new EventListener(), this);

        Utils.broadcast(
                "----------------------------------",
                ChatColor.RED.toString() + ChatColor.BOLD + "Minecraft Werewolf Light",
                "  - Thank you for Downloading",
                "----------------------------------",
                "  ゲームの詳しいルールなどは、Wikiへ",
                "  当ゲームの必要人数は" + ChatColor.RED + ChatColor.BOLD + " 3 " + ChatColor.RESET + "人からです。",
                "  以下のコマンドで、ゲームを開始してください。",
                "      " + ChatColor.LIGHT_PURPLE + "/mwj start",
                "----------------------------------"
        );
    }

    @Override
    public void onDisable() {
        current.stop();
    }

    public static MWJCore getInstance() {
        return instance;
    }

    public Game getCurrentGame() {
        return current;
    }

    public void setCurrentGame(@Nullable Game game) {
        current = game;
    }

    public String[] getMessage(String message) {
        return (String[]) Arrays.stream(defaultMessage).map(i -> i.replace("%MESSAGE%", message)).toArray();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        if (command.getName().equals("mwj") && args.length >= 1) {
            switch (args[0]) {
                case "start":
                    return Start.execute((Player) sender);
                case "stop":
                    return Stop.execute();
            }
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (command.getName().equals("mwj")) {
            return Arrays.asList("start", "stop");
        }
        return super.onTabComplete(sender, command, alias, args);
    }
}
