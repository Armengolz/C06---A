public class Main {
    public static void main(String[] args) {
        Personagem personagem  = new Personagem();
        Arma arma1 = new Arma();

        personagem.nome = "Frederico";
        personagem.pontos = 90;

        arma1.nomearma = "ParaFall";
        arma1.poder = 10;
        arma1.resistencia = 5;
        arma1.descrisao = "E muito forte viu";
        personagem.arma = arma1;

        arma1.mostrararma();

        personagem.usararma();



    }
}