import java.util.*;
public class menu8 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("1) composite number ");
		System.out.println("2) smallest digit of an integer ");
		System.out.println("Choose any one from above: ");
		int choose = sc.nextInt();
		
		switch(choose){
		
		case 1: 
			System.out.println("Enter a number: ");
			int no = sc.nextInt();
			int flag = 0;
			for(int i =2;i<no;i++){
				if(no%i == 0){
					flag++;
				}
			}
			if(flag != 0){
				System.out.println("it is a comopsite number");
			}else{
				System.out.println("it is not a composite number");
			}
			break;
			
		case 2: 
			System.out.println("Enter n number: ");
			int num = sc.nextInt();
			int safe = num;
			int small =10;
			
			while(safe>0){
				int digit = safe%10;
				if(digit<small){
					small = digit;
				}
				safe /= 10;
			}
			System.out.println("samllest number is: "+small);
			break;
			
		default:
			System.out.println("Invalid entery");
		}
	}
}
