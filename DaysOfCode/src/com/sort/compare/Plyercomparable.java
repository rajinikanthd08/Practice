package com.sort.compare;

import java.util.Comparator;

public class Plyercomparable implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.age, o2.age);
	}
	
}
