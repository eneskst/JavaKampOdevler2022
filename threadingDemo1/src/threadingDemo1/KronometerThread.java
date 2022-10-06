package threadingDemo1;

public class KronometerThread implements Runnable {

	private Thread thread;
	private String threadName;

	public KronometerThread(String threadName) {
		this.threadName = threadName;
		System.out.println("Oluşturuluyor: " + threadName);
	}

	@Override
	public void run() {
		System.out.println("Çalıştırılıyor: " + threadName);

		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(threadName + " :" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException exception) {
			System.out.println("Kesildi." + threadName);
		}

		System.out.println("Thread Bitti " + threadName);
	}

	public void start() {
		System.out.println("Thread Nesnesi Oluşuyor.");
		if(thread==null) {
			thread = new Thread(this,threadName);
			thread.start();
		}
		
		
		
		
		
		
	}
}
