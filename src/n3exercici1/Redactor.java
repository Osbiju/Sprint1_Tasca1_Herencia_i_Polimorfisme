package n3exercici1;

import java.util.ArrayList;

    public class Redactor {
        //atributs


        //ARRAY DE NOTICIAS
        private final ArrayList<Noticia> _noticias = new ArrayList<>();
        private final String nom;
        private final String dni;
        private final int _sou = 1500; //se pone _. Quiere decir que no se va a utilizar fuera de la clase,


        //constructor
        public Redactor(String nom, String dni) {
            this.nom = nom;
            this.dni = dni;
        }


        //getters

        public String getNom() {
            return this.nom;
        }

        public String getDni() {
            return this.dni;
        }


        //seters
        //no posu setters pq el preograma no deixara cambiar el nom ni el dni n el sou


        //metodes generals

        //he de tener un metodo tipo eliminarNoticiaPorTitular?

        //ha de tener un metodo de scribir/asigner noticia, lo que hace es meter esa noticia en larray de noticias pertenecientes al redactor
        public void asignarNoticia(Noticia noticia) {
            _noticias.add(noticia);
        }
        //metodes propis
    }

