package com.sort.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Player {//Comparable<Player> {

	protected String Pname;
	protected int ranking;
	protected int age;
	
	@Override
	public String toString() {
		return "Player [Pname=" + Pname + ", ranking=" + ranking + ", age=" + age + "]";
	}

	Player(String pname,int ranking,int age){
		this.Pname=pname;
		this.ranking=ranking;
		this.age=age;
	}
	
	public static void main(String args[]) {
		List<Player> player = new ArrayList<Player>();
		player.add(new Player("messi",1,34));
		player.add(new Player("ronaldo",2,36));
		player.add(new Player("mbappe",3,23));
	
		System.out.println("before---"+player);
		Comparator<Player> ageing = ( p1, p2)->Integer.compare(p1.age, p2.age);
		Comparator<Player> ranking = ( p1, p2)->Integer.compare(p1.ranking, p2.ranking);
	
		Collections.sort(player,ageing);
		System.out.println("After----"+player);
		
		
		
	}

//	@Override
//	public int compareTo(Player o) {
//		// TODO Auto-generated method stub
//		return this.Pname.compareTo(o.Pname);
//	}
	
	
	
}
