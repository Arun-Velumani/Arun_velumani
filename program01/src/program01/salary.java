package program01;

public class salary {
	void net_salary(float basic_salary, float da,float hra,float pf){
		float ns=basic_salary+da+hra-pf;
		System.out.println(ns);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      salary obj=new salary();
      obj.net_salary(16000,123,79,11.5f);
	}

}
