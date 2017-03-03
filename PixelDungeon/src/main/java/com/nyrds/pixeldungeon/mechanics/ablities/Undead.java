package com.nyrds.pixeldungeon.mechanics.ablities;

import com.watabou.pixeldungeon.actors.blobs.ToxicGas;
import com.watabou.pixeldungeon.actors.buffs.Amok;
import com.watabou.pixeldungeon.actors.buffs.Blindness;
import com.watabou.pixeldungeon.actors.buffs.Paralysis;
import com.watabou.pixeldungeon.actors.buffs.Poison;
import com.watabou.pixeldungeon.actors.buffs.Sleep;
import com.watabou.pixeldungeon.actors.buffs.Terror;
import com.watabou.pixeldungeon.items.weapon.enchantments.Death;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mike on 12.02.2017.
 * This file is part of Remixed Pixel Dungeon.
 */

public class Undead extends Ordinary {

	private static final Set<Class<?>> undead_immunities;

	static {
		Set<Class<?>> immunities = new HashSet<>();
		immunities.add(Paralysis.class);
		immunities.add(ToxicGas.class);
		immunities.add(Terror.class);
		immunities.add(Death.class);
		immunities.add(Amok.class);
		immunities.add(Blindness.class);
		immunities.add(Sleep.class);
		immunities.add(Poison.class);

		undead_immunities = Collections.unmodifiableSet(immunities);
	}


	@Override
	public Set<Class<?>> immunities() {
		return undead_immunities;
	}

	public static Undead instance = new Undead();
}
