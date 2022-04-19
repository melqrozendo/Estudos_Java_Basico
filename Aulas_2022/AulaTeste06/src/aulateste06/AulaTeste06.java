/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste06;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        //Operadores aritimeticos
       int n1 = 3;
       int n2 = 5;
       float m = (n1 + n2)/2;
       System.out.println("A média é igual a " + m);
       */
       /*
       //Operadores unitarios
       int numero = 10;
       numero--;
       System.out.println(numero);
       */
       /*
       //Operadores de atribuição
       int x = 4;
       x += 2;//x = x + 2
       System.out.println(x);
       */
       /*
       //Classe Math
       float v = 8.5f;
       int ar = (int) Math.round(v);
       System.out.println(ar);
        */
       //Gerar numeros aleatórios
       double aleatorio = Math.random();
       int n = (int) (10 + aleatorio * ( 1-10 ));
       System.out.println(n);
    }
    
}
