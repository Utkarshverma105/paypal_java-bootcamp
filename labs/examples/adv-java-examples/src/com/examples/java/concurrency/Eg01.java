package com.examples.java.concurrency;

/**
 * Thread Example
 * Creation of thread by extending Thread
 */
public class Eg01 extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " -->Start Running thread");

		for(int i=0; i < 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
		System.out.println(Thread.currentThread().getName() + " -->Stop thread");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " -->Start Running thread");
		Eg01 t1 = new Eg01();
		t1.setName("T1");
		t1.start(); // creates new thread and submits for scheduling

		Eg01 t2 = new Eg01();
		t2.setName("T2");
		t2.start();

		for(int i=0; i < 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}

//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println(Thread.currentThread().getName() + " -->Stop thread");
	}
}
