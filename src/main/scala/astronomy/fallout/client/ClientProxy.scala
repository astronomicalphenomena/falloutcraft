package astronomy.fallout.client

import astronomy.fallout._
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.client.Minecraft

/**
 * @author xfeng
 */
class ClientProxy extends CommonProxy {
  override val guis: ModGuiHandler = new ModGuiHandler

/*  override def registerKeyBindings() {
    KeyBindings.init()
  }

  override def registerItemModels(items: Map[String, Item]): Unit = {
    for (it <- items) {
      Minecraft.getMinecraft.getRenderItem.getItemModelMesher.register(it._2, 0,
        new ModelResourceLocation("taocraft:" + it._1, "inventory"))
      ModelBakery.addVariantName(it._2, "taocraft:" + it._1)
    }
  }

  override def registerBlockModels(blocks: Map[String, Block]): Unit = {
    for (blk <- blocks)
      Minecraft.getMinecraft.getRenderItem.getItemModelMesher.register(Item.getItemFromBlock(blk._2), 0,
        new ModelResourceLocation("taocraft:" + blk._1, "inventory"))
  }*/
}
