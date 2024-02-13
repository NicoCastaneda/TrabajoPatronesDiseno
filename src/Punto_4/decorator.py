class Component:
    def operation(self) -> str:
        pass


class ConcreteComponent(Component):
    def operation(self) -> str:
        return "Decoracion Basica"


class Decorator(Component):
    _component: Component = None  # El _ es una convención para indicar que es privada

    def __init__(self, component: Component) -> None:
        self._component = component

    @property  #
    def component(self) -> Component:
        return self._component

    def operation(self) -> str:
        return self._component.operation()


class DecoradorFlores(Decorator):
    def operation(self) -> str:
        return f"Flores, {self.component.operation()}"


class DecoradorChocolate(Decorator):
    def operation(self) -> str:
        return f"Chocolate, {self.component.operation()}"


class DecoradorVino(Decorator):
    def operation(self) -> str:
        return f"Vino, {self.component.operation()}"


"""
Espacio para añañir funcionalidades a la clase base sin modificarla.
"""


def client_code(component: Component) -> None:
    print(f"Decoración: {component.operation()}", end="\n")


if __name__ == "__main__":
    base = ConcreteComponent()
    print("Bienvenido a la habitación básica")
    client_code(base)

    simple_flores = DecoradorFlores(base)
    simple_flores_vino = DecoradorVino(simple_flores)

    print("\nBienvenido a la habitación decorada con flores y vino")
    client_code(simple_flores_vino)
