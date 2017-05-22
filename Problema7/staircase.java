import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         for(int j=1; j<=n; j++){
             for(int i=n-1; i>=0; i--)
             {
                 if (i>=j)
              System.out.print(" ");
                 else
              System.out.print("#");
                     
             }
             System.out.println(" ");
          }
    }
}