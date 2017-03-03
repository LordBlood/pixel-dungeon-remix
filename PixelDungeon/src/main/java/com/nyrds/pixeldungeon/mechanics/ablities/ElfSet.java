package com.nyrds.pixeldungeon.mechanics.ablities;

/**
 * Created by mike on 04.03.2017.
 * This file is part of Remixed Pixel Dungeon.
 */

public class ElfSet extends AbilitiesSet{
	public ElfSet() {
		abilities.add(Unrootable.instance);
		abilities.add(Fast.instance);
		abilities.add(DewBonus.instance);
	}
}
