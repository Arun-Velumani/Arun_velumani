package sorted;
import java.util.*;
public class sortByAmount implements Comparator<Revenue> {
	public int compare(Revenue e1, Revenue e2){
		if(e1.amount==e2.amount){
			return 0;
		}
		else{
			if(e1.amount<e2.amount){
				return -1;
			}
			else
				return 1;
		}
	}
   
}
