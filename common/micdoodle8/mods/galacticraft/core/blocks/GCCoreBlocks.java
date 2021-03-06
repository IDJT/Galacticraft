package micdoodle8.mods.galacticraft.core.blocks;

import java.util.ArrayList;
import micdoodle8.mods.galacticraft.core.GCCoreConfigManager;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.core.items.GCCoreItemBlock;
import micdoodle8.mods.galacticraft.core.items.GCCoreItemBlockBase;
import micdoodle8.mods.galacticraft.core.items.GCCoreItemBlockBasicMachine;
import micdoodle8.mods.galacticraft.core.items.GCCoreItemBlockCargoLoader;
import micdoodle8.mods.galacticraft.core.items.GCCoreItemBlockCopperWire;
import micdoodle8.mods.galacticraft.core.items.GCCoreItemBlockEnclosedBlock;
import micdoodle8.mods.galacticraft.core.items.GCCoreItemBlockLandingPad;
import micdoodle8.mods.galacticraft.core.items.GCCoreItemBlockSolar;
import micdoodle8.mods.galacticraft.core.util.GCCoreUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Copyright 2012-2013, micdoodle8
 * 
 * All rights reserved.
 * 
 */
public class GCCoreBlocks
{
    public static Block breatheableAir;
    public static Block treasureChestTier1;
    public static Block landingPad;
    public static Block unlitTorch;
    public static Block unlitTorchLit;
    public static Block oxygenDistributor;
    public static Block oxygenPipe;
    public static Block oxygenCollector;
    public static Block oxygenCompressor;
    public static Block oxygenSealer;
    public static Block oxygenDetector;
    public static Block nasaWorkbench;
    public static Block fallenMeteor;
    public static Block decorationBlocks;
    public static Block airLockFrame;
    public static Block airLockSeal;
    public static Block crudeOilStill;
    public static Block refinery;
    public static Block fuelLoader;
    public static Block landingPadFull;
    public static Block spaceStationBase;
    public static Block fakeBlock;
    public static Block sealableBlock;
    public static Block cargoLoader;
    public static Block parachest;
    public static Block solarPanel;
    public static Block blockMachineBase;
    public static Block blockCopperWire;

    public static Material crudeOil = new MaterialLiquid(MapColor.foliageColor);
    public static ArrayList<Integer> hiddenBlocks = new ArrayList<Integer>();

