package Punto_2;

public class Main {
    public static void main(String[] args) {

        GestorTareas gestorTareas = new GestorTareas();

        String tarea = "Arreglar el cuarto";
        String tareaEditada = "Arreglar el cuarto y limpiar la cocina";

        Command crearTarea = new CrearTarea(tarea, gestorTareas);
        Emisora emisoraCrear = new Emisora(crearTarea);
        emisoraCrear.ejecutarComando();


        Command editarTarea = new EditarTarea(tarea, tareaEditada, gestorTareas);
        Emisora emisoraEditar = new Emisora(editarTarea);
        emisoraEditar.ejecutarComando();


        Command completarTarea = new CompletarTarea(tarea, gestorTareas);
        Emisora emisoraCompletar = new Emisora(completarTarea);
        emisoraCompletar.ejecutarComando();


        Command eliminarTarea = new EliminarTarea(tarea, gestorTareas);
        Emisora emisoraEliminar = new Emisora(eliminarTarea);
        emisoraEliminar.ejecutarComando();



    }
}