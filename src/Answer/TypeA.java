package Answer;

import Question.Questions;
import Quiz.Quiz;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TypeA {

    public TypeA() {
    }

    public void evaluarPregunta(Questions q, Quiz g) {
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

            for (String ops : q.getAns()) {
                op += "[" + ops + "]";
            }
            System.out.println("Escriba la opcion correcta: " + op);
            String answer = ls.next();

            anss = new MultipleA(answer, q);

            System.out.println(anss.evaluar());
        }
        g.add(anss);
    }

}
