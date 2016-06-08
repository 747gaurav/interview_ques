package com.bt;

public class StaticMethodChaining {
	static int x = test();
	static public int test()
	{
		System.out.print(x);
		return 99;
	}
	public static void main(String[] args){
		System.out.print(x);
	}
}
