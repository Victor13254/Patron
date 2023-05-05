package Run;

import Question.Questions;
import Question.Type;
import Quiz.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Launcher {

    public static void main(String[] args) {
        Scanner ls = new Scanner(System.in);
        int l = 0;
        Global a = new Global();
        Type t = new Type();

        while (l != 3) {

            System.out.println("Digite:\n [1]Crear Encuesta \n [2]Diligenciar Encuesta\n [3]Salir");
            l = ls.nextInt();

            if (l == 1) {

                System.out.print("Digite el nombre de la encuesta: ");
                String name = ls.next();

                System.out.print("Digite la cantidad de preguntas: ");
                int cantidad = ls.nextInt();

                Quiz b = new Quiz(name);
                for (int i = 0; i < cantidad; i++) {
                    
                    System.out.println("Escriba el tipo de pregunta: \n[1]Pregunta abierta \n[2]Pregunta de seleccion Si/No \n[3] Pregunta de seleccion Multiple");
                    int tipo = ls.nextInt();

                    t.crearPregunta(tipo, b);
                }
            } else if (l == 2) {
                    
                ArrayList<Quiz> q = a.getQuiz();
                
                for(int i=0;i<q.size();i++){
                    
                }
                
                System.out.print(q.get(0).getQuestion());
                
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
