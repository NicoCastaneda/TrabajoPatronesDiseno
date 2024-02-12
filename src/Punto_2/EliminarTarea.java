package Punto_2;

public class EliminarTarea implements Command{

    private String tarea;
    private GestorTareas gestorTareas;

    public EliminarTarea(String tarea, GestorTareas gestorTareas) {
        this.tarea = tarea;
        this.gestorTareas = gestorTareas;
    }

    @Override
    public void Ejecutar() {
        gestorTareas.eliminarTarea(tarea);
    }
}
