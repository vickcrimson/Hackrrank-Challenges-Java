/*The challenge here is to read _n_ lines of input until you reach EOF, then number and 
print all _n_ lines of content. */

import java.util.*;
public class Java_EOF { // Change the name of this class to "Solution" otherwise it won't pass 

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner txt = new Scanner(System.in);
          int lineNumber = 0;
          while(txt.hasNext()){
              String text = txt.nextLine();
              lineNumber++;
              System.out.println(lineNumber + " " + text);
          }
          txt.close();
    }
}
