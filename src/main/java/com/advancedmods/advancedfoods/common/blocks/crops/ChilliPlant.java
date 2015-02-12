package com.advancedmods.advancedfoods.common.blocks.crops;

import com.advancedmods.advancedfoods.common.generic.AFBlockCrop;
import com.advancedmods.advancedfoods.common.init.ModItems;
import com.advancedmods.advancedfoods.core.AFProps;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

/**
 * Created by Dennisbonke on 12-2-2015.
 */
public class ChilliPlant extends AFBlockCrop {

	public ChilliPlant() {
		// Basic block setup
		this.setBlockName("chilliplant");
		this.setBlockTextureName(AFProps.modid.toLowerCase() + ":chilli_0");
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(int parMetadata, int parFortune, Random parRand) {
		return (parMetadata / 2);
	}

	@Override
	public Item getItemDropped(int parMetadata, Random parRand, int parFortune) {
		return (ModItems.chilli);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister parIIconRegister) {
		iIcon = new IIcon[maxGrowthStage + 1];
		iIcon[0] = parIIconRegister.registerIcon(AFProps.modid.toLowerCase() + ":chilli_0");
		iIcon[1] = parIIconRegister.registerIcon(AFProps.modid.toLowerCase() + ":chilli_0");
		iIcon[2] = parIIconRegister.registerIcon(AFProps.modid.toLowerCase() + ":chilli_1");
		iIcon[3] = parIIconRegister.registerIcon(AFProps.modid.toLowerCase() + ":chilli_1");
		iIcon[4] = parIIconRegister.registerIcon(AFProps.modid.toLowerCase() + ":chilli_2");
		iIcon[5] = parIIconRegister.registerIcon(AFProps.modid.toLowerCase() + ":chilli_2");
		iIcon[6] = parIIconRegister.registerIcon(AFProps.modid.toLowerCase() + ":chilli_3");
		iIcon[7] = parIIconRegister.registerIcon(AFProps.modid.toLowerCase() + ":chilli_3");
	}

}
