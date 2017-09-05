import java.util.*;
public class series{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter number to generate series");
        int n = input.nextInt();
        for(int i =1; i<=n; i++){
            sum += (int)Math.pow(i,2);
        }
        System.out.println("sum = "+sum);
    }
}