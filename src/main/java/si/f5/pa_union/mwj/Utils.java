package si.f5.pa_union.mwj;

import org.bukkit.Bukkit;

import java.util.Arrays;
import java.util.logging.Logger;

public class Utils {
    public static void log(String... strings) {
        Logger logger = MWJCore.getInstance().getLogger();

        for (String str : strings) {
            logger.info(str);
        }
    }

    public static void broadcast(String... strings) {
        Arrays.stream(strings).forEach(Bukkit::broadcastMessage);
    }

    public static String getVersion() {
        return Bukkit.getVersion().split("\\(MC:", 2)[1].split("\\)", 2)[0];
    }
}
