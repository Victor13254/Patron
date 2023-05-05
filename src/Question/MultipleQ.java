/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question;

/**
 *
 * @author User
 */
public class MultipleQ extends Questions {

    String[] ans;
    String respuesta;

    public MultipleQ(String[] ans, String question, String respuesta) {
        super(question);
        this.ans = ans;
        this.respuesta = respuesta;
    }

    public String[] getAns() {
        return ans;

    }

    public String getRes() {
        return respuesta;
    }

}
