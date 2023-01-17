package sorted;

public class Revenue {
	String revenueName;
	float amount;
	public Revenue(String revenueName, float amount){
		this.revenueName=revenueName;
		this.amount=amount;
	}
	public String toString(){
		return "Revenue name: "+revenueName+"Amount: "+amount;
	}

}
