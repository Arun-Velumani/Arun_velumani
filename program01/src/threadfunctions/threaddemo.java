package threadfunctions;

public class threaddemo extends Thread{
	
	public void run(){
		try{
			for (int i=0;i<5;i++){
				System.out.println(i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e){
			System.out.print(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threaddemo obj=new threaddemo();
		Thread th=new Thread(obj);
		obj.start();

	}

}
