package com.gtm.data.recipes;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import mekanism.common.registries.MekanismFluids;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gtm.common.data.GTMRecipeTypes.TURBINE_RECIPES;

public class TurbineRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        TURBINE_RECIPES.recipeBuilder("steam_to_energy_output")
                .inputFluids(GTMaterials.Steam.getFluid(500), MekanismFluids.STEAM.getFluidStack(500))
                .outputEU(-GTValues.V[GTValues.UHV])
                .duration(18432000)
                .save(provider);

        TURBINE_RECIPES.recipeBuilder("refinery_gas_to_energy_output")
                .inputFluids(GTMaterials.RefineryGas.getFluid(250))
                .outputEU(-GTValues.V[GTValues.UHV])
                .duration(27648000)
                .save(provider);

        TURBINE_RECIPES.recipeBuilder("natural_gas_to_energy_output")
                .inputFluids(GTMaterials.NaturalGas.getFluid(125))
                .outputEU(-GTValues.V[GTValues.UHV])
                .duration(41472000)
                .save(provider);
    }
}
