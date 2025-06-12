import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;

public class ExecChaussettes {
    public static void main(String [] args) {
        Set<Chaussette> ens = new HashSet<>(); 
        ens.add(new ChaussetteCoton(36, "bleue")); 
        ens.add(new ChaussetteLaine(42, "verte")); 
        System.out.println(ens);
        List<Chaussette> mesChaussettes = Arrays.asList(
            new ChaussetteLaine(42, "verte"), 
            new ChaussetteCoton(36, "bleue"), 
            new ChaussetteCoton(42, "rouge"), 
            new ChaussetteLaine(42, "verte"), 
            new ChaussetteCoton(36, "bleue"), 
            new ChaussetteSynthetique(36, "jaune"),
            new ChaussetteCoton(42, "rouge"));
        System.out.println(" Mes chaussettes ");
        System.out.println(mesChaussettes);
        List<Chaussette> tri = BibChaussettes.trierParTaille(mesChaussettes);
        tri = BibChaussettes.trierParCouleur(tri);
        System.out.println(tri); 
        System.out.println();

        List<PaireDeChaussettes> armoire; 
        try {
            armoire = BibChaussettes.apparierPaire(mesChaussettes);
            System.out.println(armoire);
        }
        catch(ChaussetteOrphelineException ex) {
            System.out.println("Une chaussette seule : " + ex.getChaussette());
        }
        
        System.out.println("Itérateur");
        PlacardMaudit maudit = new PlacardMaudit();
        for (Chaussette chaussette : mesChaussettes) {
            maudit.ajouter(chaussette);
        }
        maudit.ajouter(new ChaussetteLaine(44, "orange"));
        for (Chaussette chaussette : maudit) {
            System.out.print(" - " + chaussette);
        }
	System.out.println("Orphelines");
	System.out.println(maudit.chaussettesOrphelines());
    }
}
