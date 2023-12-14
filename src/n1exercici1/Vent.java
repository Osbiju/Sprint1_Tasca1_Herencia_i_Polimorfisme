package n1exercici1;

public class Vent extends Instrument {

    //atributs
    //constructor
    public Vent(String nom, float preu) {
        super(nom, preu);
    }

    //getters
    //setters

    //met general
    public String tocar() {
        return "Està sonant un instrument de vent, de nom " + this.getNom() + ", amb un preu de " + this.getPreu();
    }

    static {
        System.out.println("vent inicialitzat");
    }
}