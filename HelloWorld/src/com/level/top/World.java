package com.level.top;

import com.level.bottom.Countries;
import com.level.middle.Oceans;

public class World {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Countries countries = new Countries();
		final Oceans oceans = new Oceans();

		countries.inform();
		oceans.inform();
	}

}
