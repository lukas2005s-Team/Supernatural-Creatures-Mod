package io.github.lukas2005.supernaturalcreatures.render.entity;

import io.github.lukas2005.supernaturalcreatures.Reference;
import io.github.lukas2005.supernaturalcreatures.entity.EntityOmegaWerewolf;
import io.github.lukas2005.supernaturalcreatures.render.layer.WerewolfEyesLayer;
import io.github.lukas2005.supernaturalcreatures.render.model.ModelWerewolf;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;

public class EntityWerewolfRenderer extends LivingRenderer<EntityOmegaWerewolf, ModelWerewolf<EntityOmegaWerewolf>> {

	private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/entity/werewolf/timber.png");

	public EntityWerewolfRenderer(EntityRendererManager manager) {
		super(manager, new ModelWerewolf(), 1);
		this.addLayer(new WerewolfEyesLayer<>(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntityOmegaWerewolf entity) {
		return texture;
	}

}
