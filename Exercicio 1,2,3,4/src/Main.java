public class Main {
    public static void main(String[] args) {

        zumbi z = new zumbi();
        z.nome = "Jão";
        z.vida = 100;

        zumbi z1 = new zumbi();
        z1.vida = 90;
        z1.nome = "zé";

        boolean d;
        d = z.transferevida(z1,200);
        if(d == true){
            System.out.println("Transferencia efetuada com sucesso");
            System.out.println("a vida de josé é " + z.vida);
            System.out.println("a vida de zé é " + z1.vida);
        }
        else
        {
            System.out.println("A transferencia nao foi possivel");
        }
        z = z1;
        System.out.println("a vida de josé é " + z.vida);
        System.out.println("a vida de zé é " + z1.vida);
    }
}