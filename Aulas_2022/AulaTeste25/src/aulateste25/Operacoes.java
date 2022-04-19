/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste25;

/**
 *
 * @author Melquisedeque
 */
public class Operacoes {
    //criando um metodo
    public static String contador (int i, int f){
        String s = " ";//variavel string que inicia vazia
        for(int c = i; c <= f; c++){
            s += c + " ";//atribui o valor do contador (c) de acordo com o paramentro de inicio e fim
                         //
        }
        return s;
    }
    
}
