public class Midpoint{
    public static void Find(int a,int b){
        if(a>b)
            return;
        while(++a < --b);
        System.out.println("The midpoint is: "+ a);
    }
}