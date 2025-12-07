package com.tnsif.threads;

public class RunnableDemo {

		public static void main (String[] args) {
			UsingRunnable t1 = new UsingRunnable(1,5, "thread1");
			UsingRunnable t2 = new UsingRunnable(1,5, "thread1");
			
			Thread t=new Thread(t1);
			Thread tt2=new Thread(t2);
			t.start();
			tt2.start();
			
			try {
				t.join();
				tt2.join();
			}
			catch (InterruptedException ie) {
				Thread.currentThread().interrupt();
				System.err.println("Error" + ie.getMessage());
			}
		
		
		}
	}

