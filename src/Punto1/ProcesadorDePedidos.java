package Punto1;
abstract class ProcesadorDePedidos {

    public final void procesarPedido(){

        tomarPedido();
        verificarDisponibilidadPedido();
        calcularPrecioPedido();
        prepararPedido();
        enviarPedido();
        verificarEntregaPedido();
    }

    abstract void tomarPedido();
    abstract void verificarDisponibilidadPedido();
    abstract void calcularPrecioPedido();
    abstract void prepararPedido();
    abstract void enviarPedido();
    abstract void verificarEntregaPedido();

}
