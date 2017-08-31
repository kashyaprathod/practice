public class Wrapperclass{
    public static void main(){
    String str = "25";
    byte x = Byte.parseByte(str);
    int num = 25;
    String s1 = "987";
    int y = Integer.parseInt(s1);
    String s2 = "45.8";
    double z = Double.parseDouble(s2);
    String s3 = "105";
    int m = Integer.valueOf(s3);
    System.out.println("The valure of str = "+str);
    System.out.println("The value of num is "+num);
    System.out.println(num*5);
    System.out.println(x*5);
    System.out.println(y*3);
    
    }
}