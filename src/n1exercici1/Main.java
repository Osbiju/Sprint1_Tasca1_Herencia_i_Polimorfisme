package n1exercici1;

public class Main {

    public static void main(String[] args) {
        Instrument instrument1 = new Vent("Flauta", 80);
        Instrument instrument2 = new Corda("Ukulele", 150);
        Instrument instrument3 = new Percussio("Tambor", 280);

        System.out.println(instrument1.tocar());
        System.out.println(instrument2.tocar());
        System.out.println(instrument3.tocar());


        Instrument instrument4 = new Vent("Trompeta", 80);
        System.out.println(instrument4.tocar());
    }
}

