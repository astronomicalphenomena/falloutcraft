package astronomy.fallout

import net.minecraft.block.Block
import net.minecraft.item.Item
/**
 * @author xfeng
 */
class CommonProxy 
{
  def registerKeyBindings() {}
  def registerItemModels(items: Map[String, Item]): Unit = {}
  def registerBlockModels(blocks: Map[String, Block]): Unit = {}
  val guis:ModGuiHandler = null
}
