package n1exercici1;

public class Corda extends Instruments {
    //atributs
    //constructor
    public Corda(String nom, float preu) {
        super(nom, preu);
    }

    //getters
    //setters
    //met general
    public String tocar() {
        return "Està sonant un instrument de corda " + this.getNom() + ", amb un preu de " + this.getPreu();
    }

    static {
        System.out.println("corda inicialitzat");
    }
}