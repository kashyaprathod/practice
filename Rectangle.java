public class Rectangle{
    double length, breadth = 0.0;
    Rectangle(){
        length = breadth = 0;
    }
    Rectangle(double d){
        length = breadth = d;
    }
    Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    void showArea(){
        System.out.println("The area of the rectangle is: "+ length * breadth);
    }
}
class TestRect{
    void TestMe(){
        Rectangle obj1 = new Rectangle();
        obj1.showArea();
        Rectangle obj2 =  new Rectangle(7);
        obj2.showArea();
        Rectangle obj3 = new Rectangle(5,7);
        obj3.showArea();
    }
}