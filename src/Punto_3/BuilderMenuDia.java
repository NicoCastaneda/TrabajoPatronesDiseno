package Punto_3;

public class BuilderMenuDia implements Builder{

    private Menu menu;

    public BuilderMenuDia(){
        this.menu = new Menu();
    }
    @Override
    public void BuilderPlatoPrincipal() {
        menu.setPlatoPrincipal("Pollo a la plancha con arroz de coco");
    }

    @Override
    public void BuilderEntrada() {
        menu.setEntrada("Ensalada tropical");
    }

    @Override
    public void BuilderPostre() {
        menu.setPostre("flan de chocolate");
    }

    @Override
    public void BuilderBebida() {
        menu.setBebida("Jugo de maracuyá");
    }

    public Menu obtenerMenu(){
        return this.menu;
    }
}
