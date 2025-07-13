# Linguagens para Script e Web
Este sub-repositório armazena um script para automatização de criação de flashcards de estudo.

No script em python, é possível automatizar criação de flashcards em softwares como Anki. 
Sem que o usuário precise criar flashcard por flashcard, ele apenas escreve os termos e definições estudados num arquivo vocabulario.txt e utiliza o script para criação de um novo arquivo já em formato próprio para Anki.

## Roteiro do Script:
1. Definir os Nomes dos Arquivos: O script lerá os dados de um arquivo vocabulario.txt e criará um importar_anki.txt.
2. Abrir e Ler o Arquivo de Entrada: O script abrirá vocabulario.txt em modo de leitura.
3. Abrir o Arquivo de Saída: Ao mesmo tempo, criará e abrirá importar_anki.txt em modo de escrita.
4. Processar Linha por Linha: O script vai ler o arquivo de vocabulário linha por linha. Para cada linha:
    a. Vai verificar se a linha contém o separador " - ".
    b. Se contiver, dividirá a linha em duas partes: o termo (antes do hífen) e a definição (depois do hífen).
    c. Vai "limpar" o termo e a definição, removendo espaços em branco extras no início ou no fim.
    d. Vai formatar a nova linha no padrão termo;definição.
    e. Escreverá nova linha formatada no arquivo importar_anki.txt.
5. Finalizar: Após processar todas as linhas, o script fechará os dois arquivos e exibirá uma mensagem de sucesso na tela.

Exemplo de entrada de dados (vocabulario.txt):

Exemplo de saída de dados (importar_anki.txt):
