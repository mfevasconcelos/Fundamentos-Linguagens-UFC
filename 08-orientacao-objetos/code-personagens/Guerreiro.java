public class Guerreiro extends Personagem {

    private int forca;

    public Guerreiro(String nome, int nivel) {
        super(nome, nivel, 150);
        this.forca = nivel * 5; 
    }

    @Override 
    public void atacar() {
        System.out.println(this.nome + " ataca com sua espada! Dano causado: " + this.forca);
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus(); 
        System.out.println("Força: " + this.forca);
    }
}