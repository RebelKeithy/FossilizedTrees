package rebelkeithy.mods.fossilizedtrees;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import rebelkeithy.mods.fossilizedtrees.blocks.BlockFossilizedLog;
import rebelkeithy.mods.fossilizedtrees.blocks.FossilizedLeavesBlock;
import rebelkeithy.mods.fossilizedtrees.blocks.FossilizedSapling;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class FossilizedTreesBlocks 
{
	public static Block fossilizedLog;
	public static Block fossilizedLeaves;
	public static Block fossilizedSapling;
	
	public static void init()
	{
		fossilizedLog = new BlockFossilizedLog(FossilizedTrees.config.logID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("FossilizedTrees:log").setCreativeTab(FossilizedTrees.tab);
		fossilizedLeaves = new FossilizedLeavesBlock(FossilizedTrees.config.leavesID).setHardness(1.0F).setResistance(5.0F).setUnlocalizedName("FossilizedTrees:leaves").setCreativeTab(FossilizedTrees.tab);
		fossilizedSapling = new FossilizedSapling(FossilizedTrees.config.sapplingID).setHardness(0.2F).setUnlocalizedName("FossilizedTrees:sapling").setCreativeTab(FossilizedTrees.tab);
	
		GameRegistry.registerBlock(fossilizedLog, "FossilizedLog");
		GameRegistry.registerBlock(fossilizedLeaves, "FossilizedLeaves");
		GameRegistry.registerBlock(fossilizedSapling, "FossilizedSapling");
	
		LanguageRegistry.addName(fossilizedLog, "Fossilized Log");
		LanguageRegistry.addName(fossilizedLeaves, "Fossilized Leaves");
		LanguageRegistry.addName(fossilizedSapling, "Fossilized Sappling");
	}
}
