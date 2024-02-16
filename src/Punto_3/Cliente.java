package Punto_3;

public class Cliente {
    public static void main(String[] args) {

        BuilderMenuDia builderMenuDia;
        BuilderMenuEspecial1 builderMenuEspecial1;
        BuilderMenuEspecial2 builderMenuEspecial2;
        Director director;
        Menu menu;

        //menu del dia
        System.out.println("Menu del dia");
        builderMenuDia = new BuilderMenuDia();
        director = new Director(builderMenuDia);
        director.construirMenu();
        menu = ((BuilderMenuDia) builderMenuDia).obtenerMenu();
        menu.mostrarMenu();

        //menu especial 1
        System.out.println("\nMenu especial 1");
        builderMenuEspecial1 = new BuilderMenuEspecial1();
        director= new Director(builderMenuEspecial1);
        director.construirMenu();
        menu = ((BuilderMenuEspecial1) builderMenuEspecial1).obtenerMenu();
        menu.mostrarMenu();

        //menu especial 2
        System.out.println("\nMenu especial 2");
        builderMenuEspecial2 = new BuilderMenuEspecial2();
        director= new Director(builderMenuEspecial2);
        director.construirMenu();
        menu = ((BuilderMenuEspecial2) builderMenuEspecial2).obtenerMenu();
        menu.mostrarMenu();

    }
}
