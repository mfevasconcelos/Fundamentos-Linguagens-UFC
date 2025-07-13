class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [nome: " + nome + ", idade: " + idade + "]";
    }
}

public class referencia {
    public static void modificarPessoa(Pessoa pessoa) {
        System.out.println("Dentro do metodo (antes da modificacao): " + pessoa);

        pessoa.idade = 20;
        pessoa.nome = "Maria";
        System.out.println("Dentro do metodo (depois da modificacao de estado): " + pessoa);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Victor", 23);
        System.out.println("Antes da chamada do metodo: " + pessoa);

        modificarPessoa(pessoa); // Passa a REFERENCIA 

        System.out.println("Depois da chamada do metodo: " + pessoa);
    }
}