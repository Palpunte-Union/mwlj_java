package si.f5.pa_union.mwj.instances.players;

public enum RoleType {
    NONE("観戦者", "観戦者"),
    WEREWOLF("人狼", "人狼"),
    WISEWOLF("人狼", "賢狼");

    private final String seer;
    private final String name;

    RoleType(String seer, String name) {
        this.seer = seer;
        this.name = name;
    }
}
