# Implementação de Subprogramas
Neste sub-repositório implemento um código em C contendo um exemplo simples de recursividade, além de explicar e demonstrar a pilha de chamadas da recursão.

Alem da função main, o código possui uma função recursiva "imprimir", nela um número inteiro é passado por parâmentro. 
A condição de parada é o número ser igual a 0, enquanto não for, a função é recursivamente chamada, ou seja ela chama a si mesma, empilhando os dados, até que a condição de parada seja atendida e finalmente a pilha seja desempilhada retornando e encerrando o programa.

## Pilha de Chamadas
Supondo que o número digitado seja 3.

1. Início:

A função main é a primeira a ser chamada e vai para a base da pilha.
Nela, é feita a primeira chamada da função imprimir.

**Pilha:**
   
    | imprimir(3) | <- Topo
    | main()      |

2. Recursão:

imprimir(3) é executada. Como 3 != 0, ela chama imprimir(2). A execução de imprimir(3) fica em pausa, aguardando o retorno de imprimir(2).

imprimir(2) é executada. Como 2 != 0, ela chama imprimir(1). A execução de imprimir(2) fica em pausa.

imprimir(1) é executada. Como 1 != 0, ela chama imprimir(0). A execução de imprimir(1) fica em pausa.

**Pilha:**
   
    | imprimir(0) | <- Topo
    | imprimir(1) |
    | imprimir(2) |
    | imprimir(3) |
    | main()      |

3. Caso Base:

imprimir(0) é executada. Agora, a condição x == 0 é verdadeira.

A função imprime o valor de x, 0.

Saída na tela: 0

A função imprimir(0) termina e é removida da pilha.

4. Desempilhando:

O controle volta para imprimir(1), que estava em pausa. Ela continua a execução da onde parou: a linha depois da chamada recursiva.

Ela executa printf("%d ", x), imprimindo seu valor de x, que é 1.

Saída na tela: 0 1

imprimir(1) termina e é removida da pilha.

**Pilha:**
    
    | imprimir(2) | <- Topo
    | imprimir(3) |
    | main()      |

O controle volta para imprimir(2). Ela imprime seu valor de x, que é 2.

Saída na tela: 0 1 2

imprimir(2) termina e é removida da pilha.

**Pilha:**
    
    | imprimir(3) | <- Topo
    | main()      |

O controle volta para imprimir(3). Ela imprime seu valor de x, que é 3.

Saída na tela: 0 1 2 3

imprimir(3) termina e é removida da pilha.

5. Retorno e encerramento:

O controle volta para a função main().

main() executa o return 0 e o programa termina.
