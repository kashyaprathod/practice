import java.util.*;
public class menu1 {
	Scanner sc = new Scanner(System.in);
	public void area(){
		System.out.println("1) Circle");
		System.out.println("2) Square");
		System.out.println("3) Rectangle");
		System.out.println("Choose any one from above: ");
		int choose = sc.nextInt();
		double pi = 3.14;
		double area;
		switch(choose){
		case 1:
			System.out.println("Enter radius of circle");
			double r = sc.nextInt();
			area = pi * Math.pow(r, 2); 
			System.out.println("Area of circle is : "+ area);
			break;
		case 2: 
			System.out.println("Enter side of square: ");
			double side = sc.nextInt();
			area = side*side;
			System.out.println("Area of sqaure is: "+  area);
			break;
		case 3:
			System.out.println("Enter length of the rectangle: ");
			double length = sc.nextInt();
			System.out.println("Enter breadth of the rectangle: ");
			double breadth = sc.nextInt();
			area = length*breadth;
			System.out.println("Area od rectangle is : "+ area);
			break;
		default: 
			System.out.println("Invalid entry.");
		}
	}
	public static void main(String args[]){
		menu1 m1 = new menu1();
		m1.area();
	}
}
