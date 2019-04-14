package exceptions;

import java.io.IOException;

public class CEExample implements Runnable {
	
	public static void main(String[] args) throws IOException {
		Thread thread = new Thread(new CEExample());
		thread.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		throw new IOException("Oops");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(5000);
				
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("Alive!");
		}
	}
}
