package Question;

public class Questions {
    
    String question;
    int tipo;
    String[] ans;
    String respuesta; 
    int id;

    public Questions(int id,String[] ans, String question, String respuesta, int tipo) {
        this.question = question;
        this.tipo = tipo;
        this.ans = ans;
        this.respuesta = respuesta;
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }
    
    public String getQuestion() {
        return question;
    }

    
    public String[] getAns() {
        return ans;

    }

    public String getRes() {
        return respuesta;
    }

}
