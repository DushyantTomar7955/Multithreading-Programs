package com.multithreading;


class MyThread extends Thread{
	  public void run() {
		  for(int i=0;i<5;i++) {
			  System.out.println(i+1);
		  }
	  }
}

public class MainThread {
	
	public static void main(String[] args) {
		     MyThread mt=new MyThread();
		     Thread t1=new Thread(mt);
		     t1.start();
		     char ch='a';
		     for(int i=0;i<5;i++) {
		    	 System.out.println(ch);
		    	 ch++;
		     }
	}

}
