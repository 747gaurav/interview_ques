package com.coviam;

public class InitBlocks {

	final static int i =1;
	
	static{
		System.out.println(i);
	}
	
	{
		//i=10;
		System.out.println("intace init"+i);
	}
	
	public InitBlocks() {
		// TODO Auto-generated constructor stub
		i=20;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
