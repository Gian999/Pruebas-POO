package org.example;

import java.util.Date;
import java.util.Scanner;

public class jaaa {

    public static void main(String[] args) {
        System.out.println("Hello");
        int nomVec1[]= {1,2,3,4,5,6,7,8,9,10};

        Persona nomVec2[] = {new Persona("Juan","Presente","m"), new Persona("Pablito", "Presente", "m")};

        for (int elemento : nomVec1){
            System.out.println(elemento);
        }
        System.out.println();
        System.out.println("other");

        Scanner in = new Scanner(System.in);

        for (Persona elemento : nomVec2){
            System.out.println("Fecha actual: " + elemento.getFecha());
            elemento.fecha = new Date();
            System.out.println("Está presente: " + elemento.nombre);
            elemento.setEstadoAsis(in.nextLine());
        }

        System.out.println("Mostar registro de asistencia");
        for (Persona p:nomVec2){
            //System.out.println(p.nombre + " - " + p.estadoAsis);
            System.out.println(p.getNombre() + " - " + p.getGenero() + " - " + p.getEstadoAsis() + " - " + p.getFecha());
        }






    }
}
