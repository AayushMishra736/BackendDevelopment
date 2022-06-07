package com.java8.lambdaexpression;

public class LambdaExpressionForThreadCreation {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {
			public void run(){
				System.out.println("Thread1 is running...");
			}
		};
		Thread t1 = new Thread();
		t1.start();

		Runnable r2 = () -> {
			System.out.println("Thread is running by lambda expression...");
		};

		Thread t2 = new Thread(r2);
		t2.start();

	}

}
