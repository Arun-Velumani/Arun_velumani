package threadfunctions;

public class newThread implements Runnable{
	int i=0;
	public void run(){
	for(i=0;i<5;i++){
		System.out.println("name");
		try{
			Thread.sleep(2000);
			Thread t=Thread.currentThread();
			System.out.println(t.getName());
		}
		catch(InterruptedException e){
			
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newThread obj1=newThread();
		Thread t1=
		

	}

}
