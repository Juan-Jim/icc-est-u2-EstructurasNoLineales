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
           

            System.out.println("InOrden");
            ab.printInOrden();
            System.out.println("PosOrden");
            ab.printPosOrden();
            System.out.println("PreOrden");
            ab.printPreOrden();
            


    }

    
}

