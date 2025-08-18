public class Kart {

    String nome;
    Motor motor;
    Piloto piloto;

    public Kart() {
        motor = new Motor();
    }

    void pular() {
        System.out.println("O kart " + nome + " deu um salto absurdo!");
    }

    void soltarTurbo() {
        System.out.println("O kart " + nome + " ativou o modo turbinado!");
    }

    void fazerDrift() {
        System.out.println("O kart " + nome + " deu drift!");
    }
}
