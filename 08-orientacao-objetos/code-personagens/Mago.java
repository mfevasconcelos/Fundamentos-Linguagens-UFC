public class Mago extends Personagem {

    private int pontosDeMagia;

    public Mago(String nome, int nivel) {
        super(nome, nivel, 80);
        this.pontosDeMagia = nivel * 10;
    }

    @Override
    public void atacar() {
        if (this.pontosDeMagia >= 10) {
            this.pontosDeMagia -= 10;
            System.out.println(this.nome + " lança uma bola de fogo! Custo de 10 de magia.");
        } else {
            System.out.println(this.nome + " está sem magia para atacar!");
        }
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Pontos de Magia: " + this.pontosDeMagia);
    }
}