#include <stdio.h>

int main() {
    int n, i;
    scanf("%d", &n);
    int arr[n];
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int max_sofar = arr[0];
    int max_end = 0;
    for (i = 0; i < n; i++) {
        max_end += arr[i];
        
        if (max_sofar < max_end){
            max_sofar = max_end;
        }
        if (max_end < 0){
            max_end = 0;
        }
    }

    printf("%d\n", max_sofar);
    return 0;
}
