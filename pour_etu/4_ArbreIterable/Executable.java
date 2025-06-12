public class Executable {
    public static void main(String[] args) {

        Arbre<Integer> arbre = new Arbre<Integer>(10);
        arbre.ajouter(8);
        arbre.ajouter(12);
        arbre.ajouter(9);
        arbre.ajouter(4);
        arbre.ajouter(21);
        arbre.ajouter(2);
        arbre.ajouter(18);

        System.out.println("Parours PREFIX");
        for (Integer n : arbre)
            System.out.print(n+" ");
        System.out.println();

        arbre.setParcours(Arbre.PARCOURS.INFIX);
        System.out.println("Parours INFIX");

        for (Integer n : arbre)
            System.out.print(n+" ");
        System.out.println();

        arbre.setParcours(Arbre.PARCOURS.POSTFIX);
        System.out.println("Parours POSTFIX");

        for (Integer n : arbre)
            System.out.print(n+" ");
        System.out.println();

        arbre.setParcours(Arbre.PARCOURS.BFS);
        System.out.println("Parours BFS");

        for (Integer n : arbre)
            System.out.print(n+" ");
        System.out.println();

//-------------------------------------------------------------------------


    }
}
