package streamdemo;
import java.util.*;
import java.util.stream.Stream;
import java.util.List;
public class MapReduce {
	public static void main(String []args){
		Stream<Integer> nstream=Stream.iterate(1, (a)->a=a+1).limit(100);
		nstream.map((a)->a%2==0?"Even detected":"Odd detected").limit(50).forEach(System.out::println);
		List<String> animal1=Arrays.asList("cat","lion","tiger","leopard","Cheetah");
		List<String> animal2=Arrays.asList("dog","wolf","fox","bear");
		List<String> animal3=Arrays.asList("wolf","lion","tiger","bear");
		Stream<List<String>> flatstream=Stream.of(animal1,animal2,animal3);
		flatstream.flatMap((a)->a.stream()).distinct().forEach(System.out::println);
		
	}

}
