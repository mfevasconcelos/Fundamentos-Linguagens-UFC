#include <stdio.h>

void incrementar(int *numeroPtr) { 
    printf("Dentro da funcao: O valor inicial apontado pelo ponteiro de numero eh %d\n", *numeroPtr);
    *numeroPtr = *numeroPtr + 10; // Altera o valor no ENDERECO de memoria
    printf("Dentro da funcao: O valor apos a alteracao apontado pelo ponteiro de numero eh %d\n", *numeroPtr);
}

int main() {
    int num = 5;
    printf("Antes da chamada da funcao: O valor do numero eh %d\n", num);

    incrementar(&num); // Passa o ENDERECO de memoria de num

    printf("Depois da chamada da funcao: O valor do numero eh %d\n", num); // num agora será 15
    return 0;
}