import java.util.*;
public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int y[] = new int[10];
        
        int x[] = {65,92,301,786,1};
        int len = x.length;
        //System.out.println("Length of array x = " + len);
        //System.out.println("Elements of array x are: ");
        System.out.println("Enter 5 elements of array.");
        for(int i=0;i<10;i++){
            //System.out.println(x[i]);
            y[i] = sc.nextInt();
            
        }
        System.out.println("all elements of arrya are: ");
        for(int i=0;i<10;i++){
            System.out.println(y[i]);
           
        }        
        System.out.println("even elements of array are: ");
        for(int i=0;i<10;i++){
            if(y[i]%2 == 0){
                System.out.println(y[i]);
            }
           
        }
    }
}