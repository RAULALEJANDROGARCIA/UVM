import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hora = sc.next();
        String[] horasplit= hora.split(":");
        String[] h24= horasplit[2].split("(?<=\\G.{2})");
        if(h24[1].equals("PM")){
            if(!horasplit[0].equals("12")){
            int temp=12+Integer.parseInt(horasplit[0]);
            horasplit[0]=Integer.toString(temp);
            }
           
         }
        else
         if(horasplit[0].equals("12"))
            horasplit[0]="00";
            
        System.out.println(""+horasplit[0]+":"+horasplit[1]+":"+h24[0]);
    }
}