package com.nyrds.pixeldungeon.mechanics.ablities;

import java.util.Set;

/**
 * Created by mike on 04.03.2017.
 * This file is part of Remixed Pixel Dungeon.
 */

public class Ordinary implements Abilities {
	@Override
	public Set<Class<?>> immunities() {
		return AbilitiesSet.no_immunities;
	}

	@Override
	public Set<Class<?>> resistances() {
		return AbilitiesSet.no_resistances;
	}

	@Override
	public int hasteBonus() {
		return 0;
	}

	@Override
	public int dewBonus() {
		return 0;
	}
}
