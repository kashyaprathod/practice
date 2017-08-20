import java.util.*;
public class numbers9 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		int greatest;
		int hcf = 0;
		int lcm = 1;
		int num1,num2;
		
		for(int i=1;i<=a;i++){
			
			if(a%i == 0 && b%i == 0){
				
				if(i>hcf){
					hcf = i;
				}
			}
		}
		System.out.println("HCF of "+ a + " and " +  b + " is "+hcf);
		
		if(a > b){
			num1 = a;
			num2 = b;
		}else{
			num1 = b;
			num2 = a;
		}
		
		for(int i =1;i<=num1;i++){
			
			if((num1*i)%num2 == 0){
				lcm = num1*i;
				break;
			}
		}
		
		System.out.println("LCM of "+ num1 + " and " +  num2 + " is "+lcm);
	}
}
