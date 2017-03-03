package com.nyrds.pixeldungeon.mechanics.ablities;

import com.watabou.pixeldungeon.actors.buffs.Roots;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mike on 04.03.2017.
 * This file is part of Remixed Pixel Dungeon.
 */

public class Unrootable extends Ordinary {

	private static final Set<Class<?>> unrootable_immunities;

	static {
		Set<Class<?>> immunities = new HashSet<>();
		immunities.add(Roots.class);

		unrootable_immunities = Collections.unmodifiableSet(immunities);
	}

	@Override
	public Set<Class<?>> immunities() {
		return unrootable_immunities;
	}

	public static Unrootable instance = new Unrootable();
}
