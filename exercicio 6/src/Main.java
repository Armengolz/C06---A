public class Main {
    public static void main(String[] args) {

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto1.nome = "Tsalagi";
        piloto2.nome = "Laizo";

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "VentoAureo";
        kart2.nome = "SpinAround";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        kart1.motor.cilindradas = "200";
        kart1.motor.velocidadeMaxima = 110.0f;

        kart2.motor.cilindradas = "90";
        kart2.motor.velocidadeMaxima = 82.5f;

        piloto2.soltaSuperPoder();
        piloto1.soltaSuperPoder();

        kart2.soltarTurbo();
        kart2.motor.mostraInfo();

        kart1.fazerDrift();
        kart1.motor.mostraInfo();

        kart2.pular();
        kart2.motor.mostraInfo();
    }
}
