public class Executable {
    public static void main(String[] args) {
        
        // Polymorphisme et dyanmic dispatch
        Forme formeC = new Cercle("cercle",10) ;
        Forme formeR = new Rectangle("rectangle",10,30);

        ///Quel méthode toString est appelée ?

        // celle de Cercle
        System.out.println(formeC.toString());

        //Celle de Rectangle
        System.out.println(formeR.toString());

        //Celle de Rectangle
        System.out.println(((Forme)formeR).toString());

        // Compilation ?  Execution ?

        //1 Ne compile pas, getRayon n'est pas définie dans Forme
        // System.out.println(formeC.getRayon());

        //2 OK
        FormeGeometrique forme2 = new Rectangle("rectangle", 10, 5);

        //3 OK
        System.out.println(forme2.perimetre());

        //4 OK
        System.out.println(forme2.aire());

        //5 Compile pas, getNom pas définie dans FormeGeometrique 
        // System.out.println(forme2.getNom());

        //6 idem
        // System.out.println(forme2.getLargeur());

        //7 OK
        System.out.println(((Forme)forme2).getNom());

        //8 OK
        System.out.println(((Rectangle)forme2).getLargeur());

        //9 Compile, mais echec à l'exécution
        // System.out.println(((Cercle)forme2).getRayon());

        System.out.println(formeC.equals(formeC));
        System.out.println(formeC.equals(formeR));
        Forme formeC2 = new Cercle("cercle",10) ;
        System.out.println(formeC.equals(formeC2));
        System.out.println(formeC2.equals(formeC));

        System.out.println(formeC.hashCode()==formeC2.hashCode());
    }
}
