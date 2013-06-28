package rebelkeithy.mods.fossilizedtrees.blocks;

import java.util.Random;

import rebelkeithy.mods.fossilizedtrees.FossilizedTreesBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FossilizedLeavesBlock extends Block
{

	public FossilizedLeavesBlock(int par1) 
	{
		super(par1, Material.rock);
	}

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return par1Random.nextInt(20) == 0 ? 1 : 0;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return FossilizedTreesBlocks.fossilizedSapling.blockID;
    }
	
}
