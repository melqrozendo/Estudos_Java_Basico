/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste13;

import java.util.Scanner;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite quantas pernas: ");
        int pernas = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (pernas){
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "humano";
                break;
            case 3:
                tipo = "tripé";
                break;
            default:
                tipo = "Et";
                break;
    }
        System.out.println(tipo);
    }
    
}
