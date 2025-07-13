# Linguagem Rust
Este sub-repositório apresenta uma investigação e análise crítica sobre "a linguagem mais amada de todas", Rust.

Rust é uma linguagem de programação de sistemas moderna, de código aberto, que se concentra em três objetivos principais: segurança, velocidade e concorrência. Criada pela Mozilla Research, com sua primeira versão estável lançada em 2015, Rust nasceu da necessidade de construir um motor de navegador (Servo) que fosse imune a categorias inteiras de bugs que atormentam linguagens como C e C++.

Sua proposta de valor fundamental é: oferecer o controle de baixo nível e o desempenho de C/C++, mas com garantias de segurança de memória em tempo de compilação, tudo isso sem a necessidade de um Garbage Collector (Coletor de Lixo).

## Mecanismos centrais:

1. Propriedade (Ownership), Empréstimo (Borrowing) e Tempo de Vida (Lifetimes)
Sistema que permite a segurança de memória sem um coletor de lixo.

- Propriedade (Ownership): Cada valor em Rust tem uma variável que é sua "proprietária" (owner). Só pode haver um proprietário por vez. Quando o proprietário sai do escopo, o valor é descartado e a memória é liberada automaticamente. Isso elimina a necessidade de chamar free() manualmente (como em C) e o risco de liberação dupla (double free).
- Empréstimo (Borrowing): Em vez de transferir a propriedade, você pode "emprestar" acesso a um valor. Os empréstimos podem ser:
    - Imutáveis (&T): Você pode ter vários empréstimos imutáveis ao mesmo tempo. Você pode ler os dados, mas não modificá-los.
    - Mutáveis (&mut T): Você só pode ter um único empréstimo mutável em um determinado escopo. Isso impede as data races (condições de corrida de dados) em tempo de compilação.
- Tempo de Vida (Lifetimes): O compilador usa lifetimes para garantir que todas as referências (empréstimos) a um dado sejam válidas. Ele verifica se uma referência não viverá mais do que os dados aos quais ela aponta, prevenindo os dangling pointers (ponteiros pendentes).

2. Segurança de Concorrência ("Fearless Concurrency")
O modelo de propriedade resolve um dos maiores desafios da programação paralela: o acesso seguro a dados compartilhados entre threads. Como o compilador impõe que você só pode ter uma referência mutável ou múltiplas referências imutáveis, é impossível que duas threads modifiquem o mesmo dado ao mesmo tempo. Isso elimina as data races, uma das classes mais perigosas de bugs em sistemas concorrentes.

3. Abstrações de Custo Zero (Zero-Cost Abstractions)
A filosofia de Rust é que você não deve pagar em performance por recursos de alto nível. Se você usa uma abstração como um loop for ou um iterador, o código de máquina gerado deve ser tão eficiente quanto o código manual equivalente que você escreveria em C. Isso permite escrever código expressivo e seguro sem sacrificar a velocidade.

4. Ecossistema e Ferramentas (Cargo e Crates.io)

- Cargo: É o gerenciador de pacotes e ferramenta de build de Rust. Ele lida com a compilação do código, o download e a compilação de dependências (chamadas de crates), a execução de testes e a geração de documentação. É universalmente elogiado por sua simplicidade e poder.
- Crates.io: É o repositório central de pacotes da comunidade Rust. Qualquer pessoa pode publicar suas bibliotecas (crates), facilitando a reutilização de código.

## Casos de Uso Comuns

- **Software de Sistemas:** Sistemas operacionais, drivers de dispositivo, emuladores.
Serviços de Backend e APIs: Aplicações web de alta performance que precisam de baixa latência e uso eficiente de CPU/memória.
- **WebAssembly (Wasm):** Rust é a linguagem de primeira classe para Wasm, permitindo rodar código de performance nativa diretamente no navegador.
- **Ferramentas de Linha de Comando (CLI):** Ferramentas rápidas e confiáveis.
- **Sistemas Embarcados:** Controle de microcontroladores e dispositivos IoT onde a memória é limitada e não há sistema operacional.
- **Blockchain e Criptomoedas:** A necessidade de correção e eficiência torna Rust uma escolha popular para clientes de blockchain e contratos inteligentes.

---
Entre as principais referências usadas: 
    - site oficial rust-lang.org
    - livro "The Rust Programming Language"
