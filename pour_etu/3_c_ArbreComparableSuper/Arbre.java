/**
 * Nouvelle déclaration de généricité
 * Le type générique T foit être comparable avec lui même ou ses ancetres
 * et non plus uniquement avec lui-meme
 * 
 */

public class Arbre<T extends Comparable<? super T>> {

    private T valeur;
    private Arbre<T> filsGauche;
    private Arbre<T> filsDroit;

    public Arbre(T valeur, Arbre<T> filsGauche, Arbre<T> filsDroit) {
        this.valeur = valeur;
        this.filsGauche = filsGauche;
        this.filsDroit = filsDroit;
    }

    public Arbre(T valeur) {
        this.valeur = valeur;
        this.filsGauche = null;
        this.filsDroit = null;
    }

    public T getValeur() {
        return valeur;
    }

    public void setValeur(T valeur) {
        this.valeur = valeur;
    }

    public Arbre<T> getFilsGauche() {
        return filsGauche;
    }

    public void setFilsGauche(Arbre<T> filsGauche) {
        this.filsGauche = filsGauche;
    }

    public Arbre<T> getFilsDroit() {
        return filsDroit;
    }

    public void setFilsDroit(Arbre<T> filsDroit) {
        this.filsDroit = filsDroit;
    }

    @Override
    public String toString(){
        String resultat = "";
        resultat +="[ "+valeur+"\n";
        resultat+=(filsGauche != null ? "|-"+filsGauche.toString() : "");
        resultat+=(filsDroit != null ? "|-"+filsDroit.toString() : "");
        resultat +="]\n";
        return resultat;

    }

    // Méthode pour ajouter un noeud à l'arbre
    public void ajouter(T valeur) {
        if (valeur == null) {
            return;
        }

        int comparaison = valeur.compareTo((T) getValeur());

        if (comparaison < 0) {
            if (filsGauche == null) {
                filsGauche = new Arbre<>(valeur);
            } else {
                filsGauche.ajouter(valeur);
            }
        } else {
            if (filsDroit == null) {
                filsDroit = new Arbre<>(valeur);
            } else {
                filsDroit.ajouter(valeur);
            }
        }
    }

    // Méthode pour rechercher un noeud dans l'arbre
    public boolean rechercher(T valeur) {
        if (valeur == null) {
            return false;
        }

        int comparaison = valeur.compareTo(this.getValeur());

        if (comparaison == 0) {
            return true;
        } else if (comparaison < 0) {
            if (filsGauche == null) {
                return false;
            } else {
                return filsGauche.rechercher(valeur);
            }
        } else {
            if (filsDroit == null) {
                return false;
            } else {
                return filsDroit.rechercher(valeur);
            }
        }
    }

 
}