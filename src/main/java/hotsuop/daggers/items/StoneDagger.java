package hotsuop.daggers.items;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;

public class StoneDagger extends SwordItem {

    private static final double ATTACK_DAMAGE = 2.5; // Should be int, not double
    private static final float ATTACK_SPEED = -.4F; // Typical value for swords
    private static final int MAX_COUNT = 1;

    public StoneDagger(Item.Settings settings) {
        super(ToolMaterials.STONE, (int) ATTACK_DAMAGE, ATTACK_SPEED, settings.maxCount(MAX_COUNT));
    }
}
