package com.colgrolool.skidware;

import com.colgrolool.skidware.commands.SkidCommands;
import com.colgrolool.skidware.hud.SkidHud;
import com.colgrolool.skidware.modules.SkidModules;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import org.slf4j.Logger;

public class SkidWare extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    @Override
    public void onInitialize() {
        LOG.info("Initializing SkidWare");

        SkidModules.register();
        SkidHud.register();
        SkidCommands.register();
    }

    @Override
    public void onRegisterCategories() {
        SkidModules.registerCategories();
    }

    @Override
    public String getPackage() {
        return "com.colgrolool.skidware";
    }
}
