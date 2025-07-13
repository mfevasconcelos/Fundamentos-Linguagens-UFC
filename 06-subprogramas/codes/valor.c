#include <stdio.h>

void incrementar(int numero) {
    printf("Dentro da funcao: O valor inicial do numero eh %d\n", numero);
    numero = numero + 10; // Altera a COPIA do valor
    printf("Dentro da funcao: O valor apos o incremento eh %d\n", numero);
}

int main() {
    int num = 5;
    printf("Antes da chamada da funcao: O valor do numero eh %d\n", num);

    incrementar(num); // Passa apenas uma COPIA de num

    printf("Depois da chamada da funcao: O valor do numero eh %d\n", num);
    return 0;
}