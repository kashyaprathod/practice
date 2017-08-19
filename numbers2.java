import java.util.*;
public class numbers2 {
	Scanner sc = new Scanner(System.in);
	
	public void CheckPrimeOrComposite(){
		System.out.println("enter a number to check if it is prime or composite: ");//check if a no is prime or composite
		int no = sc.nextInt();
		int count=0;
		for(int i =2;i<no;i++){
			if(no%i == 0){
				count++;
				break;
			}
		}
		if(count == 0){
			System.out.println(no + " is a prime number");
		}else{
			System.out.println(no + " is a composite number");
		}//end of check
	}
	
	public void PrintPrimeComposite(){
		System.out.println("Enter start of range: ");
		int start =sc.nextInt();
		System.out.println("Enter end of range");
		int end = sc.nextInt();
		int flag = 0;
		
		System.out.println("prime numbers between "+ start+" and "+end+" are: ");//print prime numbers in range
		for(int i=start;i<=end;i++){
			flag = 0;
			for(int j=2;j<i;j++){
				
				if(i%j == 0){
					flag++;
					break;
				}
			}
			if(flag == 0){
				System.out.print(i+ " ");
			}
			
		}//end printing prime numbers in range
		
		System.out.println();
		
		System.out.println("composite numbers between "+ start+" and "+end+" are: ");//print composite numbers in range
		for(int i=start;i<=end;i++){
			flag = 0;
			for(int j=2;j<i;j++){
				
				if(i%j == 0){
					flag++;
					break;
				}
			}
			if(flag != 0){
				System.out.print(i+ " ");
			}
		}
	}
	
	public static void main(String args[]){
		numbers2 n1 = new numbers2();
		n1.CheckPrimeOrComposite();
		n1.PrintPrimeComposite();
		
		
		
	}
}