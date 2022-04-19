/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste22;

import java.util.Arrays;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //REALIZANDO BUSCA DE VALOR NO VETOR
        int num[] = {3,5,8,1,4};
        int p = Arrays.binarySearch(num,8);
        System.out.println("o valor: "+num[p]+" está na posição: "+ p);
    }
    
}
