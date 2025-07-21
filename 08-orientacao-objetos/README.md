# Hierarquia de Classses de Personagens
Este sub-repositório armazena uma demonstração simples e prática de uma hierarquia de classes em Java, com a modelagem de diferentes tipos de personagens.

## Classes Implementadas:
- **Personagem.java:** A superclasse abstrata. Define o que todo personagem tem em comum.
- **Guerreiro.java:** Um personagem focado em combate corpo a corpo, com alta vida e força.
- **Mago.java:** Um personagem que usa magia, com pouca vida mas com pontos de magia para lançar feitiços.
- **Arqueiro.java:** Um personagem ágil que ataca à distância, com dano baseado em sua destreza.
- **Jogo.java:** A classe principal com o método main. Cria instâncias dos personagens e demonstra o polimorfismo em ação.

## Conceitos de POO Demonstrados:
**1. Herança**

As classes Guerreiro, Mago e Arqueiro herdam (extends) da classe base Personagem.

Elas reutilizam os atributos (nome, nivel, pontosDeVida) e métodos (exibirStatus) da superclasse, evitando a duplicação de código.

**2. Abstração**

A classe Personagem é abstract, definindo um "contrato" para todas as suas subclasses sem poder ser instanciada diretamente.

O método atacar() é abstract, forçando que cada subclasse concreta forneça sua própria implementação específica, pois cada personagem ataca de uma maneira única.

**3. Polimorfismo**

Na classe Jogo, diferentes tipos de objetos (Guerreiro, Mago, Arqueiro) são adicionados a uma única lista do tipo List<Personagem>.

Ao iterar sobre a lista e chamar o método p.atacar(), o Java invoca a implementação correta do método para cada objeto em tempo de execução. Isso torna o sistema flexível e fácil de estender.

**4. Encapsulamento**

Os atributos das classes são declarados como protected ou private, protegendo o estado interno dos objetos. O acesso e a modificação são controlados por meio de métodos públicos (getters, construtores, etc.).
