package com.fernirsmodz.fernirsarmors.block;

import com.fernirsmodz.fernirsarmors.FernirsArmors;
import com.fernirsmodz.fernirsarmors.item.ModItemGroup;
import com.fernirsmodz.fernirsarmors.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, FernirsArmors.MOD_ID);

    public static final RegistryObject<Block> MITHRIL_ORE = registerBlock( "mithril_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).
            harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        RegisterBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void RegisterBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroup.FERNIRS_GROUP)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
