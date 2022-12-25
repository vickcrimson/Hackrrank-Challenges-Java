
import java.util.*;

public class Static_Initializer { // Change this class name to "Solution".

    static int  B , H;
    static boolean  flag = true;
    static {
        Scanner ar = new Scanner(System.in);
        B = ar.nextInt();
        H = ar.nextInt();

        if ( B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");}

        ar.close();
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
