package Punto1;

public class PedidoHamburguesa extends ProcesadorDePedidos{
    @Override
    void tomarPedido() {
        System.out.println("Carrito de compra: BicMac");
    }

    @Override
    void verificarDisponibilidadPedido() {
        System.out.println("Producto disponible");

    }

    @Override
    void calcularPrecioPedido() {
        System.out.println("Precio: $33.900");

    }

    @Override
    void prepararPedido() {
        System.out.println("Preparando...");

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
