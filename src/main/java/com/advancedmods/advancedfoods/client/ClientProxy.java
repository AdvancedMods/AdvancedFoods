package com.advancedmods.advancedfoods.client;

import com.advancedmods.advancedfoods.common.CommonProxy;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Dennisbonke on 11-2-2015.
 */
public class ClientProxy extends CommonProxy {

	public World getClientWorld() {
		return FMLClientHandler.instance().getClient().theWorld;
	}

	public EntityPlayer getPlayer() {
		return FMLClientHandler.instance().getClient().thePlayer;
	}

}
