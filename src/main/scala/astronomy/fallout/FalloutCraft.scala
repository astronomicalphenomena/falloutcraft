package astronomy.fallout

import net.minecraft.init.Blocks
import net.minecraft.server.MinecraftServer
import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event._
import cpw.mods.fml.common.SidedProxy
import net.minecraftforge.common.MinecraftForge
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.FMLCommonHandler
import cpw.mods.fml.common.network.NetworkRegistry
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper
/**
  * Created by xfeng on 2016/7/3.
  */
@Mod(modid = "falloutcraft", name = "FalloutCraft", version = "0.0.0", modLanguage = "scala")
object FalloutCraft {
  @EventHandler def init(event: FMLInitializationEvent) {
    System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName)
  }
}
