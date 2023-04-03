package com.colgrolool.skidware.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import meteordevelopment.meteorclient.systems.commands.Command;
import net.minecraft.command.CommandSource;
import net.minecraft.util.math.BlockPos;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;

public class CoordsCommand extends Command {
    public CoordsCommand() {
        super("coords", "Copy your current coordinates to the clipboard.", "coordinates", "position", "pos");
    }

    @Override
    public void build(LiteralArgumentBuilder<CommandSource> builder) {
        builder.executes(context -> copyPos());
        builder.then(literal("copy").executes(context -> copyPos()));
    }
    private String getPos() {
        BlockPos pos = mc.player.getBlockPos();
        return pos.getX() + ", " + pos.getY() + ", " + pos.getZ();
    }

    private int copyPos() {
        mc.keyboard.setClipboard(getPos());
        info("Successfully copied your current coords to the clipboard");
        return SINGLE_SUCCESS;
    }
}
