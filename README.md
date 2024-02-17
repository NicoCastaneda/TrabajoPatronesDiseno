Resumen y explicación de cada punto:

Punto 1. Para este punto se escogió el patrón Template. Este patrón permite crear una clase padre que funcione como una plantilla para subclases que requieran usar una serie de pasos definida para diferentes casos concretos evitando el código duplicado. En este caso se utilizó como ejemplo un procesador de pedidos de McDonald´s que utiliza el mismo algoritmo para realizar el pedido en línea de cada producto, pero su funcionamiento depende de sus características, así que deben seguir una serie de pasos para completarse. Para esto, se creó una clase abstracta que declara los pasos que contiene el algoritmo y el método que los contiene en el orden que se necesita. A partir de esto, se implementaron cuatro subclases concretas que implementan el algoritmo, pero deben adaptar los métodos a cada tipo de pedido. 

Para realizarlo se utilizó lo siguiente:

- Clase ProcesadorDePedidos: Es una clase abstracta que define el método plantilla en el cual está contenido el algoritmo con todos los pasos que debe seguir una clase en orden de uso. Ahí se encuentran los métodos abstractos tomarPedido(), verificarDisponibilidadPedido(), calcularPrecioPedido(), prepararPedido(), enviarPedido() y verificarEntregaPedido(). Adicionalmente se encuentran los métodos hook (pasos opcionales en el programa) escogerJuguete() y adicionarAgua() ya que se encuentran vacíos, es decir que no van a realizar ninguna acción por defecto pero serán sobreescritos en las clases concretas que los necesiten permitiendo agregar estas funcionalidades sin afectar la estructura del algoritmo.

- Clases concretas: Clases que representan el pedido de cada producto en específico. Implementa todos los métodos abstractos que hacen parte del algoritmo (excepto los opcionales) para ser utilizados en función de su propósito, por lo que van a variar los cálculos de precio, disponibilidad, toma de pedido, envíos, etc. 

- Clase PedidoHamburguesa: Implementa todos los métodos abstractos de la clase ProcesadorDePedidos.
- Clase PedidoCajitaFeliz: Implementa todos los métodos abstractos de la clase ProcesadorDePedidos y además sobrescribe el paso opcional escogerJuguete().
- Clase PedidoGaseosa:  Implementa todos los métodos abstractos de la clase ProcesadorDePedidos y además sobrescribe el paso opcional adicionarHielo().
- Clase PedidoSunday: Implementa todos los métodos abstractos de la clase ProcesadorDePedidos.

- Main: Realiza un pedido de cada producto e imprime el paso a paso.

Este patrón de diseño señala que puede existir una violación al principio de sustitución de Liskov (En este caso sucede porque las clases PedidoHamburguesa() o PedidoSunday() no podrían implementar el método opcional escogerJuguete() porque no está incluido en el producto)



*Diagrama de Clases*:![image](https://github.com/NicoCastaneda/TrabajoPatronesDiseno/blob/main/Clase%20UML%20(1).png)


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

![image](https://github.com/NicoCastaneda/TrabajoPatronesDiseno/assets/101200949/d56f8778-2dc5-49fa-acd7-9525c3c86220)






Punto 5.
Para este punto se escogió el patrón Bridge, ya que nos pide hacer 3 tipos de envíos, además nos pide tener diferentes velocidades de envío, por lo que al hacerlo de manera convencional terminaríamos con una cantidad de clases excesiva, por lo que el patrón Bridge nos permite separar la abstracción de la implementación, de manera que ambas puedan variar independientemente. En este caso, la abstracción es el tipo de envío y la implementación es la velocidad de envío. De esta manera, podemos tener una clase para cada tipo de envío y una clase para cada velocidad de envío, y combinarlas de manera que no tengamos que hacer una clase para cada combinación de tipo de envío y velocidad de envío.

![image](https://github.com/NicoCastaneda/TrabajoPatronesDiseno/assets/101200949/004afd19-65be-46ee-8ae2-91663682a2cd)














































.


