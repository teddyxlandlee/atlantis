package com.mystic.atlantis.configfeature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.world.gen.feature.FeatureConfig;

public class AtlantisOreFeatureConfig implements FeatureConfig
{
    public static final Codec<AtlantisOreFeatureConfig> CODEC = RecordCodecBuilder.create((AtlantisOreFeatureConfigInstance) -> AtlantisOreFeatureConfigInstance.group(
            RuleTest.field_25012.fieldOf("target").forGetter((AtlantisOreFeatureConfig) -> AtlantisOreFeatureConfig.target),
            BlockState.CODEC.fieldOf("state").forGetter((AtlantisOreFeatureConfig) -> AtlantisOreFeatureConfig.state),
            Codec.intRange(0, 64).fieldOf("size").forGetter((AtlantisOreFeatureConfig) -> AtlantisOreFeatureConfig.size),
            Codec.STRING.fieldOf("type").forGetter((AtlantisOreFeatureConfig) -> AtlantisOreFeatureConfig.type))
            .apply(AtlantisOreFeatureConfigInstance, AtlantisOreFeatureConfig::new));

    public final RuleTest target;
    public final int size;
    public final BlockState state;
    public final String type;

    public AtlantisOreFeatureConfig(RuleTest ruleTest, BlockState blockState, int size, String type) {
        this.type = type;
        this.size = size;
        this.state = blockState;
        this.target = ruleTest;
    }
}
