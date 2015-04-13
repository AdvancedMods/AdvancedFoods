package com.advancedmods.advancedfoods.common.generic;

import com.advancedmods.advancedfoods.AdvancedFoods;
import com.advancedmods.advancedfoods.core.AFProps;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

/**
 * Created by Dennisbonke on 11-2-2015.
 */
public class AFItemFood extends ItemFood {

	public AFItemFood(int id, boolean b) {
		super(id, b);
		this.setCreativeTab(AdvancedFoods.food);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", AFProps.modid.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return String.format("item.%s%s", AFProps.modid.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}
