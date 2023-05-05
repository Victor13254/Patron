package Quiz;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Global {
    
    ArrayList<Quiz> quiz = new ArrayList<>();

    public Global() {
        this.quiz = quiz;
    }
    
    public void add(Quiz e){
        this.quiz.add(e);
    }

    public ArrayList<Quiz> getQuiz() {
        return quiz;
    }

    public void setQuiz(ArrayList<Quiz> quiz) {
        this.quiz = quiz;
    }

   
    
}
