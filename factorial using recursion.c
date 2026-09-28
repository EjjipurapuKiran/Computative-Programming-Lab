#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int res=fact(n);
    printf("%d",res);
}
int fact(int a){
    if(a==0||a==1)
        return 1;
    else 
        return a*fact(a-1); 
}
