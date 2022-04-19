
package aulateste03;

import java.util.Scanner;


public class AulaTeste03 {

   
    public static void main(String[] args) {
        /*
        int n = 5;
        int n1 = 7;
        int m;
        m = n + n1;
        System.out.println(n);
        System.out.println(n1);
        System.out.println(m);
        
        String nome = "Melq";
        float nota = 8.5f;
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        Melq*/
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.format("O nome do Aluno é: %s \n", nome);
    }
    
}
