package n3exercici1;

public class Motociclisme extends Noticia {

    //attributes
    private String equip;


    //constructor

    public Motociclisme(String titular, String equip) {
        super(titular);
        this.equip = equip;
    }


    //getters
    public String getEquip() {
        return equip;
    }


    //seters
    public void setEquip(String equip) {
        this.equip = equip;
    }


    //metodes generals
    public double calcularPreuNoticia() {
        int preuInicial = 100;

        if (this.equip != null) {
            if (getEquip().equalsIgnoreCase("Honda") || getEquip().equalsIgnoreCase("Yamaha")) {
                preuInicial += 50;
            }
        }

        return preuInicial;
    }

    @Override
    public int calcularPuntuacio() {
        int punts = 3;

        if (getEquip() != null) {
            if (getEquip().equalsIgnoreCase("Honda") || getEquip().equalsIgnoreCase("Yamaha")) {
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
                "\nEquip = " + this.equip;
    }
}