package Answer;

import Question.*;
import java.util.Scanner;


public class MultipleA extends Answer {


    public MultipleA(String answer, Questions question) {
        super(answer, question);
    }

    @Override
    public String evaluar() {

        String res = this.question.getRes();
        String respuesta = " ";
        if (res.equals(answer)) {

            respuesta += "La respuesta es correcta";
            return respuesta;
        } else {

            respuesta += "La respuesta es incorrecta";
            return respuesta;
        }

    }

}
