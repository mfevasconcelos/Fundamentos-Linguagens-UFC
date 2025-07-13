import java.util.ArrayList;
import java.util.List;

public class Jogo {

    public static void main(String[] args) {
        Personagem guerreiro = new Guerreiro("Aragorn", 10);
        Personagem mago = new Mago("Gandalf", 12);
        Personagem arqueiro = new Arqueiro("Legolas", 11);

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(guerreiro);
        personagens.add(mago);
        personagens.add(arqueiro);

        for (Personagem p : personagens) {
            p.exibirStatus();
            p.atacar();
            System.out.println("--------------------");
        }
    }
}