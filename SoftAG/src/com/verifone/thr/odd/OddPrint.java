package com.verifone.thr.odd;

import com.verifone.thr.SharedObj;

public class OddPrint implements Runnable {
	SharedObj sobj;
	int[] oddArr;
	public OddPrint(SharedObj sobj) {
		super();
		this.sobj = sobj;
		oddArr = new int[] {1,3,5,7,9,11,12};
	}

/*	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<oddArr.length-1;i++){
			synchronized (sobj) {
				if(sobj.getLastPrinted() ==0 || (sobj.getLastPrinted()<oddArr[i] && sobj.getLastPrinted()){
					System.out.println(", "+oddArr[i]);
					sobj.setLastPrinted(oddArr[i]);
					
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
*/	
	@Override
	public void run(){
		
	}
}
