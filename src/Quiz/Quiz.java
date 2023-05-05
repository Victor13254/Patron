package Quiz;

import Answer.Answer;
import Question.Questions;
import java.util.ArrayList;

public class Quiz {
    
    ArrayList<Questions> questions = new ArrayList<>();
    ArrayList<Answer> answer = new ArrayList<>();
    String name;  
    int id;

    public Quiz(String name,int id) {
        this.name = name;
        this.questions = questions;
        this.answer = answer;
        this.id = id;
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

    public ArrayList<Answer> getAnswer() {
        return answer;
    }

    public int getId() {
        return id;
    }
    
}
