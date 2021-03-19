package com.mystic.atlantis.init;

import java.util.Objects;
import java.util.function.Function;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import com.mystic.atlantis.blocks.AncientWood;
import com.mystic.atlantis.blocks.AquamarineOre;
import com.mystic.atlantis.blocks.AtlanteanCore;
import com.mystic.atlantis.blocks.AtlantisPortalBlock;
import com.mystic.atlantis.blocks.BlockAquamarine;
import com.mystic.atlantis.blocks.ColoredShellBlocks;
import com.mystic.atlantis.blocks.OceanLantern;
import com.mystic.atlantis.blocks.OysterShellBlock;
import com.mystic.atlantis.blocks.PearlBlocks;
import com.mystic.atlantis.blocks.plants.Algae;
import com.mystic.atlantis.blocks.plants.UnderwaterFlower;
import com.mystic.atlantis.util.Reference;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class BlockInit {
    public static final AncientWood ANCIENT_ACACIA_WOOD_MOSS = (AncientWood) register("ancient_acacia_wood_moss", new AncientWood(FabricBlockSettings.of(Material.WOOD)));
    public static final AncientWood ANCIENT_OAK_WOOD_MOSS = (AncientWood) register("ancient_oak_wood_moss", new AncientWood(FabricBlockSettings.of(Material.WOOD)));
    public static final AncientWood ANCIENT_JUNGLE_WOOD_MOSS = (AncientWood) register("ancient_jungle_wood_moss", new AncientWood(FabricBlockSettings.of(Material.WOOD)));
    public static final AncientWood ANCIENT_SPRUCE_WOOD_MOSS = (AncientWood) register("ancient_spruce_wood_moss", new AncientWood(FabricBlockSettings.of(Material.WOOD)));
    public static final AncientWood ANCIENT_BIRCH_WOOD_MOSS = (AncientWood) register("ancient_birch_wood_moss", new AncientWood(FabricBlockSettings.of(Material.WOOD)));
    public static final AncientWood ANCIENT_DARK_OAK_WOOD_MOSS = (AncientWood) register("ancient_dark_oak_wood_moss", new AncientWood(FabricBlockSettings.of(Material.WOOD)));
    public static final AquamarineOre AQUAMARINE_ORE = (AquamarineOre) register("aquamarine_ore", new AquamarineOre(FabricBlockSettings.of(Material.STONE)));
    public static final OceanLantern OCEAN_LANTERN = (OceanLantern) register("ocean_lantern", new OceanLantern(FabricBlockSettings.of(Material.METAL)));
    public static final AtlanteanCore ATLANTEAN_CORE = (AtlanteanCore) register("atlantean_core", new AtlanteanCore(FabricBlockSettings.of(Material.GLASS)));
    public static final BlockAquamarine BLOCK_OF_AQUAMARINE = (BlockAquamarine) register("block_of_aquamarine", new BlockAquamarine(FabricBlockSettings.of(Material.METAL)));
    public static final BlockAquamarine CHISELED_GOLDEN_BLOCK = (BlockAquamarine) register("chiseled_golden_block", new BlockAquamarine(FabricBlockSettings.of(Material.METAL)));
    public static final BlockAquamarine CHISELED_GOLDEN_AQUAMARINE = (BlockAquamarine) register("chiseled_golden_aquamarine", new BlockAquamarine(FabricBlockSettings.of(Material.METAL)));;
    public static final ColoredShellBlocks BLACK_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("black_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks BLUE_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("blue_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks BROWN_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("brown_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks CYAN_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("cyan_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks GRAY_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("gray_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks GREEN_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("green_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks LIGHT_BLUE_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("light_blue_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks LIGHT_GRAY_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("light_gray_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks LIME_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("lime_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks MAGENTA_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("magenta_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks ORANGE_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("orange_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks PINK_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("pink_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks PURPLE_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("purple_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks RED_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("red_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks WHITE_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("white_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final ColoredShellBlocks YELLOW_COLORED_SHELL_BLOCK = (ColoredShellBlocks) register("yellow_colored_shell_block", new ColoredShellBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks BLACK_PEARL_BLOCK = (PearlBlocks) register("black_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks BLUE_PEARL_BLOCK = (PearlBlocks) register("blue_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks BROWN_PEARL_BLOCK = (PearlBlocks) register("brown_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks CYAN_PEARL_BLOCK = (PearlBlocks) register("cyan_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks GRAY_PEARL_BLOCK = (PearlBlocks) register("gray_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks GREEN_PEARL_BLOCK = (PearlBlocks) register("green_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks LIGHT_BLUE_PEARL_BLOCK = (PearlBlocks) register("light_blue_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks LIGHT_GRAY_PEARL_BLOCK = (PearlBlocks) register("light_gray_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks LIME_PEARL_BLOCK = (PearlBlocks) register("lime_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks MAGENTA_PEARL_BLOCK = (PearlBlocks) register("magenta_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks ORANGE_PEARL_BLOCK = (PearlBlocks) register("orange_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks PINK_PEARL_BLOCK = (PearlBlocks) register("pink_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks PURPLE_PEARL_BLOCK = (PearlBlocks) register("purple_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks RED_PEARL_BLOCK = (PearlBlocks) register("red_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks WHITE_PEARL_BLOCK = (PearlBlocks) register("white_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final PearlBlocks YELLOW_PEARL_BLOCK = (PearlBlocks) register("yellow_pearl_block", new PearlBlocks(FabricBlockSettings.of(Material.STONE)));
    public static final OysterShellBlock OYSTER_SHELL_BLOCK = (OysterShellBlock) register("oyster_shell_block", new OysterShellBlock(FabricBlockSettings.of(Material.STONE)));
    public static final AtlantisPortalBlock ATLANTIS_PORTAL = (AtlantisPortalBlock) register("atlantis_portal", new AtlantisPortalBlock(FabricBlockSettings.of(Material.PORTAL)));
    public static final UnderwaterFlower UNDERWATER_FLOWER = (UnderwaterFlower) register("underwater_flower", new UnderwaterFlower(FabricBlockSettings.of(Material.PLANT)));
    public static final Algae ALGAE = (Algae) register("algae", new Algae(FabricBlockSettings.of(Material.PLANT)));

    private static Block baseRegister(String name, Block block, Function<Block, Item> item) {
        Registry.register(Registry.BLOCK, new Identifier(Reference.MODID, name), block);
        ItemInit.register(name, item.apply(block));
        return block;
    }

    private static Block register(String name, Block block) {
        return baseRegister(name, block, BlockInit::registerBlockItem);
    }

    private static BlockItem registerBlockItem(Block block) {
        return new BlockItem(Objects.requireNonNull(block), new Item.Settings().group(ItemInit.CREATIVE_TAB_ATLANTIS));
    }
}