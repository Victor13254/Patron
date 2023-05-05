package Answer;

import Question.Questions;

public class OpenA extends Answer{
    
    public OpenA(String answer, Questions question) {
        super(answer, question);
    }

    @Override
    public String evaluar() {
        return "No hay una respuesta correcta";
    }
    
}
