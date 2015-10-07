package arvorebinaria;

/**
 *
 * @author linda
 * 
 * AQUI ESTÃO OS MÉTODOS PARA PERCORRER A ARVORE
 */
public class ArvoreBinaria {

    
    
    private TreeNode raiz;
    
    int qtdMenosQueMil = 0;

 

    public ArvoreBinaria() {
        raiz = null;
    }

    public void insereNode(String nome, double salario) {
        if (raiz == null) {
            raiz = new TreeNode(nome, salario);
        } else {
            raiz.insereNode(nome, salario);
        }
    }

    //começa percurso na pré-ordem 
    public void preOrder() {
        preOrder(raiz);
    }

    //fazer percurso na pre ordem
    private void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.nome + " , ");
        //percorrendo a subarvore esquerda
        preOrder(node.esquerdaNode);
        //percorrendo a subarvore direita
        preOrder(node.direitaNode);
    }

    //começa o percurso na ordem
    public void inorder() {
        inorder(raiz);
    }

    //método recursivo para fazer o percurso na ordem alfabetica
    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        //percorre a subarvore a esquerda
        inorder(node.esquerdaNode);

        System.out.print(node.nome + " , ");

        //percorre a subarvore a direita
        inorder(node.direitaNode);
    }

    //começa o percurso para verificar salario
    public void recebeMenosDeMil() {
        recebeMenosDeMil(raiz);
    }

    public void recebeMenosDeMil(TreeNode node) {
        
        if (node == null) {
            return ;
        }
        else if (node.salario < 1000){
            System.out.print(node.nome + " , ");
           qtdMenosQueMil +=1;
        }
        //percorrendo a subarvore esquerda
       recebeMenosDeMil(node.esquerdaNode);
        //percorrendo a subarvore direita
        recebeMenosDeMil(node.direitaNode);
    }
    //retorna qtd que recebe menos que 1000
       public int getQtdMenosQueMil() {
        return qtdMenosQueMil;
    }
}
