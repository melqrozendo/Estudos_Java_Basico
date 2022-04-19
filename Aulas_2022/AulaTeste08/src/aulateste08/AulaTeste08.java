/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste08;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //USO DO METODO .EQUALS(); 
        String nome1 = "Melq";
        String nome2 = "Melq";
        String nome3 = new String("Melq");
        String res;
        String aluno;
        res = (nome1.equals(nome3))?"igual":"diferente";
        aluno = (nome1 == nome2)?"0":"1"; 
        System.out.println(res);
        System.out.println(aluno);
    }
    
}
