/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste17;

import java.util.Scanner;
/**
 *
 * @author Melquisedeque
 */
public class AulaTeste17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ESTRUTURA DE REPETIÇÃO - PARTE 2 - DO WHILE
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um valor: ");
            n = teclado.nextInt();
            s = s + n;
            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next();
        }while(resp.equals("S"));
        System.out.println("A soma de todos os valores é: "+s);
        
    }
    
}
