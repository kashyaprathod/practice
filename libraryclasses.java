import java.util.*;
public class libraryclasses{
    Scanner sc = new Scanner(System.in);
    public static void Stringworking(){   //string using character array initialization
        char data[] = {'C', 'O', 'M', 'P', 'U', 'T', 'E', 'R'};
        String st = new String(data);
        String st1 = new String(data,3,3);
        byte data1[] = {74,65,77,69,83,32,66,79,78,68};
        byte data2[] = {75,65,83,72,89,65,80};
        String st3 = new String(data1,6,4);
        String st2 = new String(data2);
        System.out.println(st3);
    }
    public void enter(){
        System.out.println("Enter full name: ");
        String s1 = sc.nextLine();
        System.out.println("Entered name is: "+ s1);
    }
    public static void main(String args[]){
        libraryclasses l1 = new libraryclasses();
        l1.enter();
    }
}