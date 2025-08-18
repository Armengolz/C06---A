//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personagem personagem  = new Personagem();

        personagem.nome = "Frederico";
        personagem.pontos = 90;
        personagem.vida = 10;

        Arma arma1 = new Arma();

        arma1.nomearma = "ParaFal";
        arma1.poder = 10;
        arma1.resistencia = 5;
        arma1.descrisao = "E muito forte viu";

        personagem.arma = arma1;

        System.out.println("info da arma");
        arma1.mostrararma();

        personagem.usararma();
        System.out.println("Vida do personagem: " + personagem.vida);

        personagem.tomardano();

        System.out.println("Vida do personagem apos tomar dano: " + personagem.vida);

        System.out.println("Usou a Arma");
        System.out.println("Nova Informacao ");
        personagem.arma.mostrararma();
    }
}