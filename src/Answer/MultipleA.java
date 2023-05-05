/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Answer;

import Question.*;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MultipleA extends Answer {

    MultipleQ quest;

    public MultipleA(String ans, String answer, Questions question, MultipleQ quest) {
        super(answer, question);
        this.quest = quest;
    }

    @Override
    public String evaluar() {

        String res = this.quest.getRes();
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
