package n1exercici2;

public class Main {
    public static void main(String[] args) {

        Cotxe cotxe1 = new Cotxe(90);
        Cotxe cotxe2 = new Cotxe(155);

        System.out.println(cotxe1.accelerar());
        System.out.println(Cotxe.frenar());//metode static

        System.out.println(cotxe2.accelerar());

    }
}
