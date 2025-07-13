# Análise Funcional de Dados com JavaScript
Este sub-repositório contém uma demonstração prática com aplicação de conceitos de programação funcional, incluindo funções de alta ordem (Higher-Order Functions) e recursão, para manipular e analisar um conjunto de dados em JavaScript.

O script utiliza uma lista de usuários como base e executa operações de filtragem, mapeamento e redução para extrair informações relevantes, seguindo o princípio da imutabilidade.

## Conceitos aplicados:

- Imutabilidade: Nenhum dado original é alterado. Todas as funções retornam novas estruturas de dados.
- Funções de Alta Ordem (HOFs):
    - filter(): Para criar um novo array com elementos que passam em um teste.
    - map(): Para transformar cada elemento de um array e criar um novo array com os resultados.
    - reduce(): Para executar uma função redutora em cada elemento do array, resultando em um único valor de retorno.
    - Recursão: Resolução de um problema dividindo-o em instâncias menores de si mesmo, com um caso base para encerrar o ciclo.

## Composição de Funções: 

Encadeamento de múltiplas funções (filter, map, etc.) para criar consultas complexas e legíveis.

## Análises aplicadas:

- Filtrar Usuários Ativos: Retorna uma lista contendo apenas os usuários com o status ativo: true.
- Mapear Dados de Usuários: Cria uma nova lista de objetos contendo apenas o nome e a idade de cada usuário.
- Calcular Idade Média: Calcula e retorna a idade média de todos os usuários na lista.
- Consulta Composta: Encontra e lista os nomes dos usuários que moram em "São Paulo" e possuem "SQL" em suas habilidades.
- Contagem Total de Habilidades: Demonstra duas abordagens para contar o número total de habilidades listadas entre todos os usuários:
    - Uma solução usando recursão.
    - Uma solução mais idiomática em JS usando map e reduce.