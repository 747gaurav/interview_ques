package com.triple.point.executor;

public class ExecuteRunable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Excuting in excuter. thrad id="+Thread.currentThread().getId());
		try {
			Thread.sleep(10000);
			System.out.println("wok up "+Thread.currentThread().getId());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("interupted thread id ="+Thread.currentThread().getId());
			e.printStackTrace();
		}
	}

}
