import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class BibChaussettes {
    /**
     * permet de savoir si une chaussette est orpheline (true) 
     * ou pas
     * @param cetteChaussette une chaussette 
     * @param chaussettes une liste de chaussettes
     * @return boolean
     */
    private BibChaussettes(){

    }
    public   static  boolean estOrpheline(  List<Chaussette> Chaussettes, Chaussette chaussette                   ) {
    

        return Chaussettes.contains(chaussette);

    }

    /**
     * permet de trier les chaussettes par taille
     * @param chaussettes la liste de chaussettes
     * @return la liste triée par taille
     */
    public   static    trierParTaille(  List<Chaussette> Chaussettes ) {

        List<Chaussette> copie = new ArrayList<>(Chaussettes);
        Collections.sort(copie);

        return copie;
    }

    /**
     * permet de trier les chaussettes par couleur
     * @param chaussettes liste de chaussettes
     * @return la liste triée par couleur
     */
    public                     trierParCouleur(                         ) {
    
    }

    public                       apparierPaire(                               )
                                                              {
        





                                                                
    }
}    
