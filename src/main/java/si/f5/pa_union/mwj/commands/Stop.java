package si.f5.pa_union.mwj.commands;

import si.f5.pa_union.mwj.MWJCore;

public class Stop {
    public static boolean execute() {
        if(MWJCore.getInstance().getCurrentGame() != null) {
            MWJCore.getInstance().getCurrentGame().stop();
        }
        return true;
    }
}
