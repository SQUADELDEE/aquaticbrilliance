package net.squadeldee.aquaticbrilliance.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.squadeldee.aquaticbrilliance.AquaticBrilliance;
import net.squadeldee.aquaticbrilliance.entity.ModEntityTypes;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AquaticBrilliance.MOD_ID);


    public static final RegistryObject<Item> SUNFISHSPAWNEGG = ITEMS.register("sunfishspawnegg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SUNFISH,0xffd700, 0xbf9000,
                    new Item.Properties().tab(ModCreativeModeTab.AquaticBrilliance_TAB)));
    public static final RegistryObject<Item> SAILFISHSPAWNEGG = ITEMS.register("sailfishspawnegg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SAILFISH,0xffd700, 0xbf9000,
                    new Item.Properties().tab(ModCreativeModeTab.AquaticBrilliance_TAB)));
    public static final RegistryObject<Item> MACKERELSPAWNEGG = ITEMS.register("mackerelspawnegg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MACKEREL,0xffd700, 0xbf9000,
                    new Item.Properties().tab(ModCreativeModeTab.AquaticBrilliance_TAB)));
    public static final RegistryObject<Item> TRIGGERFISHSPAWNEGG = ITEMS.register("triggerfishspawnegg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.TRIGGERFISH,0xffd700, 0xbf9000,
                    new Item.Properties().tab(ModCreativeModeTab.AquaticBrilliance_TAB)));








    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
