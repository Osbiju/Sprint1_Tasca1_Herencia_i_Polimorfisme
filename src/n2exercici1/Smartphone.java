package n2exercici1;

public class Smartphone extends Telefon implements Camara, Rellotge{

    public Smartphone(String marca, String model) {
        super(marca, model);

    }


    public String alarma() {
        return "Esta sonant l'alarma.";
    }


    public String fotografiar() {
        return "S'esta fent una foto";

    }
}