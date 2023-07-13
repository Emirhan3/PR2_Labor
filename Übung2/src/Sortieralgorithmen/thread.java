package Sortieralgorithmen;

public class thread extends Thread {
	
	public void run() {
		System.out.println("hello world");
	}

	
	public static void main(String[] args) {

		thread t3 = new thread();
		
		t3.start();
		
		
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new gerade());
		Thread t2 = new Thread(new ungerade());
		
		t1.start();
		t2.start();
		
		
	}

}

class gerade implements Runnable {

	@Override
	public void run() {

		for(int i = 2; i<=100; i = i+2) {
			System.out.println("Gerade"+ i);
		}
	}
	
}

class ungerade implements Runnable {
	
	public void run() {

		for(int i = 1; i<=100; i=i+2) {
			System.out.println("ungerade"+i);
		}
		
	}
}