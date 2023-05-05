package Quiz;

import Answer.Answer;
import Question.Questions;
import java.util.ArrayList;

public class Quiz {
    
    ArrayList<Questions> questions = new ArrayList<>();
    ArrayList<Answer> answer = new ArrayList<>();
    String name;  

    public Quiz(String name) {
        this.name = name;
        this.questions = questions;
        this.answer = answer;
    }
    
    public void add(Questions e){
        this.questions.add(e);
    }
    public void add(Answer e){
        this.answer.add(e);
    }

    public ArrayList<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Questions> questions) {
        this.questions = questions;
    } 
    public void setAnswers(ArrayList<Answer> answer) {
        this.answer = answer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
