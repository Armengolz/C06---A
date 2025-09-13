package Computadores;

import Cliente.Cliente;

public class Computador {
    private String marca; //
    float preco;
    private HardwareBasico[] HardwareBasico;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB MemoriaUSB;
    private Cliente[] cliente = new Cliente[2000];

    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional, MemoriaUSB memoriaUSB, HardwareBasico hardwareBasico) {
        this.sistemaOperacional = sistemaOperacional;
        this.MemoriaUSB = memoriaUSB;
        this.HardwareBasico = hardwareBasico;
        this.marca = marca;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void mostraPCConfigs(){

    }
    public void addMemoriaUSB(){

    }

}
