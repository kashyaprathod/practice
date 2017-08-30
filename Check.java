import java.util.*;
public class Check{
    public static void main(String args[]){
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character of your choice: ");
        ch = input.next().charAt(0);
        if(ch >= 'A' && ch <='Z'){
            System.out.println(ch +" is a capital letter");
            ch +=32;
            System.out.println(ch + " converted to lower case");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is a lower case letter");
        }
        else if(ch >= '0' && ch <= '9'){
            System.out.println(ch + " is a digit");
        }
        else{
            System.out.println(ch + " is neither a letter nor a digit");
        }
    }
}