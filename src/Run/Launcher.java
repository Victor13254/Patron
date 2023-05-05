package Run;

import Question.*;
import Quiz.*;
import Answer.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        Scanner ls = new Scanner(System.in);

        Global a = new Global();
        TypeQ typeQ = new TypeQ();
        TypeA typeA = new TypeA();

        System.out.println("Digite:\n [1]Crear Quiz \n [2]Diligenciar Quiz\n [3]Salir");
        int l = ls.nextInt();

        while (l != 3) {

            if (l == 1) {

                System.out.print("Digite el nombre del quiz: ");
                String name = ls.next();

                System.out.print("Digite el ID del Quiz: ");
                int id = ls.nextInt();

                System.out.print("Digite la cantidad de preguntas: ");
                int cantidad = ls.nextInt();

                Quiz b = new Quiz(name, id);
                for (int i = 0; i < cantidad; i++) {

                    System.out.println("Escriba el tipo de pregunta: \n[1]Pregunta abierta \n[2]Pregunta de seleccion Si/No \n[3] Pregunta de seleccion Multiple");
                    int tipo = ls.nextInt();

                    typeQ.crearPregunta(tipo, b);
                }

                a.add(b);
            } else if (l == 2) {

                if (a.getQuiz().isEmpty()) {

                    System.out.println("No existe ningun quiz para diligenciar");

                } else {
                    System.out.println("Existen los siguientes Quices para Diligenciar:");
                    for (Quiz q1 : a.getQuiz()) {
                        System.out.println("Nombre: " + q1.getName() + "--> ID: " + q1.getId());
                    }
                    System.out.println("Por favor digite el ID del Quiz que quiere solucionar");
                    int ident = ls.nextInt();
                    Quiz q1 = null;
                    for (Quiz q2 : a.getQuiz()) {
                        if (q2.getId() == ident) {
                            q1 = q2;
                        } else {
                            System.out.println("No existe ese Quiz");
                        }

                    }
                    System.out.println("A continuacion el quiz:" + q1.getName());
                    int i = 0;

                    for (Questions a1 : q1.getQuestions()) {

                        System.out.println("Pregunta " + i + ": ");
                        i++;

                        typeA.evaluarPregunta(a1, q1);
                    }

                }
            } else if (l == 3) {
                break;

            } else {
                System.out.println("No es una opcion valida");
            }
            System.out.println("Digite:\n [1]Crear Encuesta \n [2]Diligenciar Encuesta\n [3]Salir");
            l = ls.nextInt();
        }

    }

}
