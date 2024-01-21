package net.squadeldee.aquaticbrilliance.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AquaticBrilliance_TAB = new CreativeModeTab("aquaticbrilliancetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SUNFISHSPAWNEGG.get());
        }
    };
}
