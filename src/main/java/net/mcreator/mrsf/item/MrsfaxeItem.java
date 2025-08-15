package net.mcreator.mrsf.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class MrsfaxeItem extends AxeItem {
	public MrsfaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2500;
			}

			public float getSpeed() {
				return 28f;
			}

			public float getAttackDamageBonus() {
				return 16f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -2f, new Item.Properties().fireResistant());
	}
}