import java.util.*;
public class menu2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("1) 1 + 2 + 3 + 4....n");
		System.out.println("2) 1 × 2 × 3 × 4....n");
		System.out.println("Select any one from the above menu: ");
		int select = sc.nextInt();
		int n;
		int s = 0;
		int s1 = 1;
		switch(select){
		case 1:
			System.out.println("Enter n: ");
			n = sc.nextInt();
			for(int i = 1;i<=n;i++){
				s += i;
			}
			System.out.println(s);
			break;
			
		case 2:
			System.out.println("Enter n: ");
			n = sc.nextInt();
			for(int i =1;i<=n;i++){
				s1 *= i;
			}
			System.out.println(s1);
			break;
			
		default:
			System.out.println("Invalid entry.");
		}
	}
}
