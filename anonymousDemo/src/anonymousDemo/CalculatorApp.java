package anonymousDemo;

public class CalculatorApp {
	
	public void getAmount(InterstCalculator ic){
		System.out.println("Simple Intrest :  " +ic.simpleIntrest(13000,3,4) );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorApp ca=new CalculatorApp();
		ca.getAmount((p ,r , t)-> p*r*t/100);
	}
	}

