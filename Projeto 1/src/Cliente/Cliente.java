package Cliente;
import Computadores.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] compras;
    private int qtdCompras;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.compras = new Computador[10]; // limite fixo para simplificar
        this.qtdCompras = 0;
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < qtdCompras; i++) {
            total += compras[i].getPreco();
        }
        return total;
    }

    public Computador[] getCompras() {
        return compras;
    }

    public int getQtdCompras() {
        return qtdCompras;
    }

    public void setQtdCompras(int qtdCompras) {
        this.qtdCompras = qtdCompras;
    }

    public void mostrarCliente() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
    }
}