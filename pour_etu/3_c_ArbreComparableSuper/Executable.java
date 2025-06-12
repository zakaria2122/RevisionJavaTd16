public class Executable {
    public static void main(String[] args) {


        //------------------------------------------------------------------------
        // Il est toujours possible de définir des arbre de formes
        //------------------------------------------------------------------------
        
        Forme rectangle1 = new Rectangle("rect1", 10, 50);
        Forme rectangle2 = new Rectangle("rect2", 20, 50);
        Forme cercle1 = new Cercle("cercle1", 10);

        // Il est possible de définir un arbre de Forme
        Arbre<Forme> filsG = new Arbre<>(rectangle1);
        Arbre<Forme> filsD = new Arbre<>(rectangle2);

        Arbre<Forme> racine = new Arbre<>(cercle1,filsG,filsD);
        System.out.println(racine);


        //-------------------------------------------------------------------------
        // Avec la nouvelle déclaration de généricité dans Arbre (Arbre<T extends Comparable<? super T>>), il est possible désormais de
        // construire des arbres de Rectangle et des arbre de Cercle
        // ------------------------------------------------------------------------

         Rectangle rectangle = new Rectangle("rectangle", 10, 50);
         Arbre<Rectangle> arbreRectangle = new Arbre<Rectangle>(rectangle);
         System.out.println(arbreRectangle);

        
         Cercle cercle = new Cercle("cercle", 10);
         Arbre<Cercle> arbreCercle = new Arbre<>(cercle);
         System.out.println(arbreCercle);

    }
}
