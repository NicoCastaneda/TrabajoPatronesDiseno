package Punto_2;

public class EditarTarea implements Command{

    String tarea;
    String nuevaDescripcion;
    GestorTareas gestorTareas;

    public EditarTarea(String tarea, String nuevaDescripcion, GestorTareas gestorTareas ){
        this.tarea = tarea;
        this.nuevaDescripcion=nuevaDescripcion;
        this.gestorTareas = gestorTareas;
    }
    @Override
    public void Ejecutar() {
        gestorTareas.editarTarea(tarea, nuevaDescripcion);
    }
}
