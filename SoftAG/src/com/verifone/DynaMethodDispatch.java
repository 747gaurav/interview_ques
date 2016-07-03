package com.verifone;

import jdk.nashorn.internal.codegen.DumpBytecode;

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
	public void display(Integer in){
		System.out.println("Integer version");
	}
	
	public void display(int i){
		System.out.println("int ver");
	}
	public void display(double d){
		System.out.println("Double");
	}
	public void display(CharSequence cs){
		System.out.println("CharSeq version");
	}
	
	public static void main(String[] srgs){
		//new DynaMethodDispatch().display(Short.valueOf("1"));
		new DynaMethodDispatch().display(1);
	}
}
