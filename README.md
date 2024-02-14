Resumen y explicación de cada punto:

Punto 1. Para este punto se escogió el patron Template. Este patron permite crear una clase padre que funcione como una plantila para subclases que requieran usar una serie de pasos definidida para diferentes casos concretos evitando el codigo duplicado. Para esto, se creo una clase abstracta ProcesadorDePedidos, que declara los pasos que contiene el algoritmo y el metodo que los contiene en el orden que se necesita. A partir de esto, se implementaron cuatro subclases concretad que implementan el algoritmo pero deben adaptar los metodos a cada tipo de pedido (PedidoCajitaFeliz, PedidoGaseosa, PedidoHamburguesa, PedidoSunday). 











Punto 2. Para este punto se eligio el patrón Command porque se adapta perfectamente a las necesidades del sistema de gestion de las tareas ya que permite separar el código que solicita acciones del que las ejecuta, lo que hace que el sistema sea más flexible y fácil de mantener, además facilita la adición de nuevas acciones sin modificar el código existente, simplemente agregando nuevos comandos concretos y puede permitir el registro de las acciones realizadas sobre las tareas para devolverlas si es necesario.

Para realizarlo, se usaron las siguientes clases:
- Emisora: Actúa como el invocador. Es responsable de ejecutar los comandos asociados a las acciones de las tareas.
- Command: La interfaz declara el método ejecutar() que representa la acción a realizar sobre una tarea, se hereda a todos los diferentes comandos.

- Comandos Concretos (Crear, editar, eliminar y completar tarea): Implementan la interfaz Comando. Cada comando concreto encapsula una acción específica que se puede realizar sobre una tarea.

- GestorTareas: La clase GestorTareas actúa como el receptor en el sistema. Contiene la lógica para realizar las acciones sobre las tareas.

- Main: Se encarga de la ejecución del programa, crea los objetos de comandos concretos y los asocia con GestorTareas mediante la creación de instancias de Emisora y llamando al método ejecutarComando().

/*Diagrama de Clases*/:![image](https://github.com/NicoCastaneda/TrabajoPatronesDiseno/assets/101200949/c4df0a2a-d58f-444f-9cab-a7a8b736f4db)
 


Punto 3.










Punto 4.








Punto 5.
















































.


