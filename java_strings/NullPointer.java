package Java_Strings;

public class NullPointer {
    public static void main(String[] args) {
        String s=null;
    try{
        System.out.println("New string:"+s.length());

    }catch(NullPointerException e){
        System.out.println("Exception"+e.getMessage());
    }
    }
}
