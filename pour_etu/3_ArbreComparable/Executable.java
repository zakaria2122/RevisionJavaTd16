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


    }
}
