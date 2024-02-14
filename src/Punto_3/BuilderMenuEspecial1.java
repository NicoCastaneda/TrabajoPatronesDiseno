package Punto_3;

public class BuilderMenuEspecial1 implements Builder{

    private Menu menu;

    public BuilderMenuEspecial1(){
        this.menu = new Menu();
    }
    @Override
    public void BuilderPlatoPrincipal() {
        menu.setPlatoPrincipal("Churrasco con papas a la francesa");
    }

    @Override
    public void BuilderEntrada() {
        menu.setEntrada("papa gratinada rellena");
    }

    @Override
    public void BuilderPostre() {
        menu.setPostre("Helado de vainilla");
    }

    @Override
    public void BuilderBebida() {
        menu.setBebida("Limonada natural");
    }

    public Menu obtenerMenu(){
        return this.menu;
    }
}
