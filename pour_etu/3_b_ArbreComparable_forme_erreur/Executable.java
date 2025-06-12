public class Executable {
    public static void main(String[] args) {


        
        Forme rectangle1 = new Rectangle("rect1", 10, 50);
        Forme rectangle2 = new Rectangle("rect2", 20, 50);
        Forme cercle = new Cercle("cercle1", 10);

        // Il est possible de définir un arbre de Forme
        Arbre<Forme> filsG = new Arbre<>(rectangle1);
        Arbre<Forme> filsD = new Arbre<>(rectangle2);

        Arbre<Forme> racine = new Arbre<>(cercle,filsG,filsD);
        System.out.println(racine);


//-------------------------------------------------------------------------


        // NE FONCTIONNE PAS, Il n'est pas possible de construire un arbre avec uniquement des Rectangle ou uniquement des Cercle
        // a cause de la déclaration de la générité <T extends Comparable<T>>
        //
        // Bound mismatch: The type Rectangle is not a valid substitute for the bounded parameter <T extends Comparable<T>> of the type Arbre<T>
        // C'est Forme qui est comparable, pas Rectangle directement
        //
        // Arbre<Rectangle> arbreRectangle = new Arbre<>(forme1);
        //
        // Arbre<Cercle> arbreCercle = new Arbre<>(forme3);

    }
}
