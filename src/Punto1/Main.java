package Punto1;

public class Main {

    public static void main(String[] args) {

        ProcesadorDePedidos pedirCajitaFeliz = new PedidoCajitaFeliz();
        pedirCajitaFeliz.procesarPedido();

        System.out.println("Pedido completado exitosamente");
        System.out.println("\n");


        ProcesadorDePedidos pedirGaseosa = new PedidoGaseosa();
        pedirGaseosa.procesarPedido();

        System.out.println("Pedido completado exitosamente");
        System.out.println("\n");

        ProcesadorDePedidos pedirHamburguesa = new PedidoHamburguesa();
        pedirHamburguesa.procesarPedido();

        System.out.println("Pedido completado exitosamente");
        System.out.println("\n");

        ProcesadorDePedidos pedirSunday = new PedidoSunday();
        pedirSunday.procesarPedido();

        System.out.println("Pedido completado exitosamente");



    }
}
