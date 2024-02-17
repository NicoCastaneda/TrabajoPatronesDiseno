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
 


Punto 3. Para este se elegió  el patrón Builder debido a que cumple con los requerimientos de la aplicación de una manera óptima, permitiendio construir menús  paso a paso y en el orden que interese además de reutilizar el mismo codigo Builder para armar todos los distintos menús, aislando el proceso de construcción al cliente quien solamente se deberá preocupar por asociar un objeto Builder con Director para mostrar cualquiera de los menus.

Las clases utilizadas en este programa son:

- Interfaz Builder: Define los pasos de construcción del menú que todos deben implementar: Plato principal, entrada, postre y bebida.

- BuilderMenu/MenuEspecial1-2: Ofrecen distintas implementaciones de los pasos de construcción. Cada uno puede crear menús con diferentes combinaciones.

- Menu: Tiene métodos para establecer los elementos del menú: setPlatoPrincipal(), setEntrante(), etc. Además de métodos para mostrar el menú completo como mostrarMenu() que imprime todos los elementos del menú.

- Director: Define el orden en que se invocarán los pasos de construcción del menú.

- Cliente (main): Asocia un objeto Builder con Director y utiliza este objeto para construir los distintos menús.

/*Diagrama de Clases*/:![image](https://github.com/NicoCastaneda/TrabajoPatronesDiseno/assets/101200949/ecea1641-9657-46db-9f28-03dcb3abfced)











Punto 4.
Para este punto se eligió el patrón Decorator ya que permite añadir funcionalidades a objetos de manera dinámica, sin necesidad de modificar su código. En este caso, se implementó el patrón para añadir decoraciones a una habitación de hotel a la que se le pueden añadir servicios adicionales como como flores frescas, chocolate gourmet, vino de alta calidad, etc.

Se escogió ya que podemos añadir los servicios adicionales de forma sencilla al encapsular el objeto original en un objeto decorador y añadirle funcionalidades adicionales sin modificar el objeto original.







Punto 5.
Para este punto se escogió el patrón Bridge, ya que nos pide hacer 3 tipos de envíos, además nos pide tener diferentes velocidades de envío, por lo que al hacerlo de manera convencional terminaríamos con una cantidad de clases excesiva, por lo que el patrón Bridge nos permite separar la abstracción de la implementación, de manera que ambas puedan variar independientemente. En este caso, la abstracción es el tipo de envío y la implementación es la velocidad de envío. De esta manera, podemos tener una clase para cada tipo de envío y una clase para cada velocidad de envío, y combinarlas de manera que no tengamos que hacer una clase para cada combinación de tipo de envío y velocidad de envío.















































.


