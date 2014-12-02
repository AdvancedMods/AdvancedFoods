package com.zandor300.advancedfoods.items.crop;

import com.zandor300.advancedfoods.generic.AFBlockCrop;
import com.zandor300.advancedfoods.initialization.ModItems;
import com.zandor300.advancedfoods.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

/**
 * Created by Zandor on 3-12-2014.
 */
public class CropChilli extends AFBlockCrop {
    public CropChilli() {
        // Basic block setup
        setBlockName("Chilli");
        setBlockTextureName(Reference.MOD_ID + ":chilli_0");
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
        iIcon[0] = parIIconRegister.registerIcon(Reference.MOD_ID + ":chilli_0");
        iIcon[1] = parIIconRegister.registerIcon(Reference.MOD_ID + ":chilli_0");
        iIcon[2] = parIIconRegister.registerIcon(Reference.MOD_ID + ":chilli_1");
        iIcon[3] = parIIconRegister.registerIcon(Reference.MOD_ID + ":chilli_1");
        iIcon[4] = parIIconRegister.registerIcon(Reference.MOD_ID + ":chilli_2");
        iIcon[5] = parIIconRegister.registerIcon(Reference.MOD_ID + ":chilli_2");
        iIcon[6] = parIIconRegister.registerIcon(Reference.MOD_ID + ":chilli_3");
        iIcon[7] = parIIconRegister.registerIcon(Reference.MOD_ID + ":chilli_3");
    }
}
