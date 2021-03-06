package com.teamacronymcoders.multiblockstages;

import com.teamacronymcoders.multiblockstages.immersiveengineering.IEMultiBlockSupport;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.teamacronymcoders.multiblockstages.MultiBlockStages.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = VERSION, dependencies = DEPENDS)
public class MultiBlockStages {
    public static final String MOD_ID = "multiblockstages";
    public static final String MOD_NAME = "MultiBlock Stages";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDS = "required-after:gamestages@[2.0.0,);after:immersiveengineering";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        if (Loader.isModLoaded("immersiveengineering")) {
            IEMultiBlockSupport.setup();
        }
    }
}
