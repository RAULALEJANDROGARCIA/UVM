import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int hei=0, fre=0;
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
          height[height_i] = in.nextInt();
            if(hei<height[height_i]){
                 hei=height[height_i];
                fre=1;
               }
            else if(hei==height[height_i])
                fre++;
             }
        System.out.print(fre);
    }
}