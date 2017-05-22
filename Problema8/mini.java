import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long[] sum = new long [5];
        sum[0]=0;
        sum[1]=0;
        sum[2]=0;
        sum[3]=0;
        sum[4]=0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            if (arr_i!=0)
                sum[0]+= arr[arr_i];
            if (arr_i!=1)
                sum[1]+= arr[arr_i];
            if (arr_i!=2)
                sum[2]+= arr[arr_i];
            if (arr_i!=3)
                sum[3]+= arr[arr_i];
            if (arr_i!=4)
                sum[4]+= arr[arr_i];
          }
        long max=sum[0],min= sum[0];
        for(int arr_i=1; arr_i < 5; arr_i++){
            if(max<sum[arr_i])
                max=sum[arr_i];
            if(min>sum[arr_i])
                min=sum[arr_i];
        }
        System.out.print(""+min+" "+max);
    }
}
