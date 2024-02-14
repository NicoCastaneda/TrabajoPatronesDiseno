package Punto_3;

public class Menu {
    private String platoPrincipal;
    private String entrada;
    private String postre;
    private String bebida;

    // Métodos setter y getter para los elementos del menú
    public void setPlatoPrincipal(String platoPrincipal) {
        this.platoPrincipal = platoPrincipal;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public void mostrarMenu() {
        System.out.println("Plato principal: " + platoPrincipal);
        System.out.println("Entrada: " + entrada);
        System.out.println("Postre: " + postre);
        System.out.println("Bebida: " + bebida);
    }
}
