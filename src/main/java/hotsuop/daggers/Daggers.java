package hotsuop.daggers;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hotsuop.daggers.items.DiamondDagger;
import hotsuop.daggers.items.GoldDagger;
import hotsuop.daggers.items.IronDagger;
import hotsuop.daggers.items.NetheriteDagger;
import hotsuop.daggers.items.StoneDagger;
import hotsuop.daggers.items.Woodendagger;

public class Daggers implements ModInitializer {
	public static final Item WOODEN_DAGGER = new Woodendagger(new Item.Settings());
	public static final Item STONE_DAGGER = new StoneDagger(new Item.Settings());
	public static final Item IRON_DAGGER = new IronDagger(new Item.Settings());
	public static final Item GOLD_DAGGER = new GoldDagger(new Item.Settings());
	public static final Item DIAMOND_DAGGER = new DiamondDagger(new Item.Settings());
	public static final Item NETHERITE_DAGGER = new NetheriteDagger(new Item.Settings());
    public static final Logger LOGGER = LoggerFactory.getLogger("daggers");
	
	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier("daggers", "wooden_dagger"), WOODEN_DAGGER);
		Registry.register(Registries.ITEM, new Identifier("daggers", "stone_dagger"), STONE_DAGGER);
		Registry.register(Registries.ITEM, new Identifier("daggers", "iron_dagger"), IRON_DAGGER);
		Registry.register(Registries.ITEM, new Identifier("daggers", "gold_dagger"), GOLD_DAGGER);
		Registry.register(Registries.ITEM, new Identifier("daggers", "diamond_dagger"), DIAMOND_DAGGER);
		Registry.register(Registries.ITEM, new Identifier("daggers", "netherite_dagger"), NETHERITE_DAGGER);
		LOGGER.info("Hello Fabric world!");
	}
}