import java.util.*;
public class menu5 {
	public static void main(String args[]){
		Scanner sc  = new Scanner(System.in);
		System.out.println("1) Buzz number");
		System.out.println("2) GCD");
		System.out.println("Chosse any one from above: ");
		int choose = sc.nextInt();
		
		switch(choose){
		
		case 1:
			System.out.println("Enter a number: ");
			int no = sc.nextInt();
			int end = no%10;
			if(end == 7 || no%7 == 0){
				System.out.println("Number is buzz number.");
			}else{
				System.out.println("Number is not buzz number.");
			}
			break;
		
		case 2:
			System.out.println("Enter first number: ");
			int no1 = sc.nextInt();
			System.out.println("Enter second nmuber: ");
			int no2 = sc.nextInt();
			int hcf = 0;
			for(int i =1;i<=no1;i++){
				if(no1%i == 0 && no2%i == 0){
					if(i>hcf){
						hcf = i;
					}
				}
			}
			System.out.println("HCF is: "+hcf);
		}
	}
}
