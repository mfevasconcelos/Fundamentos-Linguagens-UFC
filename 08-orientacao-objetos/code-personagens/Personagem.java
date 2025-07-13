public abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected int pontosDeVida;

    public Personagem(String nome, int nivel, int pontosDeVida) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
    }

    public abstract void atacar();

    public void exibirStatus() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Pontos de Vida: " + this.pontosDeVida);
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }
}