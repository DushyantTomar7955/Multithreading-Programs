package com.multithreading;

public class LamdaExpression {

	public static void main(String[] args) {
		
		Runnable mt=()->{
		for(int i=0;i<10000;i++) {
			System.out.println("Child Thread");
		}
		};
		
		Thread t1=new Thread(mt);
		t1.start();

		System.err.println("Main Thread");
		
		
		

	}

}
