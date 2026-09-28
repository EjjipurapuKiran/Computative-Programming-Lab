#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int max=arr[0];
    int min=arr[0];
    int m=0;
    int o=0;
    for(int i=1;i<n;i++){
        if(arr[i]<min){
            min=arr[i];
            m=i;
        }
        if(arr[i]>max){
            max=arr[i];
            o=i;
        }
    }
    int temp=arr[m];
    arr[m]=arr[o];
    arr[o]=temp;
    for(int i=0;i<n;i++)
    {
    printf("%d ",arr[i]);
    }
    return 0;   
}
