package threadfunctions;
import java.util.*;
public class custThread extends Thread{
	public void AcceptDetails(){
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String address=sc.nextLine();
		System.out.println("Name"+name);
		System.out.println("Address"+address);
		
	}
	public void run(){
		AcceptDetails();
	}

}
