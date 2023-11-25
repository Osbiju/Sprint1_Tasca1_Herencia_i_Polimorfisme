package n1exercici1;

public abstract class Instruments {

    //atributs
    private String nom;
    private float preu;

    //constructor
    public Instruments(String nom, float preu) {
        this.nom = nom;
        this.preu = preu;
    }

    //getters
    public String getNom() {
        return this.nom;
    }

    public float getPreu() {
        return this.preu;
    }

    //setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }
    //met generals

    abstract String tocar();

    //met propis
}