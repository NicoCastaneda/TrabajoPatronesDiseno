package Punto_3;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construirMenu() {
        builder.BuilderPlatoPrincipal();
        builder.BuilderEntrada();
        builder.BuilderPostre();
        builder.BuilderBebida();
    }
}
