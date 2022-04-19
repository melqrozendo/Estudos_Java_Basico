/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste14;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ESTRUTURA DE REPETIÇÃO - PARTE 1 - WHILE
        /*
        int contador = 0;
        while (contador < 4){
            System.out.println("Brasil: "+contador);
            contador++;
        }
        */
        //COMANDO CONTINUE; E BREAK; -> ALTERA O FLUXO DO LAÇO
        int c =0;
        while(c <10){
            c++;
            if(c == 5 || c == 7){
                continue;
            }
            else if(c == 9){
                break;
            }
            System.out.println(c+"° Ponto");
        }
        
    }
    
}
