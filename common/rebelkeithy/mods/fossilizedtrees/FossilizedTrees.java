package rebelkeithy.mods.fossilizedtrees;

import rebelkeithy.mods.fossilizedtrees.worldgen.WorldModGenSpiritTree;
import rebelkeithy.mods.keithyutils.CommonProxy;
import rebelkeithy.mods.keithyutils.CustomTab;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;



@Mod(modid = FossilizedTrees.MOD_ID, name = FossilizedTrees.MOD_NAME, version = FossilizedTrees.MOD_VERSION, dependencies = "required-after:Forge@[7.7.2.682,)")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class FossilizedTrees 
{
	public final static String MOD_ID = "FossiliedTrees";
	public final static String MOD_NAME = "Fossilised Trees";
	public final static String MOD_VERSION = "1.0.0";

	@Instance(MOD_ID)
	public static FossilizedTrees instance;

	//@SidedProxy(clientSide = "rebelkeithy.mods.fossilizedtrees.ClientProxy", serverSide = "rebelkeithy.mods.fossilizedtrees.CommonProxy")
	//public static CommonProxy proxy;
	
	public static CustomTab tab;
	public static FossilizedTreesConfig config;

	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		config = new FossilizedTreesConfig();
		config.init(event.getSuggestedConfigurationFile());
		tab = new CustomTab("Fossilized Trees");
		
		GameRegistry.registerWorldGenerator(new WorldModGenSpiritTree());
	}

	@Init
	public void load(FMLInitializationEvent event)
	{
		FossilizedTreesBlocks.init();
	}
}
