import java .util.*;
public class Array3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of 5 students: ");
        String name[] = new String[5];
        for (int i=0;i<5;i++){
            name[i] = sc.nextLine();
        }
        for (int i=0;i<5;i++){
            System.out.println(name[i]);
        }
        for (int i=0;i<5;i++){
            System.out.print(name[i] + " ");
        }
    }
}