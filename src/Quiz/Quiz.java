package Quiz;

import Question.Questions;
import java.util.ArrayList;

public class Quiz {
    
    ArrayList<Questions> questions = new ArrayList<>();
    String name;  

    public Quiz(String name) {
        this.name = name;
        this.questions = questions;
    }
    
    public void add(Questions e){
        this.questions.add(e);
    }

    public ArrayList<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Questions> questions) {
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
