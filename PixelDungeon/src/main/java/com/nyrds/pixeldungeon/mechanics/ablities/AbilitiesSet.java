package com.nyrds.pixeldungeon.mechanics.ablities;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mike on 04.03.2017.
 * This file is part of Remixed Pixel Dungeon.
 */

public class AbilitiesSet implements Abilities {

	static final Set<Class<?>> no_immunities  = Collections.unmodifiableSet(new HashSet<Class<?>>());
	static final Set<Class<?>> no_resistances = Collections.unmodifiableSet(new HashSet<Class<?>>());

	protected Set<Abilities> abilities = new HashSet<>();

	@Override
	public Set<Class<?>> immunities() {
		Set<Class<?>> immunities = new HashSet<>();

		for(Abilities ability:abilities) {
			immunities.addAll(ability.immunities());
		}

		return immunities;
	}

	@Override
	public Set<Class<?>> resistances() {
		Set<Class<?>> resistances = new HashSet<>();

		for(Abilities ability:abilities) {
			resistances.addAll(ability.resistances());
		}

		return resistances;
	}

	@Override
	public int hasteBonus() {
		int bonus = 0;
		for(Abilities ability:abilities) {
			bonus += ability.hasteBonus();
		}

		return bonus;
	}

	@Override
	public int dewBonus() {
		int bonus = 0;
		for(Abilities ability:abilities) {
			bonus += ability.dewBonus();
		}

		return bonus;
	}
}
