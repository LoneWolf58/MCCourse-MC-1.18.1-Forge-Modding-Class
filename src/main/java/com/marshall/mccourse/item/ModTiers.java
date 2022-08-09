package com.marshall.mccourse.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers
{
    public static final ForgeTier COBALT = new ForgeTier(1, 1500, 1f,
            4f, 10, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.COBALT_INGOT.get()));

}
