/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste11;

import java.util.Scanner;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONDICIONAL COMPOSTA
        Scanner teclado = new Scanner(System.in);
        System.out.println("Em que ano vc nasceu? ");
        int nasc = teclado.nextInt();
        int idade = 2022 - nasc;
        System.out.println("Vc tem "+idade+" anos");
        if(idade>=18){
            System.out.println("Maior de idade.");
        }else{
            System.out.println("Menor de idade.");
        }
    }
    
}