    public static void initBlocks()
    {
        GCCoreBlocks.breatheableAir =               new GCCoreBlockBreathableAir(               GCCoreConfigManager.idBlockBreatheableAir,                      "breatheableAir");
        GCCoreBlocks.treasureChestTier1 =           new GCCoreBlockT1TreasureChest(             GCCoreConfigManager.idBlockTreasureChest,                       "treasureChest");
        GCCoreBlocks.landingPad =                   new GCCoreBlockLandingPad(                  GCCoreConfigManager.idBlockLandingPad,                          "landingPad");
        GCCoreBlocks.landingPadFull =               new GCCoreBlockLandingPadFull(              GCCoreConfigManager.idBlockLandingPadFull,                      "landingPadFull");
        GCCoreBlocks.unlitTorch =                   new GCCoreBlockUnlitTorch(                  GCCoreConfigManager.idBlockUnlitTorch,          false,          "unlitTorch");
        GCCoreBlocks.unlitTorchLit =                new GCCoreBlockUnlitTorch(                  GCCoreConfigManager.idBlockUnlitTorchLit,       true,           "unlitTorchLit");
        GCCoreBlocks.oxygenDistributor =            new GCCoreBlockOxygenDistributor(           GCCoreConfigManager.idBlockAirDistributor,                      "distributor");
        GCCoreBlocks.oxygenPipe =                   new GCCoreBlockOxygenPipe(                  GCCoreConfigManager.idBlockAirPipe,                             "oxygenPipe");
        GCCoreBlocks.oxygenCollector =              new GCCoreBlockOxygenCollector(             GCCoreConfigManager.idBlockAirCollector,                        "oxygenCollector");
        GCCoreBlocks.nasaWorkbench =                new GCCoreBlockAdvancedCraftingTable(       GCCoreConfigManager.idBlockRocketBench,                         "rocketWorkbench");
        GCCoreBlocks.fallenMeteor =                 new GCCoreBlockFallenMeteor(                GCCoreConfigManager.idBlockFallenMeteor,                        "fallenMeteor");
        GCCoreBlocks.decorationBlocks =             new GCCoreBlock(                            GCCoreConfigManager.idBlockDecorationBlock,                     "decorationblock");
        GCCoreBlocks.airLockFrame =                 new GCCoreBlockAirLockFrame(                GCCoreConfigManager.idBlockAirLockFrame,                        "airLockFrame");
        GCCoreBlocks.airLockSeal =                  new GCCoreBlockAirLockWall(                 GCCoreConfigManager.idBlockAirLockSeal,                         "airLockSeal");
        GCCoreBlocks.crudeOilStill =                new GCCoreBlockCrudeOil(                    GalacticraftCore.CRUDEOIL.getBlockID(),                         "crudeOilStill");
        GCCoreBlocks.refinery =                     new GCCoreBlockRefinery(                    GCCoreConfigManager.idBlockRefinery,                            "refinery");
        GCCoreBlocks.oxygenCompressor =             new GCCoreBlockOxygenCompressor(            GCCoreConfigManager.idBlockAirCompressor,       false,          "oxygenCompressor");
        GCCoreBlocks.fuelLoader =                   new GCCoreBlockFuelLoader(                  GCCoreConfigManager.idBlockFuelLoader,                          "fuelLoader");
        GCCoreBlocks.spaceStationBase =             new GCCoreBlockSpaceStationBase(            GCCoreConfigManager.idBlockSpaceStationBase,                    "spaceStationBase");
        GCCoreBlocks.fakeBlock =                    new GCCoreBlockMulti(                       GCCoreConfigManager.idBlockDummy,                               "dummyblock");
        GCCoreBlocks.oxygenSealer =                 new GCCoreBlockOxygenSealer(                GCCoreConfigManager.idBlockOxygenSealer,                        "sealer");
        GCCoreBlocks.sealableBlock =                new GCCoreBlockEnclosed(                    GCCoreConfigManager.idBlockEnclosedWire,                        "enclosed");
        GCCoreBlocks.oxygenDetector =               new GCCoreBlockOxygenDetector(              GCCoreConfigManager.idBlockOxygenDetector,                      "oxygenDetector");
        GCCoreBlocks.cargoLoader =                  new GCCoreBlockCargoLoader(                 GCCoreConfigManager.idBlockCargoLoader,                         "cargo");
        GCCoreBlocks.parachest =                    new GCCoreBlockParachest(                   GCCoreConfigManager.idBlockParachest,                           "parachest");
        GCCoreBlocks.solarPanel =                   new GCCoreBlockSolar(                       GCCoreConfigManager.idBlockSolarPanel,                          "solar");
        GCCoreBlocks.blockMachineBase =             new GCCoreBlockBasicMachine(                GCCoreConfigManager.idBlockBasicMachine,                        "machine");
        GCCoreBlocks.blockCopperWire =              new GCCoreBlockCopperWire(                  GCCoreConfigManager.idBlockCopperWire,                          "copperWire");

        GCCoreUtil.registerGalacticraftBlock("rocketLaunchPad", GCCoreBlocks.landingPad, 0);
        GCCoreUtil.registerGalacticraftBlock("buggyFuelingPad", GCCoreBlocks.landingPad, 1);
        GCCoreUtil.registerGalacticraftBlock("oxygenDistributor", GCCoreBlocks.oxygenDistributor);
        GCCoreUtil.registerGalacticraftBlock("oxygenCompressor", GCCoreBlocks.oxygenCompressor);
        GCCoreUtil.registerGalacticraftBlock("oxygenCollector", GCCoreBlocks.oxygenCollector);
        GCCoreUtil.registerGalacticraftBlock("refinery", GCCoreBlocks.refinery);
        GCCoreUtil.registerGalacticraftBlock("fuelLoader", GCCoreBlocks.fuelLoader);
        GCCoreUtil.registerGalacticraftBlock("oxygenSealer", GCCoreBlocks.oxygenSealer);
        GCCoreUtil.registerGalacticraftBlock("oxygenDetector", GCCoreBlocks.oxygenDetector);
        GCCoreUtil.registerGalacticraftBlock("cargoLoader", GCCoreBlocks.cargoLoader, 0);
        GCCoreUtil.registerGalacticraftBlock("cargoUnloader", GCCoreBlocks.cargoLoader, 4);
        GCCoreUtil.registerGalacticraftBlock("oxygenPipe", GCCoreBlocks.oxygenPipe);
        GCCoreUtil.registerGalacticraftBlock("nasaWorkbench", GCCoreBlocks.nasaWorkbench);
        GCCoreUtil.registerGalacticraftBlock("fallenMeteor", GCCoreBlocks.fallenMeteor);
        GCCoreUtil.registerGalacticraftBlock("tinDecorationBlock1", GCCoreBlocks.decorationBlocks, 3);
        GCCoreUtil.registerGalacticraftBlock("tinDecorationBlock2", GCCoreBlocks.decorationBlocks, 4);
        GCCoreUtil.registerGalacticraftBlock("airLockFrame", GCCoreBlocks.airLockFrame);
        GCCoreUtil.registerGalacticraftBlock("sealableCopperWire", GCCoreBlocks.sealableBlock, 0);
        GCCoreUtil.registerGalacticraftBlock("sealableOxygenPipe", GCCoreBlocks.sealableBlock, 1);
        GCCoreUtil.registerGalacticraftBlock("sealableCopperCable", GCCoreBlocks.sealableBlock, 2);
        GCCoreUtil.registerGalacticraftBlock("sealableGoldCable", GCCoreBlocks.sealableBlock, 3);
        GCCoreUtil.registerGalacticraftBlock("sealableHighVoltageCable", GCCoreBlocks.sealableBlock, 4);
        GCCoreUtil.registerGalacticraftBlock("sealableGlassFibreCable", GCCoreBlocks.sealableBlock, 5);
        GCCoreUtil.registerGalacticraftBlock("sealableLowVoltageCable", GCCoreBlocks.sealableBlock, 6);
        GCCoreUtil.registerGalacticraftBlock("sealableStonePipeItem", GCCoreBlocks.sealableBlock, 7);
        GCCoreUtil.registerGalacticraftBlock("sealableCobblestonePipeItem", GCCoreBlocks.sealableBlock, 8);
        GCCoreUtil.registerGalacticraftBlock("sealableStonePipeFluid", GCCoreBlocks.sealableBlock, 9);
        GCCoreUtil.registerGalacticraftBlock("sealableCobblestonePipeFluid", GCCoreBlocks.sealableBlock, 10);
        GCCoreUtil.registerGalacticraftBlock("sealableStonePipePower", GCCoreBlocks.sealableBlock, 11);
        GCCoreUtil.registerGalacticraftBlock("sealableGoldPipePower", GCCoreBlocks.sealableBlock, 12);
        GCCoreUtil.registerGalacticraftBlock("treasureChestTier1", GCCoreBlocks.treasureChestTier1);
        GCCoreUtil.registerGalacticraftBlock("parachest", GCCoreBlocks.parachest);
        GCCoreUtil.registerGalacticraftBlock("solarPanelBasic", GCCoreBlocks.solarPanel, 0);
        GCCoreUtil.registerGalacticraftBlock("solarPanelAdvanced", GCCoreBlocks.solarPanel, 4);
        GCCoreUtil.registerGalacticraftBlock("copperWire", GCCoreBlocks.blockCopperWire);
        GCCoreUtil.registerGalacticraftBlock("coalGenerator", GCCoreBlocks.blockMachineBase, 0);
        GCCoreUtil.registerGalacticraftBlock("batteryBox", GCCoreBlocks.blockMachineBase, 4);
        GCCoreUtil.registerGalacticraftBlock("electricFurnace", GCCoreBlocks.blockMachineBase, 8);
        
        // Hide certain items from NEI
        GCCoreBlocks.hiddenBlocks.add(GCCoreBlocks.airLockSeal.blockID);
        GCCoreBlocks.hiddenBlocks.add(GCCoreBlocks.breatheableAir.blockID);
        GCCoreBlocks.hiddenBlocks.add(GCCoreBlocks.unlitTorch.blockID);
        GCCoreBlocks.hiddenBlocks.add(GCCoreBlocks.unlitTorchLit.blockID);
        GCCoreBlocks.hiddenBlocks.add(GCCoreBlocks.landingPadFull.blockID);
        GCCoreBlocks.hiddenBlocks.add(GCCoreBlocks.fakeBlock.blockID);
        GCCoreBlocks.hiddenBlocks.add(GCCoreBlocks.spaceStationBase.blockID);

        OreDictionary.registerOre("copperWire", GCCoreBlocks.blockCopperWire);
        
        GCCoreBlocks.setHarvestLevels();
        GCCoreBlocks.registerBlocks();
    }

