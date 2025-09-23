package com.pz.metalmithExtra.item.armor;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.pz.metalmithExtra.Metalmithextra;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class FlamIronArmorModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Metalmithextra.MODID, "flam_iron_armor_model"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;

	public FlamIronArmorModel(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 14).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(36, 0).addBox(-4.0F, -3.0F, -4.2F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.1F))
		.texOffs(88, 72).addBox(-1.0F, -8.2F, -4.2F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(72, 48).addBox(-1.0F, -9.3F, -3.2F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.01F))
		.texOffs(32, 14).addBox(-4.0F, -7.6F, -4.2F, 8.0F, 2.0F, 9.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 85).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2F, -6.85F, 4.5F, -0.7544F, -0.6258F, 0.5005F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 72).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, -6.7F, 4.65F, -0.7634F, 0.6138F, -0.516F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 52).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -2.7F, 3.4F, -0.7806F, 0.633F, -0.5464F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 11).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.6F, -4.2F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 9).addBox(-6.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(2.0F, 0.0F, -3.95F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 0.0F, -4.0F, 10.0F, 6.0F, 8.0F, new CubeDeformation(0.1F))
		.texOffs(0, 30).addBox(-4.0F, 6.1F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 25).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(-4.9F, -4.0F, -1.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 17.8F, -4.25F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 82).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, 10.0F, -4.75F, 0.0F, 1.117F, 0.0F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 81).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.55F, 10.0F, -4.75F, 0.0F, -1.117F, 0.0F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.55F, 6.0F, -5.25F, 0.0F, -1.117F, 0.0F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(66, 9).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, 6.0F, -5.25F, 0.0F, 1.117F, 0.0F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(14, 85).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(4.4F, 17.0F, -4.7F, -0.2881F, 0.0505F, -0.231F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 83).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-4.4F, 17.0F, -4.7F, -0.2881F, -0.0505F, 0.231F));

		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(82, 9).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-4.8F, 17.6F, 2.5F, 0.3606F, -0.0653F, 0.1807F));

		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(86, 57).addBox(-1.5F, -3.0F, -0.5F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.01F))
		.texOffs(86, 0).addBox(2.5F, -3.0F, -0.5F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.5F, 17.3F, 3.7F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(60, 70).addBox(-1.5F, -6.0F, -0.5F, 2.0F, 8.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-6.4F, 19.1F, -2.3F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(16, 72).addBox(-0.5F, -6.0F, -0.5F, 2.0F, 8.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(6.4F, 19.1F, -2.3F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(48, 79).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(4.8F, 17.6F, 2.5F, 0.3606F, 0.0653F, -0.1807F));

		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 85).addBox(-1.5F, -5.0F, -0.5F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 17.3F, 5.7F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(42, 70).addBox(-2.0F, -2.0F, -5.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 11.0F, 6.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(66, 0).addBox(-1.5F, -4.0F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 10.0F, 3.5F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(32, 25).addBox(-3.5F, -6.0F, -3.0F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 6.0F, 3.5F, 0.0F, -0.7854F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(80, 27).addBox(-0.55F, 7.1F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(72, 57).addBox(-2.0F, 5.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 1.0F, 0.0F));

		PartDefinition cube_r22 = RightArm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(48, 62).addBox(1.0F, -2.0F, -1.5F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-2.6F, 4.1F, -1.5F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r23 = RightArm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(30, 79).addBox(0.0F, -3.0F, -1.5F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.8F, 0.0F, 0.0F, -0.1745F, -0.7854F));

		PartDefinition cube_r24 = RightArm.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(88, 64).addBox(4.0F, -5.0F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4F, 12.1F, -3.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r25 = RightArm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(48, 52).addBox(0.0F, -4.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 2.6F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(32, 38).addBox(-1.9F, 4.1F, -4.0F, 4.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1F, 14.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(74, 69).addBox(-1.0F, 5.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(80, 37).addBox(-2.45F, 7.1F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(-6.0F, 1.0F, 0.0F));

		PartDefinition cube_r26 = LeftArm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(48, 88).addBox(-6.0F, -5.0F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 12.1F, -3.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r27 = LeftArm.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(56, 38).addBox(-6.0F, -4.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.6F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r28 = LeftArm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(80, 21).addBox(-6.0F, -3.0F, -1.5F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.8F, 0.0F, 0.0F, 0.1745F, 0.7854F));

		PartDefinition cube_r29 = LeftArm.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(20, 64).addBox(-6.0F, -2.0F, -1.5F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.6F, 4.1F, -1.5F, 0.0F, 0.0F, -0.1745F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 46).addBox(-2.1F, 4.1F, -4.0F, 4.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1F, 14.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}