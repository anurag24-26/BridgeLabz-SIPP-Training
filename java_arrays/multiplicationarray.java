package java_arrays;
import java.util.*;
class muliplicationarray{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int[] array=new int[12];
    
        for(int i=0;i<=10;i++){

           array[i]=(i+1)*number;
          
        }
        for (int i = 0; i < 10; i++) {
            System.out.println( number +"*"+(i+1)+"="+array[i]);
        }

        s.close();
    }
}