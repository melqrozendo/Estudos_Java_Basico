/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste27;

/**
 *
 * @author Melquisedeque
 */
public class Fatorial {
    
    private int num = 0;
    private int fat = 1;
    private String formula = " ";
    
    public void setValor(int n){
        num = n;//num recebe o valor inteiro do paramentro que na classe principal do codigo foi atribuido
        int f = 1;
        String s = " ";
        for(int c = n; c > 1; c--){
            f *= c; //f recebe mutiplicando o valor de c(contador decrementado) 
            s += c +" x "; //s recebe o valor de c (contador) que esta concatenado com a caracter "x"
        }
        s += "1 = ";//ao finalizar a estrutura de repetição for o codigo é executado
        fat = f;//fat recebe as multiplicações para obter o fatorial
        formula = s;//formula recebe valor de s
    }
    public int getInicial(){
        return num;
    }
    public int getFatorial(){
        return fat;
    }
    public String getFormula(){
        return formula;
    }
}
