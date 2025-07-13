# Descrições Sintáticas e Semânticas
Este sub-reposiório armazena uma mini-grámatica fictícia de uma linguagem que eu mesmo inventei com exemplo de análise léxica.

## Elementos básicos (Tokens):
Palavras-Chave (Keywords): se, enquanto, para, retorna, principal, imprimir
Identificadores (Identifiers): exs.: minhaVariavel, calcularSoma, numero1
Operadores (Operators): 
Aritméticos: +, -, *, /, %
Comparação: ==, !=, <, >, <=, >=
Lógicos: && (e), || (ou), ! (negação)
Atribuição: =
Literais (Literals): 
Numéricos: 10, 3.14, -5
Strings: "Olá, Mundo!" (frase), 'texto' (palavra)
Booleanos: 1 (verdadeiro), 0 (falso)
Tipos de variáveis e funções: inteiro, flutuante, vazio
Separadores/Delimitadores (Separators/Delimiters): 
    ( ) (parâmetros, condições);
    {} (bloco de código);
    [ ] (vetores);
    ; e , (delimitadores) .
Comentários (Comments): //comentário

## Regras de sintaxe:
1. Um programa é uma sequência de declarações.
2. Uma declaração pode ser uma declaração de variável, uma chamada de função, uma estrutura condicional, ou uma estrutura de laço.
3. Uma declaração de variável começa com o tipo da variável, seguida de um identificador, o operador de atribuição =, uma expressão, e termina com ;.
4. Uma expressão pode ser um literal numérico, um identificador, ou uma operação entre duas expressões e um operador aritmético.
5. Uma estrutura condicional começa com se, seguida de uma expressão booleana entre () e o bloco de código {...}. Pode opcionalmente ter um senao com outro bloco {...}.
6. Uma estrutura de laço começa com enquanto, seguida de uma expressão booleana entre () e o bloco de código {...}.
7. Uma estrutura de laço 'para' começa com 'para', seguida de uma inicialização, uma condição e um incremento entre ( ), e um bloco de código { . . . }.
8. Um bloco de código é um conjunto de declarações entre chaves {}.
9. Uma expressão booleana é composta por duas expressões separadas por um operador de comparação.

## Exemplo de análise léxica:
    // exemplo simples
    inteiro principal() {
    inteiro contador = 10; 
    se(contador > 0) { 
    imprimir("Contador: ", contador); 
    }
    }
### Saída do Lexer:
O lexer percorre o código gerando uma lista de tokens:
    TOKEN_TIPO: COMENTARIO, VALOR: "// exemplo simples"
    TOKEN_TIPO: TIPO, VALOR: "inteiro"
    TOKEN_TIPO: PALAVRA_CHAVE, VALOR: "principal"
    TOKEN_TIPO: SEPARADOR, VALOR: "("
    TOKEN_TIPO: SEPARADOR, VALOR: ")"
    TOKEN_TIPO: SEPARADOR, VALOR: "{"
    TOKEN_TIPO: TIPO, VALOR: "inteiro"
    TOKEN_TIPO: IDENTIFICADOR, VALOR: "contador"
    TOKEN_TIPO: OPERADOR_ATRIBUICAO, VALOR: "="
    TOKEN_TIPO: LITERAL_NUMERICO, VALOR: "10"
    TOKEN_TIPO: SEPARADOR, VALOR: ";"
    TOKEN_TIPO: PALAVRA_CHAVE, VALOR: "se"
    TOKEN_TIPO: SEPARADOR, VALOR: "("
    TOKEN_TIPO: IDENTIFICADOR, VALOR: "contador"
    TOKEN_TIPO: OPERADOR_COMPARACAO, VALOR: ">"
    TOKEN_TIPO: LITERAL_NUMERICO, VALOR: "0"
    TOKEN_TIPO: SEPARADOR, VALOR: ")"
    TOKEN_TIPO: SEPARADOR, VALOR: "{"
    TOKEN_TIPO: PALAVRA_CHAVE, VALOR: "imprimir"
    TOKEN_TIPO: SEPARADOR, VALOR: "("
    TOKEN_TIPO: LITERAL_STRING, VALOR: "\"Contador: \""
    TOKEN_TIPO: SEPARADOR, VALOR: ","
    TOKEN_TIPO: IDENTIFICADOR, VALOR: "contador"
    TOKEN_TIPO: SEPARADOR, VALOR: ")"
    TOKEN_TIPO: SEPARADOR, VALOR: ";"
    TOKEN_TIPO: SEPARADOR, VALOR: "}"