package Punto1;

public class PedidoGaseosa extends ProcesadorDePedidos{
    @Override
    void tomarPedido() {
        System.out.println("Carrito de compra: Gaseosa");
    }

    @Override
    void verificarDisponibilidadPedido() {
        System.out.println("Producto disponible");

    }

    @Override
    void adicionarHielo(){
        System.out.println("Adicionar hielo: No");
    }

    @Override
    void calcularPrecioPedido() {
        System.out.println("Precio: $6.500");

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
