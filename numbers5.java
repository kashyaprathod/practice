import java.util.*;
public class numbers5 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Check if number is perfect number or not.");
		int no = sc.nextInt();
		int k = 1;
		for(int i = 1;i<no;i++){
			if(no%i == 0){
				 k*=i;
			}
		}
		
		if(k == no){
			 System.out.println(no + " is a perfect number");
		 }else{
			 System.out.println(no + " is not a perfect number");
		 }
	}
}
