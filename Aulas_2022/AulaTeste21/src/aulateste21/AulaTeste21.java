/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste21;

import java.util.Arrays;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        //FORECH
        /*
        int num[] = {3,5,1,8,4};
        for (int valor:num){
            System.out.println(valor);
        }
        */
        //VETOR EM ORDEM
        int n[] = {5,6,2,3,4};
        Arrays.sort(n);
        for(int valor: n){
            System.out.print(valor + " ");
        }
        
    }
    
}
