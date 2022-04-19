/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste09;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERADORES LOGICOS
        int x,y,z;
        boolean r1,r2,r3;
        x = 4;
        y = 6;
        z = 8;
        
        r1 = (x>y && z>y)?true:false;           //and
        r2 = (x == y || x != z)?true:false;     //or
        r3 = (x < y ^ x == z)?true:false;       //xor
        System.out.println(r1+"\n"+r2+"\n"+r3);
        
        
        
    }
    
}
