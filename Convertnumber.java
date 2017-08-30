import java.util.*;
public class Convertnumber{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String s1,s2;
        long a, b;
        try{
        System.out.println("Enter two strings of your choice");
        System.out.println("==============================");
        System.out.println("Enter the first string");
        s1 = input.nextLine();
        a = Long.parseLong(s1);
        System.out.println("Enter your secong string");
        s2 = input.nextLine();
        b = Long.parseLong(s2);
        System.out.println("the product of the given input is:");
        System.out.println(a*b);
    }catch(Exception e){
        System.out.println("wrong input")
    }
    }
}