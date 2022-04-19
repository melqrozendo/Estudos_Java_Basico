/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste26;

import java.util.Scanner;

/**
 *
 * @author Melquisedeque
 */
public class AulaTeste26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //codigo pertence a CLASSE Pessoa
        String dado1;
        int dado2;
        
        //Pessoa identificado = new Pessoa();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        dado1 = teclado.nextLine();
        Pessoa.nome = dado1;//objeto chama atributo nome para receber valor string da variavel
        System.out.print("Digite sua idade: ");
        dado2 = teclado.nextInt();
        Pessoa.idade = dado2;//objeto chama atributo idade para receber valor inteiro da variavel
        
        //identificado.exibir();//objeto intanciado da classe Pessoa chamando o Metodo ou Funçao exibir();
        Pessoa.exibir();
        
        //codigo pertence ao OBJETO INSTANCIADO <identificado>
        /*
        String dado1 = " ";
        int dado2;
        
        Pessoa identificado = new Pessoa();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        dado1 = teclado.nextLine();
        identificado.nome = dado1; //objeto chama atributo nome para receber valor string da variavel
        System.out.print("Digite sua idade: ");
        dado2 = teclado.nextInt();
        identificado.idade = dado2; //objeto chama atributo idade para receber valor inteiro da variavel
        
        identificado.exibir(); //objeto intanciado da classe Pessoa chamando o Metodo ou Funçao exibir();
        
        */
    }
    
}
