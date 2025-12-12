package com.gtm.common.data;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.gtm.GTMekanism;
import com.tterrag.registrate.util.entry.RegistryEntry;
import mekanism.common.registries.MekanismItems;
import net.minecraft.world.item.CreativeModeTab;

public class GTMCreativeTab {
    public static RegistryEntry<CreativeModeTab> GTM = GTMekanism.REGISTRATE.defaultCreativeTab("main",
            builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator("main", GTMekanism.REGISTRATE))
                    .icon(MekanismItems.ANTIMATTER_PELLET::getItemStack)
                    .title(GTMekanism.REGISTRATE.addLang("itemGroup", GTMekanism.id("main"), "GTMekanism"))
                    .build())
            .register();
}
