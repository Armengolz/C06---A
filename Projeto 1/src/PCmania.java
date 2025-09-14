import Cliente.Cliente;
import Computadores.*;
import java.util.Scanner;

public class PCmania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        Cliente cliente = new Cliente("Pedro Armengol", "00009999000");

        HardwareBasico[] hardwares1 = {
                new HardwareBasico("Core i3", 1200),
                new HardwareBasico("8GB RAM", 8),
                new HardwareBasico("500GB HD", 500)
        };
        Computador promocao1 = new Computador("Apple", 2093, hardwares1, new SistemaOperacional("MacOS", 64));
        promocao1.addMemoriaUSB(new MemoriaUSB("Pen Drive", 16));

        HardwareBasico[] hardwares2 = {
                new HardwareBasico("Core i5", 2200),
                new HardwareBasico("16GB RAM", 16),
                new HardwareBasico("1TB HD", 1000)
        };
        Computador promocao2 = new Computador("Samsung", 3327, hardwares2, new SistemaOperacional("Windows 8", 64));
        promocao2.addMemoriaUSB(new MemoriaUSB("Pen Drive", 32));

        HardwareBasico[] hardwares3 = {
                new HardwareBasico("Core i7", 3200),
                new HardwareBasico("32GB RAM", 32),
                new HardwareBasico("2TB HD", 2000)
        };
        Computador promocao3 = new Computador("Dell", 7771, hardwares3, new SistemaOperacional("Windows 10", 64));
        promocao3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        do {
            System.out.println("\nDigite a promoção que deseja comprar:");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Finalizar");
            opcao = sc.nextInt();

            if (opcao == 1) {
                if (cliente.getQtdCompras() < cliente.getCompras().length) {
                    cliente.getCompras()[cliente.getQtdCompras()] = promocao1;
                    cliente.setQtdCompras(cliente.getQtdCompras() + 1);
                } else {
                    System.out.println("Não é possível comprar mais computadores!");
                }
            } else if (opcao == 2) {
                if (cliente.getQtdCompras() < cliente.getCompras().length) {
                    cliente.getCompras()[cliente.getQtdCompras()] = promocao2;
                    cliente.setQtdCompras(cliente.getQtdCompras() + 1);
                } else {
                    System.out.println("Não é possível comprar mais computadores!");
                }
            } else if (opcao == 3) {
                if (cliente.getQtdCompras() < cliente.getCompras().length) {
                    cliente.getCompras()[cliente.getQtdCompras()] = promocao3;
                    cliente.setQtdCompras(cliente.getQtdCompras() + 1);
                } else {
                    System.out.println("Não é possível comprar mais computadores!");
                }
            }
        } while (opcao != 0);

        cliente.mostrarCliente();
        for (int i = 0; i < cliente.getQtdCompras(); i++) {
            System.out.println("\nComputador " + (i + 1) + ":");
            cliente.getCompras()[i].mostraPCConfigs();
        }
        System.out.println("Total da compra: R$" + cliente.calculaTotalCompra());
        ProcessarPedido.processarPedido(cliente.getCompras(), cliente.getQtdCompras());
    }
}