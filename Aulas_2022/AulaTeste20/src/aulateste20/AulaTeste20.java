/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste20;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"JAN","FEV","MAR","ABR","MAI","JUN","JUL","AGO","SET","OUT","NOV","DEZ"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for(int c = 0; c<=mes.length; c++){
            System.out.println("Mês: "+ mes[c] + "| Dias: "+ dias[c]);
        }
    }
    
}
