package com.verifone.thr;

import com.verifone.thr.even.EvenPrint;
import com.verifone.thr.odd.OddPrint;

public class OddEvenPrintDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedObj sobj = new SharedObj();
		Runnable odd= new OddPrint(sobj);
		Runnable even = new EvenPrint(sobj);
		Thread o = new Thread(odd, "odd");
		Thread e = new Thread(even, "even");
		e.start();
		o.start();
	}

}
