package com.jpmorgan.chase;

public class ThreadDoubleStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDoubleStart t = new ThreadDoubleStart();
		Thread t1 = new Thread(t.new MyRunnable(), "t1");
		
		t1.start();
//		t1.start();
	}

	public class MyRunnable implements Runnable{
		
		public MyRunnable() {
			// TODO Auto-generated constructor stub
		}
		@Override
		public void run()
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
