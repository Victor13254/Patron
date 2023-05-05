/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Answer;

import Question.Questions;

/**
 *
 * @author User
 */
public class OpenA extends Answer{
    
    String ans;

    public OpenA(String answer, Questions question,String ans) {
        super(answer, question);
        this.ans = ans;
    }

    public String getAns() {
        return ans;
    }

    @Override
    public String evaluar() {
        return "No hay respuesta correcta para esta pregunta"; 
    }
    
}
