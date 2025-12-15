package com.gtm.common.data;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeSerializer;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;
import com.gtm.GTMekanism;
import com.lowdragmc.lowdraglib.gui.texture.ProgressTexture;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeType;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class GTMRecipeTypes {
    public static void init() {}

    public static final GTRecipeType LARGE_ENRICHING_RECIPES = register("large_enriching", MULTIBLOCK)
            .setMaxIOSize(1, 1, 0, 0)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setSlotOverlay(true, false, GuiTextures.SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_METALLURGIC_INFUSER_RECIPES = register("large_metallurgic_infuser", MULTIBLOCK)
            .setMaxIOSize(1, 1, 1, 0)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setSlotOverlay(true, false, GuiTextures.SLOT)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_PURIFICATION_RECIPES = register("large_purification", MULTIBLOCK)
            .setMaxIOSize(1, 2, 1, 0)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setSlotOverlay(true, false, GuiTextures.SLOT)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_ELECTRIC_PUMP_RECIPES = register("large_electric_pump", ELECTRIC)
            .setMaxIOSize(0, 0, 1, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setSlotOverlay(true, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_CHEMICAL_OXIDIZER_RECIPES = register("large_chemical_oxidizer", MULTIBLOCK)
            .setMaxIOSize(1, 0, 0, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setSlotOverlay(true, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_CHEMICAL_INFUSER_RECIPES = register("large_chemical_infuser", MULTIBLOCK)
            .setMaxIOSize(0, 0, 2, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setSlotOverlay(true, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_CHEMICAL_INJECTION_RECIPES = register("large_chemical_injection", MULTIBLOCK)
            .setMaxIOSize(1, 1, 1, 0)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setSlotOverlay(true, false, GuiTextures.SLOT)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_ELECTROLYTIC_SEPARATOR_RECIPES = register("large_electrolytic_separator", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 2)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setSlotOverlay(true, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_CHEMICAL_DISSOLUTION_RECIPES = register("large_chemical_dissolution", MULTIBLOCK)
            .setMaxIOSize(1, 0, 1, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setSlotOverlay(true, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_CHEMICAL_WASHER_RECIPES = register("large_chemical_washer", MULTIBLOCK)
            .setMaxIOSize(0, 0, 2, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setSlotOverlay(true, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_PRESSURIZED_REACTION_RECIPES = register("large_pressurized_reaction", MULTIBLOCK)
            .setMaxIOSize(1, 1, 2, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setSlotOverlay(true, false, GuiTextures.SLOT)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setSlotOverlay(true, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_ISOTOPIC_CENTRIFUGE_RECIPES = register("large_isotopic_centrifuge", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setSlotOverlay(true, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_EXTRACT, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.CENTRIFUGE);

    public static final GTRecipeType LARGE_SOLAR_NEUTRON_ACTIVATOR_RECIPES = register("large_solar_neutron_activator", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setSlotOverlay(true, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_ANTIPROTONIC_NUCLEOSYNTHESIZER_RECIPES = register("large_antiprotonic_nucleosynthesizer", MULTIBLOCK)
            .setMaxIOSize(1, 1, 1, 0)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setSlotOverlay(true, false, GuiTextures.SLOT)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_SPS_RECIPES = register("large_sps", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setSlotOverlay(true, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_THERMAL_EVAPORATION_RECIPES = register("large_thermal_evaporation", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setSlotOverlay(true, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType FISSION_REACTOR_RECIPES = register("fission_reactor", MULTIBLOCK)
            .setMaxIOSize(0, 0, 2, 2)
            .setEUIO(IO.NONE)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setSlotOverlay(true, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType GAS_BURNING_GENERATOR_RECIPES = register("gas_burning_generator", GENERATOR)
            .setMaxIOSize(0, 0, 1, 0)
            .setEUIO(IO.OUT)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType LARGE_BIO_GENERATOR_RECIPES = register("large_bio_generator", GENERATOR)
            .setMaxIOSize(1, 0, 1, 0)
            .setEUIO(IO.OUT)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType TURBINE_RECIPES = register("turbine", GENERATOR)
            .setMaxIOSize(0, 0, 1, 0)
            .setEUIO(IO.OUT)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.TURBINE);

    public static final GTRecipeType FUSION_REACTOR_RECIPES = register("fusion_reactor", GENERATOR)
            .setMaxIOSize(1, 0, 2, 1)
            .setEUIO(IO.OUT)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setSlotOverlay(true, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    @SuppressWarnings("deprecation")
    public static GTRecipeType register(String name, String group, RecipeType<?>... proxyRecipes) {
        var recipeType = new GTRecipeType(GTMekanism.id(name), group, proxyRecipes);
        GTRegistries.register(BuiltInRegistries.RECIPE_TYPE, recipeType.registryName, recipeType);
        GTRegistries.register(BuiltInRegistries.RECIPE_SERIALIZER, recipeType.registryName, new GTRecipeSerializer());
        GTRegistries.RECIPE_TYPES.register(recipeType.registryName, recipeType);
        return recipeType;
    }
}
