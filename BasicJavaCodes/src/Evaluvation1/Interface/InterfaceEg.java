package Evaluvation1.Interface;

public class InterfaceEg {
	public static void main(String[] args) {
		drawable d= new circle();
		d.draw();
		d=new rect();
		d.draw();
	}
}
interface drawable{
	void draw();
}
class rect implements drawable{
	public void draw() {
		int lent=10,breath=12;
		int area=lent*breath;
		System.out.println("draw rectangle with arrea "+area );
	}
}
class circle implements drawable{
	public void draw() {
		int radius=2;
		double PI=3.14;
		double area=PI*radius*radius;
		System.out.println("circle on the way with area "+area);
	}
}


