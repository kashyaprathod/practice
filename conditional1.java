import java.util.*;
public class conditional1 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total cost: ");
		double total_cost = sc.nextInt();
		double discount, amount;
		if(total_cost<2000){
			discount = (5/100) * total_cost;
			amount = total_cost - discount;
		}
		else if(total_cost>=2001 && total_cost<=5000){
			discount = (25/100) * total_cost;
			amount = total_cost - discount;
		}
		else if(total_cost>=5001 && total_cost<=10000){
			discount = (35/100) * total_cost;
			amount = total_cost - discount;
		}
		else{
			discount = (50/100) * total_cost;
			amount = total_cost - discount;
		}
		
		System.out.println("Total cost: " + total_cost);
		System.out.println("Amount to be paid: " + amount);
	}
	
}
