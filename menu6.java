import java.util.*;
public class menu6 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("1) 0,3,8,15,24… n terms");
		System.out.println("2) S= 1/2 + 3/4 + 5/6 + 7/8 …. 19/20");
		System.out.println("Choose any one from above: ");
		int choose = sc.nextInt();
		
		switch(choose){
		
		case 1:
			System.out.println("Enter n: ");
			int n = sc.nextInt();
			for(int i = 1;i<=n;i++){
				int k = (int)Math.pow(i, 2) - 1;
				System.out.println(k);
			}
			break;
			
		case 2: 
			double sum = 0;
			for(double i=1,j=2;i<=4;i+=2,j+=2){
				sum += (i/j);
			}
			System.out.println(sum);
			break;
		}
	}
}
