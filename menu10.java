import java.util.*;
public class menu10 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("1) Factors of a number");
		System.out.println("2) Factorial of a number");
		System.out.println("Choose any one from above: ");
		int choose = sc.nextInt();
		
		switch(choose){
		
		case 1:
			System.out.println("Enter a number");
			int no = sc.nextInt();
			System.out.println("Factors are : ");
			for(int i=1;i<no;i++){
				if(no%i == 0){
					System.out.print(i + " " );
				}
			}
			break;
			
		case 2 :
			System.out.println("Enter a number");
			int num = sc.nextInt();
			int fact = 1;
			for(int i=1;i<=num;i++){
				fact *= i; 
			}
			System.out.println("Factorial is : "+ fact);
			break;
			
		default:
			System.out.println("Invalid entry.");
		}
	}
}
