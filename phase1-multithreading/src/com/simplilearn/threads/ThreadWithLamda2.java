package com.simplilearn.threads;

public class ThreadWithLamda2 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(()-> {
				for(int i = 0 ; i< 5;i++) {
					System.out.println("Ram : Hi");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		});
		
		Thread t2 = new Thread(()-> {
			for(int i = 0 ; i< 5;i++) {
				System.out.println("Sham : Hello");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	});	
	
	t1.start();
	try { Thread.sleep(10); } catch (InterruptedException e) {}
	t2.start();
	}

}
