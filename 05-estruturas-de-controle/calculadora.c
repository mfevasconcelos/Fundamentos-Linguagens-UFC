#include <stdio.h> 
#include <stdlib.h> 

void menu() {
    printf("--- Calculadora ---\n");
    printf("1. Somar\n");
    printf("2. Subtrair\n");
    printf("3. Multiplicar\n");
    printf("4. Dividir\n");
    printf("0. Sair\n");
    printf("--------------------------------\n");
    printf("Escolha uma operacao: ");
}

int main() {
    int op;
    float num1, num2, resultado;
    char continuar;

    do { 
        #ifdef _WIN32
            system("cls");
        #else
            system("clear");
        #endif

        menu();
        scanf("%d", &op); 

        if(op<0 || op>4) {
            printf("Opcao invalida! Tente novamente.\n");
            menu();
            fflush(stdin);
            scanf("%d", &op);
        }

        if(op==0) {
            printf("Programa encerrado. Ate mais!");
            break;
        }

        printf("Digite o primeiro numero: ");
        scanf("%f", &num1); 
        printf("Digite o segundo numero: ");
        scanf("%f", &num2); 

        switch (op) { 
            case 1:
                resultado = num1 + num2;
                printf("%.2f + %.2f = %.2f\n", num1, num2, resultado);
                break; 
            case 2:
                resultado = num1 - num2;
                printf("%.2f - %.2f = %.2f\n", num1, num2, resultado);
                break;
            case 3:
                resultado = num1 * num2;
                printf("%.2f * %.2f = %.2f\n", num1, num2, resultado);
                break;
            case 4:
                if (num2 != 0) { 
                    resultado = num1 / num2;
                    printf("%.2f / %.2f = %.2f\n", num1, num2, resultado);
                } else {
                    printf("Erro: Nao eh possivel dividir por zero!\n");
                }
                break;
            default: 
                printf("Opcao invalida!\n");
                break;
        }

        printf("Pressione 's' para fazer outra operacao ou qualquer outra tecla para sair: ");
        fflush(stdin); 
        scanf(" %c", &continuar); 

    } while (continuar == 's' || continuar == 'S'); 

    return 0; 
}