package n3exercici1;

    public class Futbol extends Noticia {

        //attributs
        private String competicio;
        private String club;
        private String jugador;


        //constructor
        public Futbol(String titular, String competicio, String club, String jugador) {
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

            int preuInicial = 300;

            if (getCompeticio().equalsIgnoreCase("Lliga de campions")) {
                preuInicial += 100;
            }
            if (getClub().equalsIgnoreCase("Barça") || getClub().equalsIgnoreCase("Madrid")) {
                preuInicial += 100;
            }
            if (getJugador().equalsIgnoreCase("Ferran Torres") || getJugador().equalsIgnoreCase("Benzema")) {
                preuInicial += 50;
            }
            return preuInicial;
        }


        public int calcularPuntuacio() {
            int punts = 5;
            if (getCompeticio().equalsIgnoreCase("Lliga de campions")) {
                punts += 3;
            }
            if (getCompeticio().equalsIgnoreCase("Lliga")) {
                punts += 2;
            }
            if (getClub().equalsIgnoreCase("Barça") || getClub().equalsIgnoreCase("Madrid")) {
                punts += 1;
            }
            if (getJugador().equalsIgnoreCase("Ferran Torres") || getJugador().equalsIgnoreCase("Benzema")) {
                punts += 1;
            }
            return punts;
        }


        public String print() {
            return super.toString() +
                    "\nNoticia de Futbol: " +
                    "\nCompeticio = " + this.competicio +
                    "\nClub = " + this.club +
                    "\nJugador='" + this.jugador;
        }
    }

