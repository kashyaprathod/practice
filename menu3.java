import java.util.Scanner;
public class menu3 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("1) Fahrenheit to Celsius");
		System.out.println("2) Celsius to Fahrenheit");
		System.out.println("Select any one from the above: ");
		int select = sc.nextInt();
		double c;
		double fahrenheit;
		switch(select){
		case 1:
			System.out.println("Enter Fahrenheit temperature: ");
			double f = sc.nextInt();
			c = 5 / 9 * (f - 32);
			System.out.println("Fahrenheit to Celsius is : " + c);
			break;
		
		case 2:
			System.out.println("Enter Celcius temperature");
			double celcius = sc.nextInt();
			fahrenheit = 1.8 * celcius + 32;
			System.out.println("Celsius to Fahrenheit is : "+ fahrenheit);
		
		default: 
			System.out.println("Invalid entry");
		}
	}
}
