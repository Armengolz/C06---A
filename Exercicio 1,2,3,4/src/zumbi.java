public class zumbi {
    String nome;
    double vida;
    boolean certo;
    double mostravida(){
        return vida;
    }
    boolean transferevida (zumbi zumbialvo ,double quantia)
    {
        if(vida >= quantia){
        vida -= quantia;
        zumbialvo.vida += quantia;
            return true;
        }
        else {

            return false;
        }
    }

}
