package com.triple.point.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorDemo {

	Executor exe;
	
	public ExecutorDemo(){
		exe = Executors.newCachedThreadPool();
		
	}
	
	public void shutdown(){
		((ThreadPoolExecutor)exe).shutdown();
	}
	 public static void main(String[] args){
		 
		 ExecutorDemo demo = new ExecutorDemo();
		 Runnable r = new ExecuteRunable();
		 demo.exe.execute(r);
		 demo.exe.execute(r);
		 demo.shutdown();
		// demo.exe.execute(r);
		 demo.exe=null;
	 }
	
}
