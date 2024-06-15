package hotsuop.daggers.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;

public class NetheriteDagger extends SwordItem {

    private static final double ATTACK_DAMAGE = 6.0;
    private static final float ATTACK_SPEED = -.4F; // Adjusted attack speed for Netherite, if desired
    private static final int MAX_COUNT = 1;

    public NetheriteDagger(Item.Settings settings) {
        super(ToolMaterials.NETHERITE, (int) ATTACK_DAMAGE, ATTACK_SPEED, settings.maxCount(MAX_COUNT));
    }
}
