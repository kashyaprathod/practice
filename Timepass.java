public class Timepass{
    private int x;
    private int y;
    private void printMessage(){
        System.out.println("You have access to priavte method");
    }
    
    public static void main(){
        Timepass t1 = new Timepass();
        t1.printMessage();
        t1.x = 22;
        t1.y = 52;
        System.out.println("the value of private variale x is: " + t1.x);
        System.out.println("The value of private variable y is: " + t1.y);
    }
}