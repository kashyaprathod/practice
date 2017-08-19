import java.util.*;
public class numbers3 {
	
	public void digits(){
		
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Eneter a number");
	int no = sc.nextInt();
	int safe = no;
	String s = Integer.toString(safe);
	int n = s.length();
	System.out.println(no + " has " + n + " digits");
	int highest=0,lowest=10;int count = 0;int first = 0;
	int last = safe%10;
	while(safe>0){
		int digit = safe%10;
		count++;
		if(digit>highest){
			highest = digit;
		}
			
		if(digit<lowest){
			lowest = digit;
			safe = safe/10;
		}
		
	}
	first = no /(int)Math.pow(10, count-1) ;
	
	
	System.out.println("Highest digit is "+ highest);
	System.out.println("lowest digit is " + lowest);
	System.out.println("The sum of the highest and lowest digit is: " + (highest+lowest));
	System.out.println("The product of the highest and lowest digit is: "+ (highest *lowest));
	System.out.println("The sum of the first and last digit is: "+ (last + first));
	System.out.println("The product of the first and last digit is: "+ (last * first));
	}
}
