package com.gtm;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gtm.common.data.GTMCreativeTab;
import com.gtm.common.data.GTMItems;
import com.gtm.common.data.GTMMaterials;
import com.gtm.common.data.GTMRecipeTypes;
import com.gtm.common.data.machines.GTMMultiblockMachines;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("removal")
@Mod(GTMekanism.MODID)
public class GTMekanism {
    public static final String MODID = "gtm";
    public static final String MOD_NAME = "GTMekanism";
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
    public static GTRegistrate REGISTRATE = GTRegistrate.create(MODID);
    public static MaterialRegistry MATERIAL_REGISTRY;

    public GTMekanism() {
        GTMekanism.init();
        var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.register(this);
        eventBus.addGenericListener(GTRecipeType.class, this::registerRecipeTypes);
        eventBus.addGenericListener(MachineDefinition.class, this::registerMachines);

        MinecraftForge.EVENT_BUS.register(this);
        REGISTRATE.registerRegistrate();
    }

    public static void init() {
        GTMItems.init();
        GTMCreativeTab.init();
        GTMekanism.REGISTRATE.registerRegistrate();
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

    @SubscribeEvent
    public void registerMaterialReg(MaterialRegistryEvent event) {
        MATERIAL_REGISTRY = GTCEuAPI.materialManager.createRegistry(MODID);
    }

    @SubscribeEvent
    public void registerMaterials(MaterialEvent event) {
        GTMMaterials.init();
    }

    @SubscribeEvent
    public void registerRecipeTypes(GTCEuAPI.RegisterEvent<ResourceLocation, GTRecipeType> event) {
        GTMRecipeTypes.init();
    }

    @SubscribeEvent
    public void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
        GTMMultiblockMachines.init();
    }
}
