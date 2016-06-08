package com.eka;

import java.util.Arrays;

/*

In Mathematics each number has one special number, which it supports, chosen as follows. It counts the number of ones in its own binary representation, and adds this count to itself to obtain the value of the number it supports. That is, if j(m) means the number of ones in the binary representation of m, then m supports m+j(m). For example, the number eight (1000 in binary) supports nine, whereas nine supports eleven.
However, in this way not all the numbers get supported; some are left without support, and we call these numbers bleak. For example since one supports two, two supports three and three supports five, there is no number less than four, which would support four, so four is bleak.

Your task is for a given number recognize if it is bleak or supported by some number.
 */
public class BleakNumber {
	public static String[] output;
	
	public static void solution(int[] input){
		if(input == null || input.length ==0 || input[0] <=0){
			output = new String[]{"-990"};
			return;
		}else{
			output = new String[input[0]]; 
		}
		for(int i=1; i<input.length-1;i++){
			if(BleakNumber.findBleak(input[i])){
				output[i-1] = "BLEAK"+input[i];
			}else{
				output[i-1]="SUPPORTED"+input[i];
			}
		}
	}
	
	public static boolean findBleak(int m){
		boolean bleak=true;
//		int s = BleakNumber.supporting(m-1);
		int i=1;
		int s;
//		for(int i=2 ; s > m;i++){
		do{
			s = BleakNumber.supporting(m-i);
		
			if(s==m){
				bleak=false;
				break;
			}
			if(s<m){
				break;
			}else{
//				s = BleakNumber.supporting(m-i);
				i++;
			}
//		}
		}while(s>m);
		return bleak;
	}
	public static int supporting(int x){
		String bin = Integer.toBinaryString(x);
		char[] arr = bin.toCharArray();
		int count =0;
		for(int i =0 ; i< arr.length;i++){
			if(arr[i]=='1'){
				count++;
			}
		}
		return x+count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(BleakNumber.supporting(4));
//		System.out.println(BleakNumber.findBleak(13));
		int[] ip = new int[100];
		ip[0]= ip.length-1;
		for(int i =1;i<ip.length;i++){
			ip[i]=i;
			
		}
//		System.out.println(Arrays.toString(ip));
		BleakNumber.solution(ip);
		System.out.println(Arrays.toString(BleakNumber.output));
	}

}
