import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p=0,ne=0,z=0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0)
                p+=1;
            else
                if (arr[arr_i]<0)
                ne+=1;
                else
                 z+=1;
         }
        System.out.println((float)p/n);
        System.out.println((float)ne/n);
        System.out.println((float)z/n);
    }
}