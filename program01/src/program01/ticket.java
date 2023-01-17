package program01;

public class ticket {
	
	
	
	 String source;
	String destination;
	double price;
	
	public ticket(String s, String d,double p){
		this.source=s;
		this.destination=d;
		this.price=p;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ticket obj=new ticket("chennai","mumbai",10000);
		System.out.println(obj.source);
		System.out.println(obj.destination);
		System.out.println(obj.price);
		
       
	}

}
