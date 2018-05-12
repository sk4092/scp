package com.scp.Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadStopDemo {
	public static void main(String args[]) throws InterruptedException {
		Server myServer = new Server();
		Thread t1 = new Thread(myServer, "T1");
		t1.start(); // Now, let's stop our Server thread
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName() + " is stopping Server thread");
		myServer.stop(); 
		
		
	}
}

class Server implements Runnable {
	private volatile boolean exit = false;

	public void run() {
		while (!exit) {
			System.out.println("Server is running.....");
		}
		System.out.println("Server is stopped....");
	}

	public void stop() {
		exit = true;
	}
}

