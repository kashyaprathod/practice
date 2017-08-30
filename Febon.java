import java.util.*;
public class Febon{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num1 = -1;
        int num2 = 1;
        int febo;
        int n = sc.nextInt();
        System.out.println("Enter a number for febo of"+ n +"numbers");
        for(int i=1; i <= n; i++){
            febo = num1+num2;
            num1 = num2;
            num2 = febo;
            System.out.print(febo +" ");
        }
    }
}