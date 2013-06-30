package rebelkeithy.mods.fossilizedtrees;

import java.io.File;

import net.minecraftforge.common.Configuration;
import rebelkeithy.mods.keithyutils.Config;

public class FossilizedTreesConfig extends Config
{
	
	public int logID = 750;
	public int leavesID = 751;
	public int sapplingID = 752;

	@Override
	protected void initValues(Configuration config)
	{
		logID = config.getBlock("Fossilized Log", logID).getInt();
		leavesID = config.getBlock("Fossilized Leaves", leavesID).getInt();
		sapplingID = config.getBlock("Fossilized Sappling", sapplingID).getInt();
	}
}
