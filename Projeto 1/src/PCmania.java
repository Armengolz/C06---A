import Computadores.Computador;
import Computadores.MemoriaUSB;
import Computadores.SistemaOperacional;

public class PCmania {
    public static void main(String[] args) {
        Computador promocao1 = new Computador("Apple", 2093);
        SistemaOperacional sistemapromocao1 = new SistemaOperacional("MacOS Sequoia", 64);
        MemoriaUSB Memoriapromocao1 = new MemoriaUSB("Pen Drive", 16);


        Computador promocao2 = new Computador("Samsung", 3327);
        SistemaOperacional sistemapromocao2 = new SistemaOperacional("Windows 8", 64);
        MemoriaUSB Memoriapromocao2 = new MemoriaUSB("Pen Drive", 32);



        Computador promocao3 = new Computador("Dell", 7771);
        SistemaOperacional sistemapromocao3 = new SistemaOperacional("Windows 10", 64);
        MemoriaUSB Memoriapromocao3 = new MemoriaUSB("HD Externo", 1000);


    }
}