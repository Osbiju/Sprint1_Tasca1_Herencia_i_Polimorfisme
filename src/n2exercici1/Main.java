package n2exercici1;


public class Main {
    public static void main(String[] args) {

        Smartphone telefon1 = new Smartphone("nokia", "3310");

        System.out.println(telefon1.trucar("626666666"));
        System.out.println(telefon1.alarma());
        System.out.println(telefon1.fotografiar());
    }
}

