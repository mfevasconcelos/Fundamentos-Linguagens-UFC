# Subprogramas
Este sub-repositório tem como objetivo evidenciar as principais diferenças entre passagem por valor e por referência em duas diferentes lingugagens: C e Java.

## C

### Por valor:
Quando é passado parâmetros por valor, uma cópia do valor da variável original é enviada para a função. Isso significa que qualquer alteração feita na variável dentro da função não afetará a variável original fora dela.

Saída do subprograma:
![saída por valor C](https://github.com/mfevasconcelos/Fundamentos-Linguagens-UFC/blob/main/06-subprogramas/sa%C3%ADdas/saida-por-valor-c.png)

No exemplo, a função incrementar recebe uma cópia de num.
Quando numero é alterado dentro da função, apenas a cópia é alterada, a variável original não se afeta.
Por isso, após a chamada da função, o valor de num permanece o mesmo do inicio.

### Por referência:
Em C, a passagem por referência, por outro lado, envia o endereço de memória da variável original para a função. Isso é feito usando ponteiros. Quando o valor através do ponteiro é manipulado dentro da função, o valor da variável original é efetivamente modificado.

Saída do subprograma:
![saída por referência C](https://github.com/mfevasconcelos/Fundamentos-Linguagens-UFC/blob/main/06-subprogramas/sa%C3%ADdas/saida-por-referencia-c.png)

A função incrementar agora aceita um ponteiro para inteiro (int* numeroPtr).
Ao chamar a função, ao invés de passar apenas uma cópia para num, agora é passado o endereço de memória.
Quando *numeroPtr é modificado, o valor da variável original num é alterado, resultando em novo valor diferente do inicio do programa.

## Java
Em Java, todos os parâmetros são passados por valor. No entanto, o que é "passado por valor" difere se estamos falando de tipos primitivos ou de objetos.

## Por valor (Tipos primitivos):
Quando é passado um tipo primitivo para um método em Java, uma cópia do valor da variável é feita e passada para o método. Qualquer alteração nesse valor dentro do método não afetará a variável original. Isso é o equivalente direto da "passagem por valor" em C.

Saída do subprograma:
![saída por valor Java](https://github.com/mfevasconcelos/Fundamentos-Linguagens-UFC/blob/main/06-subprogramas/sa%C3%ADdas/saida-por-valor-java.png)

A função incrementar recebe uma cópia de num.
A modificação dentro do método afeta apenas a cópia.
Num na main permanece o mesmo.

## Por referência (Objetos):
Quando um objeto é passado para um método em Java, o que é passado é a referência (o endereço de memória) para aquele objeto. Isso significa que se usar a referência para modificar o estado interno do objeto (ex.: algum atributo), a alteração será visível fora do método, pois está sendo trabalhado dentro do objeto original.

Saída do subprograma:
![saída por referência Java](https://github.com/mfevasconcelos/Fundamentos-Linguagens-UFC/blob/main/06-subprogramas/sa%C3%ADdas/saida-por-referencia-java.png)

Quando modificarPessoa é chamado com pessoa como parâmetro, a referência para o objeto Pessoa("Victor", 23) é passado.
Dentro do método, pessoa.idade = 20; e pessoa.nome = "Maria"; modificam os atributos do objeto original, pois pessoa ainda aponta para ele.
Por isso, após o método, mostra nome Maria e idade 20 a declaração inicial.
