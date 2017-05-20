package com.weihui.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {

	private static ThreadPoolExecutor executor;
	
	public Server(){
		executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(10);
	}
	
	public void executeTask(Task task){
		System.out.println("Server : a new task is coming !");
		executor.execute(task);
		System.out.println("Server : pool size : "+executor.getPoolSize());
		System.out.println("Server : active count : "+executor.getActiveCount());
		System.out.println("Server : completed task count : "+executor.getCompletedTaskCount());
	}
	
	public void endServer(){
		executor.shutdown();
	}
	
	public boolean awaitTermination() throws Exception{
		return executor.awaitTermination(1, TimeUnit.HOURS);
	}
	
	public static ThreadPoolExecutor getExecutor(){
		return executor;
	}
}
