#include <stdio.h>
#include <stdlib.h>

int imprimir(int x) {
    if (x == 0)
        printf("%d ", x);
    else {
        // printf("%d ", x);
        imprimir(x - 1);
        printf("%d ", x);
    }
}
int main() {
    int n;
    printf("Digite um numero maior que zero: ");
    scanf("%d", &n);
    imprimir(n);
    return 0;
}