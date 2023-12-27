package com.multithreading;

public class ThreadInterface implements Runnable {
 

	public void run() {
		char ch='a';
		for(int i=0;i<5;i++) {
			System.out.println(ch);
		}
	}


}

 class Thread1{
	
	public static void main(String[] args) {
		ThreadInterface mt=new ThreadInterface();
		Thread t=new Thread();
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println(i+1);
		}
	}
}


