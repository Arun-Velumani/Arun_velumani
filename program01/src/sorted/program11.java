package sorted;
import java.util.*;
public class program11 {

	public static void main(String[] args){
		NavigableSet<Integer> ns=new TreeSet<Integer>();
		ns.add(23);
		ns.add(45);
		ns.add(11);
		ns.add(19);
		ns.add(55);
		ns.add(22);
		ns.add(18);
		ns.add(32);
		System.out.println(ns.higher(50));
		System.out.println(ns.lower(25));
		System.out.println(ns.floor(15));
		System.out.println(ns.ceiling(20));
	}
}
