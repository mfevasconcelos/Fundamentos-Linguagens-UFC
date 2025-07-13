# Estruturas de Controle
Este sub-repositório tem como intuito armazenar um programa simples o qual faz o uso de estruturas de seleção, repetição e controle de fluxo.

O programa escolhido foi:
## Calculadora Simples em C
Este é um programa de calculadora simples implementado em C que executa as quatro operações matemáticas básicas: adição, subtração, multiplicação e divisão. O programa permite que o usuário realize múltiplas operações em uma única sessão.

### Entre as funcionalidades:
    Menu Interativo: Apresenta um menu com as opções de operação.
    Operações Básicas: Suporta soma, subtração, multiplicação e divisão.
    Validação de Entrada: Verifica se a opção de operação é válida.
    Tratamento de Erro: Impede a divisão por zero.
    Loop de Operações: Permite realizar várias operações consecutivas até que o usuário decida sair.
    Portabilidade: Compatível com sistemas Windows e Unix/Linux/macOS (limpa a tela automaticamente).

Como este programa usa as estruturas:
### Estruturas de Seleção ( if, else if, else, switch):
    if(op<0 || op>4): Valida a entrada do usuário para garantir que ele escolha uma opção válida de operação. Se a opção for inválida, exibe uma mensagem de erro e a possibilidade de uma nova tentativa.
    if (num2 != 0): Dentro da operação de divisão, verifica se o segundo número (num2) é diferente de zero para evitar um erro de divisão por zero.
    switch (escolha): É usado para direcionar o fluxo do programa para a operação matemática correta com base na escolha do usuário. Cada case corresponde a uma operação (soma, subtração, multiplicação, divisão).

### Estruturas de Repetição (do-while):
    do { ... } while (continuar == 's' || continuar == 'S');: Este loop garante que a calculadora continue em execução, permitindo que o usuário realize várias operações em sequência. Ele executa o bloco de código pelo menos uma vez e depois continua repetindo enquanto a variável continuar for 's' ou 'S'.

### Controle de Fluxo (break):
    break;: Dentro do switch, o break é essencial para sair do bloco case após a execução da operação, evitando que o programa continue executando os cases seguintes (comportamento conhecido como "fall-through"). Quando o usuário escolhe a opção 0 (Sair), um break é usado para sair imediatamente do loop do-while.