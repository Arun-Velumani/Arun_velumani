package streamdemo;
import java.util.*;
import java.util.stream.*;
public class match {
	public static void main(String []args){
		List<Integer> n=new ArrayList<>();
		n.add(12);
		n.add(11);
		n.add(19);
		n.add(23);
		n.add(45);
		n.add(56);
		n.add(78);
		n.add(89);
		Stream<Integer> stream=n.stream();
		System.out.println(stream.anyMatch((a)->a>11));
	}

}
