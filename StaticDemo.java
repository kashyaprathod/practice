public class StaticDemo{
    static int a = 56;
    static int b = 23;
    
    static void callMe(){
        System.out.println("a = "+a);
    }
}

class StaticByName{
    void myMethod(){
        StaticDemo.callMe();
        System.out.println("b = "+StaticDemo.b);
    }

}