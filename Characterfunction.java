import java.util.*;
public class Characterfunction{
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
// //         System.out.println("Enter one letter");
// //         char ch = input.next().charAt(0);
// //         if(Character.isLetter(ch)){
// //             System.out.println(ch + "is letter");
// //         }else{
// //             System.out.println(ch +" is not lettter");
// //         }
// 
// // 
// //             System.out.println("Enter a digit");
// //             char d = input.next().charAt(0);
// //             if(Character.isDigit(d)){
// //                 System.out.println(d + " is a digit ");
// //                 
// //             }else{
// //                 System.out.println(d + " is not a digit");
// //             }
//         System.out.println("Enter a character");
//         char ch =input.next().charAt(0);
// //         if(Character.isLetterOrDigit(ch)){
// //             System.out.println(ch+" is either a lettr or a digit");
// //         }else{
// //             System.out.println(ch+" is neither a letter nor a digit");
// //         }
//             if(Character.isWhitespace(ch)){
//                 System.out.println(ch +" is white space");
//             }
//             if(Character.IsWhitespace(ch)){
//             System.out.println(ch + " is unicode space" );
//             }
//         System.out.println("Enter a character");
//         String str = input.nextLine();
//         char ch = str.charAt(0);
//         if(Character.isUpperCase(ch)){
//             System.out.println(ch + " is a upper case character");
//         }else{
//             System.out.println(ch + " is not a upper case character");
//         }
        
        System.out.println("Enter a character");
        String str = input.nextLine();
        char ch = str.charAt(0);
//         if(Character.isLowerCase(ch)){
//             System.out.println(ch + " is a lower case character");
//         }else{
//             System.out.println(ch + " is not a lower case character");
//         }
        
        System.out.println(ch + " convert to upper case " + Character.toUpperCase(ch));
        
    }
}