package com.verifone.thr.even;

import com.verifone.thr.SharedObj;

public class EvenPrint implements Runnable {
	SharedObj sobj;
	int[] evenArr;
	
	
	public EvenPrint(SharedObj sobj) {
		super();
		this.sobj = sobj;
		evenArr = new int[] {2,4,6,8,10};
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<evenArr.length-1; i++){
			synchronized (sobj) {
				if(sobj.getLastPrinted() < evenArr[i]){
					System.out.println(", "+evenArr[i]);
					sobj.setLastPrinted(evenArr[i]);
				}
				sobj.notify();
				try {
					sobj.wait();
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}

}
