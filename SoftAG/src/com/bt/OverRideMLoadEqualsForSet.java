package com.bt;

import java.util.HashSet;
import java.util.Set;

public class OverRideMLoadEqualsForSet {
	private Integer x;
	
	public OverRideMLoadEqualsForSet(int x){
		this.x = x;
	}

	public boolean equals( OverRideMLoadEqualsForSet in){
		System.out.println("11:in equals with OverRideMLoadEqualsForSet");
		return false;
	}
	
	public boolean equals(Object o){
		System.out.println("19: overriden equals ="+this);
		return true;
	}
	public String toString(){
		return x.toString();
	}
	public int hashCode(){
		return 17;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<OverRideMLoadEqualsForSet> s = new HashSet<>();
		s.add(new OverRideMLoadEqualsForSet(1));
		s.add(new OverRideMLoadEqualsForSet(2));
		s.add(new OverRideMLoadEqualsForSet(3));
		s.add(new OverRideMLoadEqualsForSet(3));
		
		System.out.println("Size of set="+s.size());
	}

}
