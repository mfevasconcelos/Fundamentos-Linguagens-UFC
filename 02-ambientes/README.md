# Ambientes de Programação

Este sub-repositório contém um diagrama mostrando os diferentes funcionamentos dos ambientes de programação ("ou "tradutores") Compiladores, Interpretadores e Máquinas Virtuais com o objetivo de tornar evidente diferenças, vantagens e desvantagens dos mesmos.

## Diagrama:
![Diagrama de Ambientes](https://github.com/mfevasconcelos/Fundamentos-Linguagens-UFC/blob/main/02-ambientes/diagrama-ambientes.jpg)

Para tornar claro as diferenças:

## Compiladores
Um compilador é como um tradutor de livros. Você entrega o livro inteiro (código-fonte) a ele, e ele traduz tudo para um novo livro em outra língua (código de máquina ou um formato executável).

### Como funciona: 
O compilador lê todo o código de uma vez, verifica se há erros de sintaxe e lógica, otimiza-o e, finalmente, gera um arquivo executável. Esse arquivo pode ser rodado diretamente pelo computador, sem a necessidade do código original ou do compilador novamente.

### Vantagens: 
O código compilado geralmente é mais rápido para executar, pois já está todo "pronto" para a máquina. É como ter o livro já traduzido: pode lê-lo diretamente.

### Desvantagens: 
Qualquer mudança no código original exige que seja recompilado, o que pode levar tempo em projetos grandes. Se houver um erro, só o descobre depois que a compilação termina.

### Exemplos: 
C, C++, Pascal.

## Interpretadores
Pense em um interpretador como um tradutor simultâneo. Fala uma frase (uma linha do código), ele a traduz e a executa imediatamente. Depois, fala a próxima frase, e ele repete o processo.

### Como funciona: 
O interpretador lê e executa o código linha por linha. Ele não cria um arquivo executável separado. Cada vez que é executado o programa, o interpretador precisa traduzir as linhas novamente.

### Vantagens: 
É mais flexível e fácil de testar e depurar, pois é possível vê os resultados (ou erros) à medida que o código é executado. Não é necessário compilar tudo de novo para pequenas mudanças.

### Desvantagens: 
Geralmente é mais lento que o código compilado, já que a tradução acontece a cada execução.

### Exemplos: 
Python, JavaScript, PHP, Ruby.

## Máquinas Virtuais (VMs)
Uma máquina virtual (VM) é um programa que simula um ambiente computacional. É como um computador dentro de outro computador. Em programação, especificamente, ela geralmente executa um tipo de código intermediário.

### Como funciona: 
Em linguagens como Java, o código-fonte é primeiro compilado para um formato intermediário chamado bytecode. Esse bytecode não é código de máquina, mas um conjunto de instruções que a máquina virtual entende. A VM, por sua vez, interpreta e executa esse bytecode na máquina real. Isso permite que o mesmo bytecode funcione em diferentes sistemas operacionais (Windows, Linux, macOS), desde que cada um tenha sua própria VM instalada.

### Vantagens: 
Proporciona portabilidade. O código é escrito uma vez e roda em qualquer lugar que tenha a VM apropriada. Também oferece um ambiente isolado para a execução do programa.

### Desvantagens: 
Pode ter um pequeno impacto no desempenho comparado ao código puramente compilado para uma arquitetura específica.

### Exemplos: 
Java Virtual Machine (JVM) para Java, Common Language Runtime (CLR) para .NET.
