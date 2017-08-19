import java.util.*;
public class numbers1{
	Scanner sc = new Scanner(System.in);
	
	public void CheckEvenOdd(){
		System.out.println("enter a number to check if it is evem or odd: ");
		int no = sc.nextInt();
		if(no%2 == 0){
			System.out.println(no + " is a even number");
		}else{
			System.out.println(no+" is a odd number");
		}
	}
	
	public void PrintEvenOddRange(){
		System.out.println("Printing even and odd numbers in range.");
		System.out.println("Enter start of range: ");
		int start = sc.nextInt();
		System.out.println("Enter end of range: ");
		int end = sc.nextInt();
		System.out.println("even numbers in range are: ");
		if(start%2 == 0){
			for(int i=start;i<=end;i+=2){
				System.out.print(i + " ");
			}
		}else{
			for(int i = start+1;i<=end;i+=2){
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("odd numbers in range are: ");
		if(start%2 != 0){
			for(int i = start;i<=end;i+=2){
				System.out.print(i + " " );
			}
		}else{
			for(int i = start+1;i<=end;i+=2){
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String args[]){
		numbers1 n1 = new numbers1();
		n1.CheckEvenOdd();
		System.out.println();
		n1.PrintEvenOddRange();
	}
}
