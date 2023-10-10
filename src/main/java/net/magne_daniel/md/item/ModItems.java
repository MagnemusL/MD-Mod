package net.magne_daniel.md.item;

import net.magne_daniel.md.MD;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MD.MOD_ID);


    public static final RegistryObject<Item> CANDY_SWORD = ITEMS.register("candy_sword",
            () -> new SwordItem(Tiers.DIAMOND, 10, 5f, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CANDY_PICKAXE = ITEMS.register("candy_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 10, 5f,new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CANDY_SHOVEL = ITEMS.register("candy_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, 10, 5f, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CANDY_HOE = ITEMS.register("candy_hoe",
            () -> new HoeItem(Tiers.DIAMOND, 10, 5f, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}

}
