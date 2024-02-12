package Punto_2;

public class CompletarTarea implements Command {
    private String tarea;
    private GestorTareas gestorTareas;

    public CompletarTarea(String tarea, GestorTareas gestorTareas) {
        this.tarea = tarea;
        this.gestorTareas = gestorTareas;
    }

    @Override
    public void Ejecutar() {
        gestorTareas.completarTarea(tarea);
    }
}
