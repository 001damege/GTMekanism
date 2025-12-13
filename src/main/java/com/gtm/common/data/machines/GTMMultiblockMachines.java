package com.gtm.common.data.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.MultiblockShapeInfo;
import com.gregtechceu.gtceu.api.pattern.Predicates;
import com.gregtechceu.gtceu.common.data.GCYMBlocks;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTRecipeModifiers;
import com.gtm.common.data.GTMCreativeTab;
import com.gtm.common.data.GTMRecipeTypes;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.List;

import static com.gtm.GTMekanism.REGISTRATE;

public class GTMMultiblockMachines {
    public static void init() {
        REGISTRATE.creativeModeTab(() -> GTMCreativeTab.GTM);
    }

    public static final MultiblockMachineDefinition FUSION_REACTOR = REGISTRATE
            .multiblock("fusion_reactor", WorkableElectricMultiblockMachine::new)
            .langValue("Fusion Reactor")
            .rotationState(RotationState.ALL)
            .recipeType(GTMRecipeTypes.FUSION_REACTOR_RECIPES)
            .recipeModifiers(GTRecipeModifiers.PARALLEL_HATCH, GTRecipeModifiers.BATCH_MODE)
            .appearanceBlock(GCYMBlocks.CASING_ATOMIC)
            .pattern(def -> FactoryBlockPattern.start()
                    .aisle("##A##", "#ACA#", "ACCCA", "#ACA#", "##A##")
                    .aisle("#ACA#", "A###A", "C###C", "A###A", "#ACA#")
                    .aisle("ACCCA", "C###C", "C###C", "C###C", "ACDCA")
                    .aisle("#ACA#", "A###A", "C###C", "A###A", "#ACA#")
                    .aisle("##A##", "#ACA#", "ACCCA", "#ACA#", "##A##")
                    .where('#', Predicates.any())
                    .where('A', Predicates.blocks(GCYMBlocks.CASING_ATOMIC.get()))
                    .where('C', Predicates.blocks(GTBlocks.FUSION_GLASS.get()))
                    .where('D', Predicates.controller(Predicates.blocks(def.getBlock())))
                    .build())
            .shapeInfos(def -> {
                List<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
                var builder = MultiblockShapeInfo.builder()
                        .aisle("##A##", "#ACA#", "ACCCA", "#ACA#", "##A##")
                        .aisle("#ACA#", "A###A", "C###C", "A###A", "#ACA#")
                        .aisle("ACCCA", "C###C", "C###C", "C###C", "AIDOA")
                        .aisle("#ACA#", "A###A", "C###C", "A###A", "#ACA#")
                        .aisle("##A##", "#ACA#", "ACCCA", "#ACA#", "##A##")
                        .where('#', Blocks.AIR.defaultBlockState())
                        .where('A', GCYMBlocks.CASING_ATOMIC.getDefaultState())
                        .where('C', GTBlocks.FUSION_GLASS.getDefaultState())
                        .where('D', def, Direction.UP)
                        .where('I', GTMachines.FLUID_IMPORT_HATCH[GTValues.LV], Direction.UP)
                        .where('O', GTMachines.ENERGY_OUTPUT_HATCH[GTValues.LV], Direction.UP);
                shapeInfo.add(builder.build());
                return shapeInfo;
            })
            .workableCasingModel(GTCEu.id("block/casings/gcym/atomic_casing"), GTCEu.id("block/multiblock/fusion_reactor"))
            .register();
}
