package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Redactor> redactors;

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {


        redactors = new ArrayList<Redactor>();

        int opcio = 0;
        String resposta = "";

        //MENU
        do {
            System.out.println("Introdueix l'opcio desitjada:" +
                    "\n1. Introduir redactor" +
                    "\n2. Eliminar redactor" +
                    "\n3. Introduir noticia a un redactor" +
                    "\n4. Eliminar noticia (es demana redactor i titular de la noticia" +
                    "\n5. Moostrar totes les noticies per redactor" +
                    "\n6. Calcular puntuacio de la noticia" +
                    "\n7. Calcular preu-noticia" +
                    "\n8. Sortit");
            opcio = entrada.nextInt();
            switch (opcio) {
                case 1:
                    resposta = introduirRedactor();
                    break;
                case 2:
                    resposta = eliminarRedactor();
                    break;
                case 3:
                    resposta = introduirNoticia();
                    break;
                case 4:
                    resposta = eliminarNoticia();
                    break;
                case 5:
                    resposta = mostrarNoticies();
                    break;
                case 6:
                    resposta = calcularPuntuacio();
                    break;
                case 7:
                    resposta = calcularPreu();
                    break;
                case 8:
                    resposta = "Adeu!";
                    break;
                default:
                    resposta = "ERROR, introdueix un numero valid";

            }
            System.out.println(resposta);

        } while (opcio != 8);

    }


    public static String introduirRedactor() {
        String nom = "";
        String dni = "";
        System.out.println("Introdueix el nom: ");
        nom = entrada.next();
        System.out.println();
        System.out.println("Introdueix el dni: ");
        dni = entrada.next();
        Redactor redactor = new Redactor(nom, dni);
        redactors.add(redactor);
        return "Redactor amb nom: " + nom + ", amb dni: " + dni + ", ha sigut creat crrectament";
    }

    public static String eliminarRedactor() {
        String dni = "";
        String resposta = "Redactor no trobat";
        //boolean trobat = false;

        System.out.println("Introdueix el nom DNI del redactor a eliminar:");
        dni = entrada.next();

        for (Redactor redactor : redactors) {
            if (redactor.getDni().equals(dni)) {
                int index = redactors.indexOf(redactor);
                redactors.remove(index);
                return "Redactor amb DNI: " + dni + ", ha sigut eliminat correctament";
            }
        }
        return "Redactor no trobat";
    }

    public static String introduirNoticia() {
        String dni = "";
        String resposta = "";
        boolean trobat = false;
        int tipus = 0;

        System.out.println("Introdueix el DNI del redactor per a introduir.li una noticia");
        dni = entrada.next();
        entrada.nextLine();//para limpiar el buffer

        for (Redactor redactor : redactors) {
            if (redactor.getDni().equalsIgnoreCase(dni)) {
                System.out.println("Escull un tipus de noticia: " +
                        "\n1. Afegir una noticia de Futbol" +
                        "\n2. Afegir una noticia de Basquet" +
                        "\n3. Afegir una noticia de Tenis" +
                        "\n4. Afegir una noticia de F1" +
                        "\n5. Afegir una noticia de Motociclisme");
                tipus = entrada.nextInt();
                switch (tipus) {
                    case 1:
                            System.out.println("Introdueix un titular: ");
                            String titularFut = entrada.nextLine();
                            entrada.nextLine();
                            System.out.println("Competicio: ");
                            String competicioFut = entrada.nextLine();
                            System.out.println("Club: ");
                            String clubFut = entrada.nextLine();
                            System.out.println("Jugador: ");
                            String jugadorFut = entrada.nextLine();
                            Futbol noticiaFutbol = new Futbol(titularFut, competicioFut, clubFut, jugadorFut);
                            redactor.asignarNoticia(noticiaFutbol);
                            resposta = "Noticia de futbol afegida correctament al redactor amb dni " + dni;
                            break;
                    case 2:
                        System.out.println("Introdueix les dades:" +
                                "\nTitular: ");
                        String titularBasq = entrada.nextLine();
                        System.out.println("Competicio: ");
                        String competicioBaq = entrada.nextLine();
                        System.out.println("Club: ");
                        String clubBasq = entrada.nextLine();
                        System.out.println("Jugador: ");
                        String jugadorBasq = entrada.nextLine();
                        Basquet noticiaBasquet = new Basquet(titularBasq, competicioBaq, clubBasq, jugadorBasq);
                        redactor.asignarNoticia(noticiaBasquet);
                        resposta = "Noticia de basquet afegida correctament al redactor amb dni " + dni;
                        break;
                    case 3:
                        System.out.println("Introdueix les dades:" +
                                "\nTitular: ");
                        String titularTen = entrada.nextLine();
                        System.out.println("Competicio: ");
                        String competicioTen = entrada.nextLine();
                        System.out.println("Nom: ");
                        String nomTen = entrada.nextLine();
                        Tenis noticiaTenis = new Tenis(titularTen, competicioTen, nomTen);
                        redactor.asignarNoticia(noticiaTenis);
                        resposta = "Noticia de tenis afegida correctament al redactor amb dni " + dni;
                        break;
                    case 4:
                        System.out.println("Introdueix les dades:" +
                                "\nTitular: ");
                        String titularF1 = entrada.nextLine();
                        System.out.println("Escuderia: ");
                        String escuderiaF1 = entrada.nextLine();
                        F1 noticiaF1 = new F1(titularF1, escuderiaF1);
                        redactor.asignarNoticia(noticiaF1);
                        resposta = "Noticia de F1 afegida correctament al redactor amb dni " + dni;
                        break;
                    case 5:
                        System.out.println("Introdueix les dades:" +
                                "\nTitular: ");
                        String titularMoto = entrada.nextLine();
                        System.out.println("Equip: ");
                        String equipMoto = entrada.nextLine();
                        Motociclisme noticiaMoto = new Motociclisme(titularMoto, equipMoto);
                        redactor.asignarNoticia(noticiaMoto);
                        resposta = "Noticia de Motociclisme afegida correctament al redactor amb dni " + dni;
                        break;
                    default:
                        resposta = "introdueix un numero valid";
                }
                trobat = true;
            }

        }
        if (!trobat) {
            resposta = "No s'ha trobat redactor amb el dni " + dni;
        }
        return resposta;

    }

    private static String eliminarNoticia() {
        String dni = "";
        String resposta = "";
        boolean trobat = false;

        System.out.println("Introdueix el dni del redactor");
        dni = entrada.nextLine();

        for (Redactor redactor : redactors) {
            if (redactor.getDni().equalsIgnoreCase(dni)) {
                System.out.println("");
            }

        }
        return "";
    }

    private static String mostrarNoticies() {
        return "";
    }

    private static String calcularPuntuacio() {
        return "";
    }

    private static String calcularPreu() {
        return "";
    }
}
