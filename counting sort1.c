#include<stdio.h>
int main(){
    int n,i,x;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);  
    }
    int max=arr[0];
    for(i=1;i<n;i++){
        if(arr[i]>max)
            max=arr[i];
    }
    int temp[max+1];
    for(i=0;i<max+1;i++){
        temp[i]=0;
    }
    for(i=0;i<n;i++){
        x=arr[i];
        temp[x]=temp[x]+1;
    }
    for(i=0;i<100;i++){
        printf("%d ",temp[i]);
    }
return 0;
}
