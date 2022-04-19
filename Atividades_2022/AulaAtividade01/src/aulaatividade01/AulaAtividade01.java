/*Este programa visa exibir a data e hora atual*/
package aulaatividade01;

import java.util.Date;//biblioteca importada para o programa


public class AulaAtividade01 {

    
    public static void main(String[] args) {
        
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
    }
    
}
