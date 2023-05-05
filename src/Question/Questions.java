package Question;

public class Questions {
    
    String question;
    int tipo;
    String[] ans;
    String respuesta;    

    public Questions(String[] ans, String question, String respuesta, int tipo) {
        this.question = question;
        this.tipo = tipo;
        this.ans = ans;
        this.respuesta = respuesta;
    }

    public int getTipo() {
        return tipo;
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
