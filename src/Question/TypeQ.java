package Question;

import Answer.*;
import Quiz.*;
import java.util.Scanner;

public class TypeQ {

    public TypeQ() {
    }

    public void crearPregunta(int tipo, Quiz q) {
        Scanner ls = new Scanner(System.in);
        System.out.println("Escribe el ID de la pregunta");
        int id = ls.nextInt();
        System.out.println("Escriba la pregunta: \n");
        String que = ls.next();

        Questions quest = null;

        if (tipo == 1) {
            String[] ans = {};
            String res = "";
            quest = new Questions(id, ans, que, res, tipo);

        } else if (tipo == 2) {

            String[] ans = {"Si", "No"};

            System.out.print("Escriba la respuesta correcta: \n[Si] o [No] \n");
            String res = ls.next();

            quest = new Questions(id, ans, que, res, tipo);

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

            quest = new Questions(id, ans, que, res, tipo);

        }

        q.add(quest);
    }

}
