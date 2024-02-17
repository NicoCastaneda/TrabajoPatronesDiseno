package Punto1;

public class PedidoCajitaFeliz extends ProcesadorDePedidos {
    @Override
    void tomarPedido() {
        System.out.println("Carrito de compra: Cajita feliz");
    }

    @Override
    void verificarDisponibilidadPedido() {
        System.out.println("Producto disponible");
    }

    @Override
    void escogerJuguete() {
        System.out.println("Juguete: Mario Bros");
    }

    @Override
    void calcularPrecioPedido() {
        System.out.println("Precio: $22.500");

    }



    @Override
    void prepararPedido() {
        System.out.println("Preparando..");

    }

    @Override
    void enviarPedido() {
        System.out.println("El pedido esta en camino");

    }

    @Override
    void verificarEntregaPedido() {
        System.out.println("El pedido fue entregado");

    }

}
