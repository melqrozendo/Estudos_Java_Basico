/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste27;

import java.util.Scanner;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fatorial f = new Fatorial();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor para ser Fatorado: ");
        int dado = teclado.nextInt();
        f.setValor(dado);
    
        System.out.print(f.getInicial()+"! = ");
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }
    
}
