package threadfunctions;

public class customerThread extends Thread{
	public void run(){
		
		try{
			//String cusName;
			for (int i=0;i<5;i++){
				System.out.println("customerName");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customerThread obj=new customerThread();
		Thread thr=new Thread(obj);

	}

}
