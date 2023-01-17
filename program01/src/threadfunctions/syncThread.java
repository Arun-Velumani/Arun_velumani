package threadfunctions;

public class syncThread implements Runnable{
	public void run(){
		synchronized (this){
			System.out.println(Thread.currentThread().getName());
			System.out.println("Eric");
			System.out.println("23 old street");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		syncThread st=new syncThread();
		Thread th1=new Thread(st);
		Thread th2=new Thread(st);
		th1.start();
		th2.start();

	}

}
