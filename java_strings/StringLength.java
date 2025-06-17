package java_strings;
import java.util.*;
public class StringLength {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=s.next();
        int count=0;

        try{
            while (true) {
                char ch=str.charAt(count);
                count++;
            }
        }catch(StringIndexOutOfBoundsException e ){
            System.out.println(count);
        }
    }
}
