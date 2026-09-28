import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=majority(arr,n);
        System.out.println(res);
        
    }

    public static int majority(int a[],int s){
        int i,j;
        for(i=0;i<s;i++){
           int key=a[i];
           int m=0;
           for(j=0;j<s;j++){
              if(key==a[j]){
                 m++;
              }
           }
           if(m> ((s/2))){
              return key;
           }
        }
        return -1;
    }
       
}
