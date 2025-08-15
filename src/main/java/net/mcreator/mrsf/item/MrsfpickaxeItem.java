package net.mcreator.mrsf.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class MrsfpickaxeItem extends PickaxeItem {
	public MrsfpickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2500;
			}

			public float getSpeed() {
				return 28f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT));
			}
		}, 1, -2f, new Item.Properties().fireResistant());
	}
}