package threadfunctions;

public class charThread extends Thread{

	public void printchar(){
		char c;
		for(c='A';c<='Z';c++){
			System.out.println(c);
		}
	}
	public void run(){
		printchar();
	}
}
