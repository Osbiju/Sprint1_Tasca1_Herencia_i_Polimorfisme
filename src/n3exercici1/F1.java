package n3exercici1;

public class F1 extends Noticia {

    //attributes
    private String escuderia;


    //constructor

    public F1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }


    //getters
    public String getEscuderia() {
        return this.escuderia;
    }


    //seters
    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }


    //metodes generals
    public double calcularPreuNoticia() {
        int preuInicial = 100;
        if (getEscuderia().equalsIgnoreCase("Ferrarri") || getEscuderia().equalsIgnoreCase("Mercedes")) {
            preuInicial += 50;
        }
        return preuInicial;
    }

    @Override
    public int calcularPuntuacio() {
        int punts = 4;
        if (getEscuderia().equalsIgnoreCase("Ferrarri") || getEscuderia().equalsIgnoreCase("Mercedes")) {
            punts += 2;
        }
        return punts;
    }


    //metodes propis

    @Override
    public String toString() {
        return super.toString() +
                "\nNoticia de F1: " +
                "\nEscuderia = " + this.escuderia;
    }
}
