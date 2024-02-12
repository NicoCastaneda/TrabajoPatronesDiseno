package Punto_2;

public class CrearTarea implements Command {

    String tarea;
    GestorTareas gestorTareas;
    public CrearTarea(String tarea, GestorTareas gestorTareas) {
        this.tarea =tarea;
        this.gestorTareas=gestorTareas;
    }

    @Override
    public void Ejecutar() {
        gestorTareas.crearTarea(tarea);

    }
}
