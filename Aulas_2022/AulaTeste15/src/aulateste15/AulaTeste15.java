/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste15;

import java.util.Scanner;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n = teclado.nextInt();
        int cont = n;
        int valor = 1;
        System.out.print(n+"! = ");
        while(cont>=1){
            valor *= cont;
            if(cont == n){
                System.out.print(cont+" * ");
            }
            cont--;
            
            if(cont == 1){
                System.out.print(cont);
                break;
            }
            if(cont == 0){
                break;
            }
            System.out.print(cont+" * ");
        }
        System.out.println(" = "+valor);
        
    }
    
}
