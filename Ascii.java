public class Ascii{
     
    public static void printascii(){
        char ch = 'A';
        System.out.println("printing A to Z");
        for(char i=1;i<=26;i++){
            System.out.println(ch);
            ch++;
        }
        for(char ch1 = 'a';ch1<='z';ch1++){
            System.out.println(ch1);
        }
        for(int i = 65; i<=90;i++){
            char ch2  = (char)i;
            System.out.println(i + " "+ ch2);
        }
    }
    public static void main(){
       printascii();
        
    }
}