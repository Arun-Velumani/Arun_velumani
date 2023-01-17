package sorted;
import java.util.*;
public class sortByRevenueName implements Comparator<Revenue>{
  public int compare(Revenue e1,Revenue e2){
	  return e1.revenueName.compareTo(e2.revenueName);
  }
}
