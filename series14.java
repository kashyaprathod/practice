package series;
import java.util.*;
public class series14 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1) A-Z");
		System.out.println("2) a-z");
		System.out.println("select any one from the menu: ");
		int select = sc.nextInt();
		
		switch(select){
			case 1:
				for(char ch='A';ch<='Z';ch++){
					System.out.println(ch);
				}
				break;
				
			case 2:
				for(char ch = 'a';ch<='z';ch++){
					System.out.println(ch);
				}
				break;
				
			default:
				System.out.println("Invalid Input");
		}
	}
}
