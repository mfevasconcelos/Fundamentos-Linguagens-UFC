# Problema Lógico
Victor, Maria, Felipe e Ana são colegas de trabalho e fazem parte de uma equipe de TI. 
Cada um possui um cargo diferente (Analista de Dados, Desenvolvedor Frontend, Engenheiro de DevOps, Gerente de Projeto) e uma linguagem de programação preferida (Python, JavaScript, Go, SQL).

O objetivo é determinar o cargo e a linguagem de cada pessoa com base nas seguintes pistas:
1. Maria é a Gerente de Projeto.
2. O Desenvolvedor Frontend prefere JavaScript.
3. Victor prefere Python.
4. Ana é Engenheira de DevOps.
5. A Gerente de Projetos não usa a linguagem Go.

Em Prolog, modelamos o problema descrevendo os fatos e as regras que governam as relações entre as pessoas, seus cargos e suas linguagens.
1. Definimos os fatos básicos
% Pessoas
pessoa(victor).
pessoa(maria).
pessoa(felipe).
pessoa(ana).

% Cargos
cargo(analista_de_dados).
cargo(dev_frontend).
cargo(eng_devops).
cargo(gerente_de_projeto).

% Linguagens
linguagem(python).
linguagem(javascript).
linguagem(go).
linguagem(sql).

2. Definimos a estrutura de solução e as regras

    % Regra auxiliar para garantir que todos os itens da lista são diferentes.
    diferentes([]).
    diferentes([PrimeiroItem | RestoDaLista]) :-
        not(member(PrimeiroItem, RestoDaLista)),
        diferentes(RestoDaLista).

    % Regra principal que define a solução completa do enigma.
    solucao(Equipe) :-

        % 1. A solução deve ter esta estrutura:
        Equipe = [
            membro(victor,   CargoVictor,   LangVictor),
            membro(maria, CargoMaria, LangMaria),
            membro(felipe, CargoFelipe, LangFelipe),
            membro(ana, CargoAna, LangAna)
        ],

        % 2. Cargos e linguagens são válidos e únicos para cada membro
        Cargos = [CargoVictor, CargoMaria, CargoFelipe, CargoAna],
        Linguagens = [LangVictor, LangMaria, LangFelipe, LangAna],
        diferentes(Cargos),
        diferentes(Linguagens),

        % 3. Aplica as pistas como restrições obrigatórias
        % pista 1
        CargoMaria = gerente_de_projeto, 
        % pista 2
        member(membro(_, dev_frontend, javascript), Equipe),
        % pista 3
        LangVictor = python,
        % pista 4
        CargoAna = eng_devops,
        % pista 5
        member(membro(_, gerente_de_projeto, LangManager), Equipe),
        LangManager \= go. 

3. Passo final: consulta
Para resolver o problema lógico, consultamos o sistema, pedindo uma Equipe que satisfaça a regra solucao.
    ?- solucao(Equipe).

Solução esperada: o sistema lógico deve processar as regras e encontrar a configuração que obedece a todas as restrições.
    Equipe = [
        membro(victor,   analista_de_dados,  python),
        membro(maria, gerente_de_projeto, sql),
        membro(felipe, dev_frontend,       javascript),
        membro(ana, eng_devops,         go)
    ]

- Victor: Analista de Dados, prefere Python.
- Maria: Gerente de Projeto, prefere SQL.
- Felipe: Desenvolvedor Frontend, prefere JavaScript.
- Ana: Engenheira de DevOps, prefere Go.