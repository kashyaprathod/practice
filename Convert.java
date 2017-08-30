import java.util.*;
public class Convert{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String s1,s2;
        long a, b;
        try{
        System.out.println("Enter two strings of your choice");
        System.out.println("==============================");
        System.out.priSystem.out.printlnntln("Enter the first string");
        a = input.nextInt();
        
        System.out.println("Enter your secong string");
        b = input.nextInt();
        
        System.out.println("the product of the given input is:");
        System.out.println(a*b);
    }catch(Exception e){
        System.out.println("wrong input");
    }
    }
}