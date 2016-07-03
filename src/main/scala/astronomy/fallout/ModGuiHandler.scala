package astronomy.fallout

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.client.gui.achievement._;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.IGuiHandler;

/**
 * @author xfeng
 */
class ModGuiHandler extends IGuiHandler
{
	def getServerGuiElement ( ID:Int, player:EntityPlayer, world:World, x:Int, y:Int, z:Int ) : Object =
    {
      null
    }
  def getClientGuiElement ( ID:Int, player:EntityPlayer, world:World, x:Int, y:Int, z:Int ) : Object =
    {
      ID match{
        case 999=>new GuiAchievements(null,Minecraft.getMinecraft.thePlayer.getStatFileWriter())
      }
    }
}