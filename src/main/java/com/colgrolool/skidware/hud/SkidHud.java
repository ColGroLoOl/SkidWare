package com.colgrolool.skidware.hud;

import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudGroup;

public class SkidHud {
    public static final HudGroup SKIDHUD = new HudGroup("SkidWare");

    public static void register() {
        addHudElements(
            new HudExample()
        );
    }

    public static void addHudElements(HudElement... hudElement) {
        Hud hud = Hud.get();

        for (HudElement hudElement1 : hudElement) {
            hud.register(hudElement1.info);
        }
    }
}
