package Punto1;

public class PedidoSunday extends ProcesadorDePedidos{

        @Override
        void tomarPedido() {
            System.out.println("Carrito de compra: Sunday");
        }

        @Override
        void verificarDisponibilidadPedido() {
            System.out.println("Producto disponible");

        }

        @Override
        void calcularPrecioPedido() {
            System.out.println("Precio: $13.800");

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
