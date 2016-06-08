package com.bt;

public class OverloadWthWrapVarArgs {

	public void test(Long x, Long y){
		System.out.println("Long, Long");
	}
	
	public void test(int... is){
		System.out.println("int...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =1;
		OverloadWthWrapVarArgs obj = new OverloadWthWrapVarArgs();
		obj.test(x,x);
		
		Base b = new Sub();
		b.baseMethod(x, x);
	}

}

class Base{
	public void  baseMethod(Long x, Long y){
		System.out.println("Base Long, Long");
	}
}

class Sub extends Base{
	public void baseMethod(int...is ){
		System.out.println("Sub int...");
	}
}