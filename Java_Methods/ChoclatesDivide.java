package Java_Methods;
import java.util.*;


public class ChoclatesDivide {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int choclates=Divide(s.nextInt(),s.nextInt());
    }
    public static int Divide(int childrens,int choclates){
        if(childrens==0){
            System.out.println("No childrens");
            return 0;
        }
        if(choclates==0){
            System.out.println("No choclates");
            return 0;
        }
        if(childrens>choclates){
            System.out.println("Not enough choclates for each child");
            return 0;
        }
        int choclatesPerChild=choclates/childrens;
        System.out.println("Each child gets "+choclatesPerChild+" choclates");
        return choclatesPerChild;
    }
}
