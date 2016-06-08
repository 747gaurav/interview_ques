package com.jpmorgan.chase;

import java.lang.reflect.Method;

public class GetMethodWithInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class cls =null;
		try{
		cls = Class.forName("com.jpmorgan.chase.Child");
		}catch(ClassNotFoundException e){e.printStackTrace();}
		Method[] methods = cls.getDeclaredMethods();
		
		for(Method m : methods){
			System.out.println(m.getName());
		}
	}

}


class Parent
{
	public void parentPublic()
	{
	}
	
	private void parentPrivate(){
		
	}
	
	protected void patrentProtected(){
		
	}
}

class Child extends Parent{
	public void childPublic(){
		
	}
	
	private void childPrivate(){
		
	}
	
	protected void childProtected(){
		
	}
}