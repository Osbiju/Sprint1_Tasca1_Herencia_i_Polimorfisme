package n3exercici1;

public class Tenis extends Noticia {

    //attributes
    private String competicio;
    private String nom;


    //constructor
    public Tenis(String titular, String competicio, String nom) {
        super(titular);
        this.competicio = competicio;
        this.nom = nom;
    }


    //getters
    public String getCompeticio() {
        return this.competicio;
    }

    public String getNom() {
        return this.nom;
    }


    //seters
    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public void setClub(String nom) {
        this.nom = nom;
    }


    //metodes generals
    public double calcularPreuNoticia() {
        int preuInicial = 150;

        if (this.nom != null) {
            if (getNom().equalsIgnoreCase("Federer") || getNom().equalsIgnoreCase("Nadal") || getNom().equalsIgnoreCase("Djokovic")) {
                preuInicial += 100;
            }
        }

        return preuInicial;
    }

    @Override
    public int calcularPuntuacio() {
        int punts = 4;

        if (getNom() != null) {
            if (getNom().equalsIgnoreCase("Federer") || getNom().equalsIgnoreCase("Nadal") || getNom().equalsIgnoreCase("Djokovic")) {
                punts += 3;
            }
        }

        return punts;
    }


    //metodes propis

    @Override
    public String toString() {
        return super.toString() +
                "\nNoticia de Futbol: " +
                "\nCompeticio = " + this.competicio +
                "\nNom = " + this.nom;
    }
}