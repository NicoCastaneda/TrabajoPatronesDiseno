from __future__ import annotations
from abc import ABC, abstractmethod


class VelocidadEstandar:

    def __init__(self, implementation: ImplementationTipoEnvio) -> None:
        self.implementation = implementation

    def operation(self) -> str:
        return f"Envío base mediante: {self.implementation.operation_implementation()}"


class VelocidadExpress(VelocidadEstandar):
    def operation(self) -> str:
        return f"Envío express mediante: {self.implementation.operation_implementation()}"


class ImplementationTipoEnvio(ABC):
    @abstractmethod
    def operation_implementation(self) -> str:
        pass


class EnvioTerrestre(ImplementationTipoEnvio):
    def operation_implementation(self) -> str:
        return "Tierra"


class EnvioMaritimo(ImplementationTipoEnvio):
    def operation_implementation(self) -> str:
        return "Barco"


class EnvioAereo(ImplementationTipoEnvio):
    def operation_implementation(self) -> str:
        return "Avion"


def client_code(abstraction: VelocidadEstandar) -> None:
    print(abstraction.operation(), end="")


if __name__ == "__main__":
    tipo1 = EnvioTerrestre()
    envio1 = VelocidadEstandar(tipo1)
    client_code(envio1)

    print("")

    tipo2 = EnvioAereo()
    envio2 = VelocidadExpress(tipo2)
    client_code(envio2)

