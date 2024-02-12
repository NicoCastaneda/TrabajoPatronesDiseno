package Punto_2;

public class Emisora {

    Command comando;

    public Emisora(Command comando){
        this.comando=comando;
    }

    public void ejecutarComando(){
        comando.Ejecutar();
    }
}
