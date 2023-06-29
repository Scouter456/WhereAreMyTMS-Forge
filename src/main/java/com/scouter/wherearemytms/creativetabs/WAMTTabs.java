package com.scouter.wherearemytms.creativetabs;

import com.scouter.wherearemytms.WhereAreMyTMs;
import com.scouter.wherearemytms.items.WAMTItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.scouter.wherearemytms.WhereAreMyTMs.prefix;

@Mod.EventBusSubscriber(modid = WhereAreMyTMs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WAMTTabs {

    @SubscribeEvent
    public static void registerCreativeTabs(CreativeModeTabEvent.BuildContents event){
        if(event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(WAMTItems.BLANK_HM);
            event.accept(WAMTItems.BLANK_TM);
            event.accept(WAMTItems.TM_MACHINE_BLOCK);
        }
    }
}
