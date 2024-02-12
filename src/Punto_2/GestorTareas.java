package Punto_2;

public class GestorTareas {

    public void crearTarea(String tarea){
        System.out.println("Tarea creada: "+tarea);
    }
    public  void editarTarea(String tarea,String nuevaDescripcion){
        System.out.println("Tarea " + tarea + " editada: " + nuevaDescripcion);
    }
    public void eliminarTarea(String tarea) {
        System.out.println("Tarea eliminada: " + tarea);
    }

    public void completarTarea(String tarea) {
        System.out.println("Tarea completada: " + tarea);
    }
}
