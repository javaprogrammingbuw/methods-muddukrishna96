
import java.util.Scanner;
public class Circle {
	//todo: add some methods to compute a circle's diameter, circumference and area.

	//print some outputs to confirm your methods are working correctly.
	public static void main(String[]args){
		System.out.println("enter radius of circle");
		Scanner scan = new Scanner(System.in);
		float n = scan.nextfloat();
		float diameter = diameter(n);
		float circuference=circumference(n);
		float area = area(n);
	}
	public static float diameter(float r){
		float d= (2*r);
		System.out.println("diameter of circle"+d);
		return(d);
	}
	public static float circumference(float r){
		
		float c=(2*3.14*r);
			System.out.println("circuference of circle"+c);
			return(c);
	}
	public static float area(float r){
		System.out.println("area of circle");
		float a=(3.14*r*r);
			System.out.println("area of circle"+a);
			return(a);
	}
}
