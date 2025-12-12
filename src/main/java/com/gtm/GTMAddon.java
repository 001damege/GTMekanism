package com.gtm;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

@GTAddon
public class GTMAddon implements IGTAddon {
    @Override
    public GTRegistrate getRegistrate() {
        return GTMekanism.REGISTRATE;
    }

    @Override
    public void initializeAddon() {
        GTMekanism.LOGGER.info("GTMekanism Additions addon has loaded!");
    }

    @Override
    public String addonModId() {
        return GTMekanism.MODID;
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {

    }
}
