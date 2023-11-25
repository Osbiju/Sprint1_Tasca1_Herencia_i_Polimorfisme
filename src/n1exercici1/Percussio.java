package n1exercici1;

public class Percussio extends Instruments {
    public Percussio(String nom, float preu) {
        super(nom, preu);
    }

    public String tocar() {
        return "Està sonant un instrument de percussio " + this.getNom() + ", amb un preu de " + this.getPreu();
    }

    static {
        System.out.println("percussio inicialitzat");
    }

}