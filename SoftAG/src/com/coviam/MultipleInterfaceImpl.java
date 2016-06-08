package com.coviam;

public class MultipleInterfaceImpl implements A, B{

	@Override
	public void sameMethod(){
		System.out.println("Successfully imple");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


interface A{
	void sameMethod();
}

interface B{
	void sameMethod();
}