package threadfunctions;

public class joinDemo extends Thread{
	public joinDemo(){
		setName("Child demo");
	}
	public void run(){
		try{
			System.out.println(getName()+"stsrted");
			Thread.currentThread().join();
		}
		catch(Exception e){
			
		}
	}

	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName()+"Started");
		joinDemo t1=new joinDemo();
		t1.start();
	}
}
