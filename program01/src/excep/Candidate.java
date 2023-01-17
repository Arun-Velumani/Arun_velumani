package excep;

public class Candidate {

	public int checkMarks(int marks) throws Exception{
		
		if(marks<30){
			throw new Exception("marks invalid");
		}
		else
			return marks;
	}
	public static void main(String [] args){
		try{
			Candidate obj=new Candidate();
			obj.checkMarks(22);
		}
		catch(Exception e){
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
	}
}
