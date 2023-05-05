package Answer;
import Question.Questions;

public abstract class Answer {
    
    String answer;
    Questions question;

    public Answer(String answer, Questions question) {
        this.answer = answer;
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public Questions getQuestionz() {
        return question;
    }
    
    public abstract String evaluar();
    
}
