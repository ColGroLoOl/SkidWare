package com.colgrolool.skidware.modules;

import com.colgrolool.skidware.SkidWare;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ModuleExample extends Module {
    public ModuleExample() {
        super(SkidModules.SKIDCAT, "example", "An example module in a custom category.");
    }
}
