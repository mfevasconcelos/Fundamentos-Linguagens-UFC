# Threads vs. Processos
Este sub-reposiótio tem como objetivo evidenciar de forma simples e sucinta a diferença entre threads e processos.

Para entendermos o que são threads, primeiro falemos sobre processos:

## Processos
Basicamente, processo é uma instância de um programa em execução e possui seu próprio espaço de memória completamente isolado. Isso significa que cada processo tem sua própria pilha (stack), heap, e segmentos de dados e código. Esse isolamento garante que um processo não possa interferir diretamente no espaço de memória de outro, proporcionando um ambiente robusto e seguro. Se um processo falhar, os demais no sistema, em geral, não são afetados.

## Threads
Já uma thread (ou linha de execução) é a menor unidade de execução dentro de um processo. Um processo pode conter múltiplas threads, e todas elas compartilham o mesmo espaço de memória do processo pai. Isso inclui o código, os dados e os recursos alocados, como arquivos abertos. A única parte que é exclusiva de cada thread é a sua própria pilha de execução e um conjunto de registradores, que armazenam o contexto de sua execução individual.

De forma resumida, um processo é um programa em execução e threads são como mini processos compartilhando mesmo espaço de memória dentro de um processo maior. A principal diferença reside no gerenciamento de memória.

## Exemplo de concorrência
O cenário personalizado escolhido foi uma **"Rotina de Manutenção de Sistema"**, o qual realiza três tarefas:
1. Verificar o antivírus (demora 3 segundos).
2. Baixar atualizações (demora 5 segundos).
3. Realizar um backup rápido (demora 2 segundos).

### Execução sequencial (sem concorrência)
No arquivo de código em python nomeado como processo.py ilustra uma execução sequencial, sem concorrência.
Nele, as tarefas são executadas uma após a outra, uma tarefa só é iniciada quando a anterior termina.

**Tempo de execução:**

Como as tarefas serão executadas uma após a outra. O tempo total será a soma de todas as tarefas (3 + 5 + 2 = 10 segundos).

### Execução concorrente (com threads)
No arquivo de código em python nomeado como thread.py ilustra uma execução concorrente, o qual executa todas as tarefas "ao mesmo tempo".
Nele, o programa principal inicia todas as tarefas e depois aguarda até que a última terminem.

**Tempo de execução:**

O tempo total será aproximadamente o tempo da tarefa mais longa (5 segundos), pois as outras ocorreram durante esse mesmo período.
