import java.util.*;
public class Array2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 characters of array");
        char ch[] = new char[10];
        for(int i=0;i<10;i++){
            ch[i] = sc.next().charAt(0);
        }
        for(int i=0;i<10;i++){
            System.out.print(ch[i] + " ");
        }
        for(int i=0;i<10;i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                System.out.print(ch[i]);
            }
        }
        for(int i=0;i<10;i++){
            System.out.println(Character.toUpperCase(ch[i]));
        }
    }
}