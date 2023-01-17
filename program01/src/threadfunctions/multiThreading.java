package threadfunctions;
import java.util.*;
public class multiThreading  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       custThread t1=new custThread();

       simpleInst t3=new simpleInst();
       t1.start();
       t3.start();
	}

}
