/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

/**
 *
 * @author linda
 */
public class TesteArvore {

    public static void main(String[] args) {
        ArvoreBinaria arvore1 = new ArvoreBinaria();

        System.out.println("Inserindo na arvore 1:");
        arvore1.insereNode("Joao", 2000);
        arvore1.insereNode("Maria", 8000);
        arvore1.insereNode("Luzia", 500);
        arvore1.insereNode("Mariana", 15000);
        arvore1.insereNode("Janayna", 150);


        
        //1 - imprimir os nomes em ordem alfabetica
        System.out.println("\n Em ordem alfabetica: ");
        System.out.print("Arvore1 -> ");
        arvore1.inorder();
        
        
        //7- Retornar os nomes dos funcionários que recebem menos de R$ 1.000,00
        System.out.println("\n Recebe menos que R$ 1.000,00:");
        System.out.print("Arvore1 -> ");
        arvore1.recebeMenosDeMil();
        
        
       //8 – Retornar a quantidade de funcionários que recebem menos de R$ 1.000,00
        System.out.println("\n Quantidade com salário inferior a R$ 1.000,00");
        System.out.println(arvore1.getQtdMenosQueMil());
        
        
    }

}
