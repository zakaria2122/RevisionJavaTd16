public class Executable {
    public static void main(String[] args) {

        Arbre<Integer> filsG = new Arbre<Integer>(2);
        Arbre<Integer> filsD = new Arbre<Integer>(10);

        Arbre<Integer> racine = new Arbre<Integer>(5,filsG,filsD);
        System.out.println(racine);

        Arbre<String> filsGS = new Arbre<>("gauche");
        Arbre<String> filsDS = new Arbre<>("droit");

        Arbre<String> racineS = new Arbre<>("racine",filsGS,filsDS);
        System.out.println(racineS);

//-------------------------------------------------------------------------

        //Compilation ? Execution ?

        //1 Non, probleme de type
        //Arbre<Integer> arbre1 = new Arbre<String>("arbre1");
        
        //2 Non, probleme de type "cannot infer type"
        //Arbre<Integer> arbre2 = new Arbre<>("arbre1");

        //3 Non, probleme de type "cannot infer type"
        //Arbre<Integer> arbre3 = new Arbre<>(4,filsG,filsDS);
        
        //4 Non, constructeur Int, arbre<int> arbre<String> non definie
        //Arbre<Integer> arbre4 = new Arbre<Integer>(4,filsG,filsDS);

        //5 Non, Déclaration impossible
        //Arbre<> arbre5 = new Arbre<Integer>(3);

 


    }
}
