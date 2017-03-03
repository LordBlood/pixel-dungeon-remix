package com.nyrds.pixeldungeon.mechanics.ablities;

/**
 * Created by mike on 04.03.2017.
 * This file is part of Remixed Pixel Dungeon.
 */

public class Fast extends Ordinary {
	@Override
	public int hasteBonus() {
		return 1;
	}

	public static Fast instance = new Fast();
}
