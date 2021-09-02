package si.f5.pa_union.mwj;

import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class EventListener implements Listener {
    @EventHandler
    public void onEvent(Event e) {
        if (MWJCore.getInstance().getCurrentGame() != null) {
            Class<?> clazz = MWJCore.getInstance().getCurrentGame().getEventListener().getClass();
            Method[] methods = clazz.getDeclaredMethods();
            Arrays.stream(methods)
                    .filter(i -> i.getParameters()[0].getClass().getName().equals(e.getClass().getName()))
                    .forEach(i -> {
                        try {
                            i.invoke(MWJCore.getInstance().getCurrentGame().getEventListener(), e);
                        } catch (IllegalAccessException | InvocationTargetException ex) {
                            ex.printStackTrace();
                        }
                    });
        }
    }
}
