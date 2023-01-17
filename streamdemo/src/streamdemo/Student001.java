package streamdemo;
import java.util.*;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class Student001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> l=new ArrayList<>();
		l.add(new Student("peter",50));
		l.add(new Student("ed",70));
		l.add(new Student("mike",55));
		l.add(new Student("michel",60));
		l.add(new Student("steve",10));
		l.add(new Student("mathew",40));
		l.add(new Student("joy",90));
		
        Stream<Student> liststream=l.stream();
        Comparator<Student>d=(b,c)->{
        	if(b.marks==c.marks){
        		return 0;
        	}
        	else{
        		if(b.marks>c.marks){
        			return 1;
        		}
        		else{
        			return -1;
        		}
        	}
        	
        };
        Predicate<Student> predicate=(a)->a.marks>50;
        liststream.sorted(d).filter(predicate).forEach(System.out::println);
	
	}
}
