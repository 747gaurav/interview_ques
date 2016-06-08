package com.jpmorgan.chase;

import java.util.Arrays;

public class StringRevRec {
	
	public static String recReverse(String st){
		if(st==null||st.length()<=1){
			return st;
		}
		char c = st.charAt(0);
		return recReverse(st.substring(1))+c;
	}
	
	public static void recRevInPlace(char[] arr, int end){
		if(arr == null)
			return;
		if(end<=0)
			return;
		
		char first = arr[0];
		shiftLeft(arr, end);
		arr[end]=first;
		recRevInPlace(arr, end-1);
		
	}
	
	public static void shiftLeft(char[] arr, int till){
		if(till <=0|| till > arr.length-1)
		{
			System.out.println("return conition match");
			return;
		}
		for(int i =0 ; i<till;i++)
		{
			arr[i]=arr[i+1];
		}
	}
	
	public static void main(String[] args){
		//System.out.println(StringRevRec.recReverse("1234"));
		char[] arr = "1234".toCharArray();
		
		StringRevRec.recRevInPlace(arr,  arr.length-1);
		//StringRevRec.shiftLeft(arr, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

}
