package com.bt;

public class StaticMethodChaining {
	static int x = test();
	int y = 0;
	static public int test()
	{
		System.out.print(x);
		return 99;
	}
	public static void main(String[] args){
		System.out.print(x);
//		System.out.println(y);
	}
}
