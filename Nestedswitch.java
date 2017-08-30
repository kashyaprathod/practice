import java.util.*;
public class Nestedswitch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1) National");
        System.out.println("2) religous");
        System.out.println("Select any one from the menu");
        int a  =sc.nextInt();
        switch(a){
            case 1:
            System.out.println("you have selected national");
            System.out.println("enter a character R or I"); 
            char ch = sc.next().charAt(0);
                switch(ch){
                    case 'R' :
                    System.out.println("Republic day");
                    break;
                    case 'I':
                    System.out.println("Independence day");
                    default:
                    System.out.println("Invalid entry");
                }
            break;
            
            case 2:
            System.out.println("you have selected religous");
            System.out.println("enter a character D or H"); 
            char c = sc.next().charAt(0);
                switch(c){
                    case 'D':
                    System.out.println("Diwali the festival of lights");
                    break;
                    case 'H':
                    System.out.println("Holi the festival of colors");
                }
            
        }
    }
}