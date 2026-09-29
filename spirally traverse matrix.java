import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int top,bottom,right,left;
        top=0;
        bottom=n-1;
        left=0;
        right=m-1;
        
        while (top <= bottom && left <= right) {
            for ( j = left; j <= right; j++) {
                System.out.print(a[top][j] + " ");
            }
            top++;

            for ( i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for ( j = right; j >= left; j--) {
                    System.out.print(a[bottom][j] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for ( i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
}

