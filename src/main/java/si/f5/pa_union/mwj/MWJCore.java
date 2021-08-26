package si.f5.pa_union.mwj;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class MWJCore extends JavaPlugin {
    private static MWJCore instance;

    @Override
    public void onEnable() {
        instance = this;

        Utils.broadcast(new String[]{
               "----------------------------------",
                ChatColor.RED.toString() + ChatColor.BOLD + "Minecraft Werewolf Light",
                "  - Thank you for Downloading",
                "----------------------------------",
                "  ゲームの詳しいルールなどは、Wikiへ",
                "  当ゲームの必要人数は" + ChatColor.RED + ChatColor.BOLD + " 3 " + ChatColor.RESET + "人からです。",
                "  以下のコマンドで、ゲームを開始してください。",
                "      " + ChatColor.LIGHT_PURPLE + "/mwj start",
                "----------------------------------"
        });
    }

    @Override
    public void onDisable() {
    }

    public static MWJCore getInstance() {
        return instance;
    }
}
