package com.examples.java.concurrency;

/**
 * Thread Examples
 * Daemon
 *
 */
public class Eg14 {
	public class CpuInternsiveJob extends Thread {
		
		@Override
		public void run() {
			long startTime = System.currentTimeMillis();
			System.out.println(Thread.currentThread().getName() + " starting >>>");
			System.out.flush();
			int x = 0;
			for(int i=0; i <100000; i++) {
				for(int j=0; j<100000; j++) {
					 x = i + j;
				}
			}
			System.out.println(Thread.currentThread().getName() + " - " + x);
			long endtime = System.currentTimeMillis();
			System.out.println(Thread.currentThread().getName() + " Time Taken - " + (endtime - startTime) + "ms");
			System.out.println(Thread.currentThread().getName() + " stopping");
			System.out.flush();
		}
	}
	
	public static void main(String[] args) {
		Eg14 e = new Eg14();
		Thread t1 = e.new CpuInternsiveJob();
		Thread t2 = e.new CpuInternsiveJob();
		Thread t3 = e.new CpuInternsiveJob();
		// uncomment below statement to run as daemon thread
		// thread will run in background with low priority
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			throw new RuntimeException(ex);
		}
		System.out.println("Daemon thread started...");

	}
}
