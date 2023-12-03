package n1exercici2;

public class Cotxe {
    private static final String marca = "SEAT";
    private static String model = "Ibiza";//aquest es podria inicialitzar al constructor
    private final int potencia;

    public Cotxe(int potencia) {
        this.potencia = potencia;
        System.out.println("marca: " + marca + " de model: " + model + ". Potencia " + potencia);

    }

    public static String frenar() {
        return "El vehicle esta frenant";
    }

    public String accelerar() {
        return "El vehicle esta accelerant";
    }
}
