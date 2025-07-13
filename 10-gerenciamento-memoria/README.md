# Gestão de Memória: C e Java
Este sub-repositório envidencia a diferença entre a gestão de memória de duas importantes linguagens vistas durante minha graduação: C e Java.

Gestão de memória está entre as principais características que diferenciam as duas linguagens. Enquanto em C o programador tem controle total e responsabilidade manual sobre a alocação e liberação de memória, um poder o qual exige grande cuidado. Em Java, esse processo é em grande parte automatizado, abstraído do desenvolvedor através de um sistema de coleta de lixo (Garbage Collection), oferecendo mais segurança em detrimento de um certo nível de controle.

## C
A gestão de memória em C é explícita e manual. O programador interage diretamente com a memória do sistema através de um conjunto de funções da biblioteca padrão (stdlib.h). 

**As principais funções são:**

- malloc(size_t size): Aloca um bloco de memória do tamanho especificado em bytes na heap (uma área de memória para alocação dinâmica) e retorna um ponteiro para o primeiro byte do bloco alocado. O conteúdo da memória alocada não é inicializado.
- calloc(size_t num, size_t size): Semelhante à malloc, mas aloca memória para um array de num elementos, cada um com size bytes. Uma diferença crucial é que calloc inicializa a memória alocada com o valor zero.
- realloc(void *ptr, size_t new_size): Redimensiona um bloco de memória previamente alocado por malloc ou calloc.
- free(void *ptr): Libera o bloco de memória apontado por ptr, tornando-o disponível para uso futuro.

O uso de ponteiros é central para esse modelo. Ponteiros são variáveis que armazenam endereços de memória, permitindo o acesso e a manipulação direta dos dados nesses locais.

**Implicações do Modelo Manual:**

- Flexibilidade e Desempenho: O controle direto permite otimizações de baixo nível, potencialmente resultando em programas mais rápidos e com menor consumo de memória.
- Responsabilidade do Programador: O desenvolvedor é inteiramente responsável por liberar toda memória que aloca.
- Riscos Elevados: A falha em liberar a memória (free) resulta em vazamentos de memória (memory leaks), onde o programa consome memória desnecessariamente, podendo levar à exaustão dos recursos do sistema. Outros erros comuns incluem o acesso a ponteiros nulos ou inválidos (dangling pointers) e a corrupção de memória, quando se escreve fora dos limites do bloco alocado, levando a comportamentos indefinidos e falhas de segurança.

## Java
Java adota um modelo de gerenciamento de memória automático. O programador cria objetos usando a palavra-chave new, e a Máquina Virtual Java (JVM) se encarrega de alocar o espaço necessário na heap.

O componente chave desse sistema é o Garbage Collector (GC). O GC é um processo de baixo nível que roda periodicamente, identificando e descartando objetos na heap que não estão mais em uso pelo programa, ou seja, que não possuem mais nenhuma referência ativa apontando para eles.

**Como o Garbage Collector Funciona:**

- A JVM organiza a heap em diferentes "gerações" (como a Young Generation e a Old Generation) para otimizar o processo de coleta.
- Novos objetos são criados na Young Generation.
- Quando essa área fica cheia, uma coleta de lixo "menor" (minor GC) é executada. Objetos que ainda estão em uso são movidos para outra parte da Young Generation (espaços de sobrevivência).
- Objetos que sobrevivem a vários ciclos de coletas menores são "promovidos" para a Old Generation.
- Quando a Old Generation se enche, uma coleta de lixo "maior" (major GC ou full GC) ocorre, que é um processo mais demorado e que pode causar pausas na execução da aplicação (conhecidas como "stop-the-world pauses").

**Implicações do Modelo Automático:**

- Segurança e Simplicidade: O programador não precisa se preocupar em liberar memória manualmente, o que elimina toda uma classe de erros comuns em C, como vazamentos de memória por esquecimento -do free.
- Menor Risco de Erros: A ausência de ponteiros explícitos e a gestão automática reduzem drasticamente as chances de corrupção de memória.
- Overhead de Desempenho: O processo de Garbage Collection consome tempo de CPU e memória, o que pode impactar o desempenho da aplicação, especialmente as pausas do GC em sistemas de tempo real ou de alta performance.
- Abstração: O desenvolvedor tem menos controle sobre o layout exato da memória e o momento exato em que a memória é liberada.

## Quadro Comparativo:
