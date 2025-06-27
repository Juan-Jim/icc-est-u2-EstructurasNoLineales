import materia.controllers.AVLTree;
import materia.controllers.BinaryTree;

public class App {

    public static void  main(String[] args) {
        BinaryTree ab = new BinaryTree(); 
            ab.insert(50);
            ab.insert(17);
            ab.insert(76);
            ab.insert(9);
            ab.insert(23);
            ab.insert(54);
            ab.insert(14);
            ab.insert(19);
           
            /* 
            System.out.println("InOrden");
            ab.printInOrden();
            System.out.println("PosOrden");
            ab.printPosOrden();
            System.out.println("PreOrden");
            ab.printPreOrden();
            

            if (ab.findValue(23)) {
                System.out.println("Encontro el valor 23");
            } else {
                System.out.println("No encontro el valor 23");
            }
            if (ab.findValue(77)) {
                System.out.println("Encontro el valor 77");
            } else {
                System.out.println("No encontro el valor 77");
            }
            

        System.out.println("SPeso = " + ab.getSize());
        System.out.println("Altura es = " + ab.getHeight());
        System.out.println("\nInOrden");
        ab.printInOrden();
        System.out.println("\nArbol InOrden con alturas");
        ab.printInOrdenWithHeight();
        System.out.println("\nArbol InOrden con factor de equilibrio");
        ab.printInOrdenWithBalanceFactor();
        System.out.println("\nArbol esta equilibrado = " + ab.isBalanced());
        System.out.println("\nExiste el nodo 15 = " + ab.findValue(15));
        System.out.println("\nAgregamos el valor = 15");
        ab.insert(15);
        System.out.println("Arbol esta equilibrado = " + ab.isBalanced());
        System.out.println("\nArbol InOrden con factor de equilibrio");
        ab.printInOrdenWithBalanceFactor();
        System.out.println("\n");
        ab.printUnbalancedNodes();  
        */



        AVLTree tree = new AVLTree();

        tree.insert(5);
        tree.insert(20);
        tree.insert(15);
        

        System.out.println("Recorrido in-order del árbol AVL:");
        tree.inOrder();
    
    }

    
}

