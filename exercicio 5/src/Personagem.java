public class Personagem {
    String nome;
    int pontos;
    int vida;
    Arma arma;


    void usararma(){
       arma.resistencia -= 2;
    }
    void tomardano(){
      vida -= 5;
    }
}
