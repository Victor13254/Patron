package Question;

import Answer.*;
import Quiz.*;
import java.util.Scanner;

public class Type {

    public Type() {
    }

    public void crearPregunta(int tipo, Quiz q) {
        Scanner ls = new Scanner(System.in);

        System.out.println("Escriba la pregunta: \n");
        String que = ls.next();

        Questions quest = null;

        if (tipo == 1) {
            String[] ans ={};
            String res = "";
            quest = new Questions(ans, que, res, tipo);

        } else if (tipo == 2) {

            String[] ans = {"Si", "No"};

            System.out.println("Escriba la respuesta correcta: \n [Si] o [No]");
            String res = ls.next();

            quest = new Questions(ans, que, res, tipo);

        } else if (tipo == 3) {
            String[] ans;
            System.out.print("Escriba la cantidad de opciones:");
            int op = ls.nextInt();

            ans = new String[op];
            for (int i = 0; i < op; i++) {
                System.out.println("Escriba la opcion numero" + (i + 1) + ": ");
                ans[i] = ls.next();
            }

            System.out.println("\nEscriba la respuesta correcta:");
            String res = ls.next();

            quest = new Questions(ans, que, res, tipo);

        }

        q.add(quest);
    }

    public void evaluarPregunta(Questions q) {
        Scanner ls = new Scanner(System.in);

        Answer anss = null;

        if (q.getTipo() == 1) {

            System.out.println(q.getQuestion());
            System.out.println("Digite su respuesta: ");
            String answer = ls.next();

            anss = new OpenA(answer, q);

        } else if (q.getTipo() == 2) {
            int i = 0;

            System.out.println(q.getQuestion());
            System.out.println("Escriba su respuesta: [Si] o [No]");
            String answer = ls.next();

            anss = new MultipleA(answer, q);
            
            System.out.println(anss.evaluar());

        } else if (q.getTipo() == 3) {
            
            System.out.println(q.getQuestion());
            String op = "";
            
            for (String ops: q.getAns()) {
                op += "["+ops+"]";
            }
            System.out.println("Escriba la opcion correcta: "+op);
            String answer = ls.next();

            anss = new MultipleA(answer, q);
            
            System.out.println(anss.evaluar());
        }

    }

}
