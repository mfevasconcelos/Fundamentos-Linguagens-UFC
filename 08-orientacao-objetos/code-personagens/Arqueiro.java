public class Arqueiro extends Personagem {

    private int destreza;

    public Arqueiro(String nome, int nivel) {
        super(nome, nivel, 100);
        this.destreza = nivel * 3;
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " dispara uma flecha precisa! Dano baseado na destreza: " + this.destreza);
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Destreza: " + this.destreza);
    }
}