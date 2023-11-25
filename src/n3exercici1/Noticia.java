package n3exercici1;

public abstract class Noticia {

    //attributes
    protected final String titular; //HABRIAN DE SER PROTECTED EN VEZ DE PRIVATE?, ha de ser protected para q loas subclases lo hereden
    protected final String text = "";//NO SE SI INICIARLA AQUI O AL CONSTRUCTOR????????¿¿¿??? AQUIIIII, ES UNA CONSTANTE
    protected final int puntuacio; //nunca cambiara tampoco una vez se crea no cambia
    protected final double preu;


    //constructor
    public Noticia(String titular) {
        this.titular = titular;
        this.puntuacio = calcularPuntuacio();
        this.preu = calcularPreuNoticia();
    }


    //getters
    public String getTitular() {
        return this.titular;
    }

    public String getText() {
        return this.text;
    }

    public int getPuntuacio() {
        return this.puntuacio;
    }

    public double getPreu() {
        return this.preu;
    }


    //seters, no se necesitan


    //metodes generals
    public abstract double calcularPreuNoticia();

    public abstract int calcularPuntuacio();//¿?¿? a totes????-->SI


    //metodes propis

    public String toString() {
        return "Noticia:" +
                "\ntitular=" + this.titular +
                "\n, text=" + this.text +
                "\n, puntuacio=" + this.puntuacio +
                "\n, preu=" + this.preu;
    }
}