package hotsuop.daggers.items;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IronDagger extends SwordItem {
    private static final double ATTACK_DAMAGE = 3.5; // Should be int, not double
private static final float ATTACK_SPEED = -.4F; // Typical value for swords
    // Custom tool material with increased durability
    private static final ToolMaterial CUSTOM_IRON = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 250; // Set your desired durability here
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 1.0F;
        }

        @Override
        public float getAttackDamage() {
            return 4.5F;
        }

        @Override
        public int getMiningLevel() {
            return 0;
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.IRON_INGOT); // Replace with the repair item
        }
    };

    private static final int MAX_COUNT = 1;

    public IronDagger(Item.Settings settings) {
        super(CUSTOM_IRON, (int) ATTACK_DAMAGE, ATTACK_SPEED, settings.maxCount(MAX_COUNT));
    }
}
