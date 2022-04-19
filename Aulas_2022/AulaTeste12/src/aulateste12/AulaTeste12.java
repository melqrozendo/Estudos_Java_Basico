/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste12;

import java.util.Scanner;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2022 - nasc;
        System.out.println("Idade: "+idade);
        if(idade<16){
            System.out.print("Não vota!");
        }else if ((idade >=16 && idade < 18) || (idade > 70)){
            System.out.print("Voto opcional!");  
        }else if(idade >=18 && idade<70){
            System.out.println("Voto obrigatório!");
        }
    }
    
}
