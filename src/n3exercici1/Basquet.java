package n3exercici1;

public class Basquet extends Noticia {

    //attributes
    private String competicio;
    private String club;
    private String jugador;


    //constructor
    public Basquet(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }


    //getters
    public String getCompeticio() {
        return this.competicio;
    }

    public String getClub() {
        return this.club;
    }

    public String getJugador() {
        return this.jugador;
    }


    //seters
    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }


    //metodes generals
    public double calcularPreuNoticia() {
        int preuInicial = 250;
        if (getCompeticio().equalsIgnoreCase("Eurolliga")) {
            preuInicial += 75;
        }
        if (getClub().equalsIgnoreCase("Barça") || getClub().equalsIgnoreCase("Madrid")) {
            preuInicial += 75;
        }
        return preuInicial;
    }

    @Override
    public int calcularPuntuacio() {
        int punts = 4;
        if (getCompeticio().equalsIgnoreCase("Eurolliga")) {
            punts += 3;
        }
        if (getCompeticio().equalsIgnoreCase("ACB")) {
            punts += 2;
        }
        if (getClub().equalsIgnoreCase("Barça") || getClub().equalsIgnoreCase("Madrid")) {
            punts += 1;
        }
        return punts;
    }


    //metodes propis
    @Override
    public String toString() {
        return super.toString() +
                "\nNoticia de Basquet: " +
                "\nCompeticio = " + this.competicio +
                "\nClub = " + this.club +
                "\nJugador='" + this.jugador;
    }
}