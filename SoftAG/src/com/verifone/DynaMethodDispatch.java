package com.verifone;

public class DynaMethodDispatch {
	public void display(Object o){
		System.out.println("Object version");
	}
	
	public void display(String s){
		System.out.println("String version");
	}
	public void display(Number s){	
		System.out.println("Number version");
	}
	
	public void display(CharSequence cs){
		System.out.println("CharSeq version");
	}
	
	public static void main(String[] srgs){
		new DynaMethodDispatch().display(null);
	}
}
