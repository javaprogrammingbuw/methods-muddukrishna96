
public class Circle {
	//todo: add some methods to compute a circle's diameter, circumference and area.

	//print some outputs to confirm your methods are working correctly.
	public static void main(string[]args){
		system.out.println("enter radius of circle")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		float diameter = diameter(n);
		float circuference=circumference(n);
		float area = area(n);
	}
	public static float diameter(int d){
		r= (2*d);
		system.out.println("diameter of circle"+d);
		return(r);
	}
	public static float circumference(int c){
		
		c=(2*3.14*c);
			system.out.println("circuference of circle"+c);
			return(c);
	}
	public static float area(int a){
		system.out.println("area of circle");
		a=(3.14*a*a*);
			system.out.println("area of circle"+a);
			return(a);
	}
}