    public static void setHarvestLevels()
    {
        MinecraftForge.setBlockHarvestLevel(GCCoreBlocks.decorationBlocks, 0, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(GCCoreBlocks.decorationBlocks, 1, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(GCCoreBlocks.decorationBlocks, 2, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(GCCoreBlocks.fallenMeteor, "pickaxe", 3);
    }

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(GCCoreBlocks.treasureChestTier1, GCCoreItemBlock.class, GCCoreBlocks.treasureChestTier1.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.landingPad, GCCoreItemBlockLandingPad.class, GCCoreBlocks.landingPad.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.landingPadFull, GCCoreItemBlock.class, GCCoreBlocks.landingPadFull.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.unlitTorch, GCCoreItemBlock.class, GCCoreBlocks.unlitTorch.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.unlitTorchLit, GCCoreItemBlock.class, GCCoreBlocks.unlitTorchLit.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.breatheableAir, GCCoreItemBlock.class, GCCoreBlocks.breatheableAir.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.oxygenDistributor, GCCoreItemBlock.class, GCCoreBlocks.oxygenDistributor.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.oxygenPipe, GCCoreItemBlock.class, GCCoreBlocks.oxygenPipe.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.oxygenCollector, GCCoreItemBlock.class, GCCoreBlocks.oxygenCollector.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.nasaWorkbench, GCCoreItemBlock.class, GCCoreBlocks.nasaWorkbench.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.fallenMeteor, GCCoreItemBlock.class, GCCoreBlocks.fallenMeteor.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.airLockFrame, GCCoreItemBlock.class, GCCoreBlocks.airLockFrame.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.airLockSeal, GCCoreItemBlock.class, GCCoreBlocks.airLockSeal.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.crudeOilStill, GCCoreItemBlock.class, GCCoreBlocks.crudeOilStill.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.refinery, GCCoreItemBlock.class, GCCoreBlocks.refinery.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.oxygenCompressor, GCCoreItemBlock.class, GCCoreBlocks.oxygenCompressor.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.decorationBlocks, GCCoreItemBlockBase.class, GCCoreBlocks.decorationBlocks.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.fuelLoader, GCCoreItemBlock.class, GCCoreBlocks.fuelLoader.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.spaceStationBase, GCCoreItemBlock.class, GCCoreBlocks.spaceStationBase.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.fakeBlock, GCCoreItemBlock.class, GCCoreBlocks.fakeBlock.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.oxygenSealer, GCCoreItemBlock.class, GCCoreBlocks.oxygenSealer.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.sealableBlock, GCCoreItemBlockEnclosedBlock.class, GCCoreBlocks.sealableBlock.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.oxygenDetector, GCCoreItemBlock.class, GCCoreBlocks.oxygenDetector.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.cargoLoader, GCCoreItemBlockCargoLoader.class, GCCoreBlocks.cargoLoader.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.parachest, GCCoreItemBlock.class, GCCoreBlocks.parachest.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.solarPanel, GCCoreItemBlockSolar.class, GCCoreBlocks.solarPanel.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.blockMachineBase, GCCoreItemBlockBasicMachine.class, GCCoreBlocks.blockMachineBase.getUnlocalizedName(), GalacticraftCore.MODID);
        GameRegistry.registerBlock(GCCoreBlocks.blockCopperWire, GCCoreItemBlockCopperWire.class, GCCoreBlocks.blockCopperWire.getUnlocalizedName(), GalacticraftCore.MODID);
    }
}
