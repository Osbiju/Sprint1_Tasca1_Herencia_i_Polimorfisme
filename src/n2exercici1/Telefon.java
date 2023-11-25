package n2exercici1;

public class Telefon {

    private String marca;
    private String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }


    public String trucar(String numTelefon) {
        return "S'esta trucant al numero: " + numTelefon;

    }
}