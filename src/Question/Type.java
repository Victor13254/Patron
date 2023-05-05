/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question;

import Quiz.Quiz;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Type {

    public Type() {
    }

    public void crearPregunta(int tipo, Quiz q) {
        Scanner ls = new Scanner(System.in);

        System.out.println("Escriba la pregunta: \n");
        String que = ls.next();

        Questions quest = null;

        if (tipo == 1) {

            quest = new Questions(que);

        } else if (tipo == 2) {

            String[] ans = {"Si", "No"};

            System.out.println("Escriba la respuesta correcta: \n [Si] o [No]");
            String res = ls.next();

            quest = new MultipleQ(ans, que, res);

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

            quest = new MultipleQ(ans, que, res);

        }

        q.add(quest);
    }

}
