package Punto1;

public class Main {

    public static void main(String[] args) {

        ProcesadorDePedidos pedirCajitaFeliz = new PedidoCajitaFeliz();
        pedirCajitaFeliz.procesarPedido();

        System.out.println("Pedido completado exitosamente");


        ProcesadorDePedidos pedirGaseosa = new PedidoCajitaFeliz();
        pedirGaseosa.procesarPedido();

        System.out.println("Pedido completado exitosamente");

        ProcesadorDePedidos pedirHamburguesa = new PedidoHamburguesa();
        pedirHamburguesa.procesarPedido();

        System.out.println("Pedido completado exitosamente");

        ProcesadorDePedidos pedirSunday = new PedidoSunday();
        pedirSunday.procesarPedido();

        System.out.println("Pedido completado exitosamente");



    }
}
