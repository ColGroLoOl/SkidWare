package com.colgrolool.skidware.modules;

import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;

public class GodBridge extends Module {
    public GodBridge() {
        super(SkidModules.SKIDCAT, "god-bridge", "Automatically sneaks at block edge");
    }


    boolean turn = true;
    @EventHandler
    private void onTick(TickEvent.Pre event) {
        if (mc.world.getBlockState(mc.player.getSteppingPos()).isAir()) {
            if (!mc.player.isOnGround()) return;
            turn = true;
            mc.options.sneakKey.setPressed(true);
        } else if (turn) {
            turn = false;
            mc.options.sneakKey.setPressed(false);
        }
    }

    @Override
    public void onDeactivate() {
        if (turn)
            mc.options.sneakKey.setPressed(false);
    }
}
