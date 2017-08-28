import java.util.Scanner;
public class calculator{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int fnum, snum, answer;
        System.out.println("Enter your first number: ");
        fnum = input.nextInt();
        System.out.println("Enter your second number: ");
        snum = input.nextInt();
        answer = fnum+snum;
        System.out.println("The sum of your given two numbers is: "+ answer);
    }
}