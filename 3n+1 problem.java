import java.io.*;
import java.util.*;

public class Solution {
    static int count;
    static int cnt=0;
    static void iseven(int n){
        if(n!=1){
           
        n=n/2;
        count++;
        if(n%2==0)
              iseven(n);
        else
              isodd(n);
        }
              
    }
    static void isodd(int n){
        if(n!=1){
           
        n=(3*n)+1;
        count++;
        if(n%2==0)
              iseven(n);
        else
              isodd(n);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        i=sc.nextInt();
        j=sc.nextInt();
        for(int k=i;k<=j;k++){
            count=0;
            int n=k;
            if(n%2==0)
              iseven(n);
            else
              isodd(n);  
            if(cnt<=count)
                cnt=count;  
        }
        System.out.println(i+" "+j+" "+(cnt+1));
    }
}
