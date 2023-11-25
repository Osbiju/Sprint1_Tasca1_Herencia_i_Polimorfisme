package n1exercici1;

public class Main {

    public static void main(String[] args) {
        Instruments instrument1 = new Vent("Flauta", 80);
        Instruments instrument2 = new Corda("Ukulele", 150);
        Instruments instrument3 = new Percussio("Tambor", 280);

        System.out.println(instrument1.tocar());
        System.out.println(instrument2.tocar());
        System.out.println(instrument3.tocar());


        Instruments instrument4 = new Vent("Trompeta", 80);
        System.out.println(instrument4.tocar());
    }
}

