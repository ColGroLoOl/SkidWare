package com.colgrolool.skidware.modules;

import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.item.Items;

public class SkidModules {
    public static final Category SKIDCAT = new Category("SkidWare", Items.SKELETON_SKULL.getDefaultStack());

    public static void register() {
        addModules(
            new ModuleExample()
        );
    }

    public static void registerCategories() {
        addCategories(
            SKIDCAT
        );
    }

    public static void addCategories(Category... category) {
        for (Category category1 : category) {
            Modules.registerCategory(category1);
        }
    }

    public static void addModules(Module... module) {
        Modules modules = Modules.get();

        for (Module module1 : module) {
            modules.add(module1);
        }
    }
}
