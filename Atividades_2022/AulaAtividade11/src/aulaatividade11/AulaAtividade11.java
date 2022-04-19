/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaatividade11;

import javax.swing.JOptionPane;

/**
 *
 * @author Melquisedeque
 */
public class AulaAtividade11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,  
                    "<html> informe um numero: <br><em>(valor 0 interrompe)</em></html>"));
            
            s = s + n;
            
            
        }while(n!=0);
        JOptionPane.showMessageDialog(null, "<html> Resultado final:<hr>"+ 
                "<br>Total de Valores: "+ s + 
                "</html>");
        
    }
    
}
