Resumen y explicación de cada punto:

Punto 1.











Punto 2. Para este punto se eligio el patrón Command porque se adapta perfectamente a las necesidades del sistema de gestion de las tareas ya que permite separar el código que solicita acciones del que las ejecuta, lo que hace que el sistema sea más flexible y fácil de mantener, además facilita la adición de nuevas acciones sin modificar el código existente, simplemente agregando nuevos comandos concretos y puede permitir el registro de las acciones realizadas sobre las tareas para devolverlas si es necesario.

Para realizarlo, se usaron las siguientes clases:
- Emisora: Actúa como el invocador. Es responsable de ejecutar los comandos asociados a las acciones de las tareas.
- Command: La interfaz declara el método ejecutar() que representa la acción a realizar sobre una tarea, se hereda a todos los diferentes comandos.

- Comandos Concretos (Crear, editar, eliminar y completar tarea): Implementan la interfaz Comando. Cada comando concreto encapsula una acción específica que se puede realizar sobre una tarea.

- GestorTareas: La clase GestorTareas actúa como el receptor en el sistema. Contiene la lógica para realizar las acciones sobre las tareas.

- Main: Se encarga de la ejecución del programa, crea los objetos de comandos concretos y los asocia con GestorTareas mediante la creación de instancias de Emisora y llamando al método ejecutarComando().



Punto 3.










Punto 4.








Punto 5.
















































.


