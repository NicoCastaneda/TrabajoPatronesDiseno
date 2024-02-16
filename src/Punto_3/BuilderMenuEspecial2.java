package Punto_3;

public class BuilderMenuEspecial2 implements Builder {

    private Menu menu;

    public BuilderMenuEspecial2(){
        this.menu = new Menu();
    }
    @Override
    public void BuilderPlatoPrincipal() {
        menu.setPlatoPrincipal("Pasta Fetuccini con camarones al ajillo");
    }

    @Override
    public void BuilderEntrada() {
        menu.setEntrada("Crema de tomate");
    }

    @Override
    public void BuilderPostre() {
        menu.setPostre("Waffle de arequipe");
    }

    @Override
    public void BuilderBebida() {
        menu.setBebida("Jugo de frutos rojos");
    }

    public Menu obtenerMenu(){
        return this.menu;
    }
}
