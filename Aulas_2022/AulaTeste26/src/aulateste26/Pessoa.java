/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste26;

/**
 *
 * @author Melquisedeque
 */
public class Pessoa {//classe
    
    /*
     *CODIGO COM O static SIGNIFICA QUE O METODO OU FUNÇÃO CRIADOS PERTENCER A
     *CLASSE PESSOA.
     *
    */
    
    public static String nome;//atributo1
    public static int idade;//atributo2
    public static String lista[] = {"Musica_A","Musica_B","Musica_C"};
    public static void exibir(){//metodo ou função
        System.out.println("Nome: "+nome); 
        System.out.println("Idade: "+idade);
        
        if(idade>=18){
            System.out.println("Vc é MAIOR DE IDADE!");
            System.out.println(lista[1]);
        }else{
            System.out.println("Vc é MENOR DE IDADE!");
        }
    }
    /*
     *CODIGO SEM O static SIGNIFICA QUE O METODO OU FUNÇÃO CRIADOS PODE PERTENCER A UMA
     *OBJETO INSTANCIADO NO METODO PRINCIPAL
     *
    /*
    public String nome;//atributo1
    public int idade;//atributo2
    public String lista[] = {"Musica_A","Musica_B","Musica_C"};
    public void exibir(){//metodo ou função
        System.out.println("Nome: "+nome); 
        System.out.println("Idade: "+idade);
        
        if(idade>=18){
            System.out.println("Vc é MAIOR DE IDADE!");
            System.out.println(lista[1]);
        }else{
            System.out.println("Vc é MENOR DE IDADE!");
        }
    }*/
}
