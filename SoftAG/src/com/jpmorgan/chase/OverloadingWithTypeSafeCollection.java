package com.jpmorgan.chase;

import java.util.LinkedList;
import java.util.List;

public class OverloadingWithTypeSafeCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OParent p= new OChild();
		p.say(new LinkedList<String>());
	}

}

class OParent
{
	public void say(List<String> lst){
		System.out.println("Patrent");
	}
}
class OChild extends OParent{
	
	public void say(List lst)
	{
		System.out.println("Child");
	}
}