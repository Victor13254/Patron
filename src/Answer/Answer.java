
package Answer;
import Question.Questions;
/**
 *
 * @author User
 */
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
    
    public abstract String evaluar();
    
}
