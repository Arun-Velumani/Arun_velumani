package program01;

public class circle {
	
	void area_circle( double pi,double radius){
		
		double area=pi*radius*radius;
		System.out.println(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle obj=new circle();
		obj.area_circle(3.14,14.5);

	}

}
