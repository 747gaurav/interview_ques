package com.accolite.morgan.stanley;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class PeriodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class perCls = null;
		try{
			perCls = Class.forName("com.accolite.morgan.stanley.PeriodImmutable");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
//		Object o  = perCls.newInstance();
		Constructor ctr = perCls.getDeclaredConstructor(Date.class, Date.class);
		//perCls.getDeclaredConstructor(parameterTypes)
		ctr.newInstance(new Date(2016, 5, 31), new Date(2017, 5, 12));
		}catch(InstantiationException| IllegalAccessException | NoSuchMethodException | InvocationTargetException e){
			e.printStackTrace();
		}
	}

}
