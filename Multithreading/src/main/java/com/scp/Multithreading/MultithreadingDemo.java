package com.scp.Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MultithreadingDemo {
	public static void main(String[] args) throws InterruptedException {
		
		//creating object of class implementing runnable interface
		MyRunnable myRunnable = new MyRunnable(); // Implements Runnable Interface
		//Create object of Thread using runnable implementation  
		Thread t1 = new Thread(myRunnable, "Swapnils Thread");
		//Run thread using run()
		t1.run();
		
		//Create object of class extending Thread class
		MyThread2 myThread2 = new MyThread2("Swapnils thread 2");// Extends Thread Class
		//Start thread using start()
		myThread2.start();
				
		//running a class implementing runnable without creating a new thread 
		//ONLY APPLIABLE FROM JAVA 1.5
		Executor executor = Executors.newFixedThreadPool(2);
		executor.execute(myRunnable);
	}

}

//Implementing Runnable Interface
class MyRunnable implements Runnable {
	public void run() {
		int count = 0;
		while (count < 5) {
			System.out.println("Thread is running In Runnable Implementation " + Thread.currentThread().getName());
			count++;
		}
	}
}

//Extending Thread Class
class MyThread2 extends Thread {
	public MyThread2(String string) {
		this.setName(string);
	}

	@Override
	public void run() {
		int count = 0;
		while (count < 5) {
			System.out.println("Thread is running extending Thread Class " + getName());
			count++;
		}
	}
}
