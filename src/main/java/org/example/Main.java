package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> personas = new ArrayList<>();
        int asist[] = {1,0};
        String input;
        int ass;
        int presente;
        System.out.println("Bienvenido");
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Añade a tus alumnos: (para terminar escriba SALIR ");
            input = in.nextLine();
            if (input.equalsIgnoreCase("SALIR")){
                break;
            }
            personas.add(input);
        }
        System.out.println("Tomar asistencia...");
        for (String elemento : personas){
            System.out.println( "El alumno:" + elemento);
            System.out.print("Asistió o Faltó (1 o 0)");
            ass = in.nextInt();
            if (ass == 1){
                presente = asist[0];
            }else {
                presente = asist[1];
            }
        }
    }
}