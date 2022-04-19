/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste10;

import java.util.Scanner;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONDICIONAL SIMPLES
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println("Sua media é: "+m);
        
        if(m>9){
            System.out.println("Parabéns!");
            
        }
    }
    
}
