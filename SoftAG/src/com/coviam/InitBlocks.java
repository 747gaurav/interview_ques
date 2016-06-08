package com.coviam;

public class InitBlocks {

	final int i ;
	
	static{
		System.out.println();
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
