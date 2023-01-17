package streamdemo;
import java.util.Iterator;
import java.util.concurrent.*;
public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<String , Integer> n=new ConcurrentHashMap<>();
		n.put("Thomas", 12);
		n.put("william",32);
		n.put("Erric", 53);
		n.put("Samuel", 62);
		n.put("Maurice", 13);
		n.put("Hendry", 23);
		
		Iterator<ConcurrentHashMap.Entry<String, Integer>> i=n.entrySet().iterator();
		while(i.hasNext()){
			ConcurrentHashMap.Entry<String, Integer>entry=i.next();
			System.out.print(" "+entry.getValue());
		}
		System.out.println();
		n.putIfAbsent("Jacob R Tanning",14);
		System.out.println(n);
		n.compute("Erric", (a,b)->b+1000);
		System.out.println(n);

	}

}
