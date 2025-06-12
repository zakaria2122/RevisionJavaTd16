abstract public class Chaussette implements Comparable<Chaussette>{
    private int taille;
    private String couleur;
    private String composition;
    
    public Chaussette(int taille, String couleur, String composition) {
     this.taille = taille;
     this.couleur = couleur;
     this.composition = composition;
    }

    public int getTaille(){
        return this.taille;
    }
    
    public String getCouleur(){
        return this.couleur;
    }

    public String getComposition(){
       return this.composition;
    } 


    /**
     * Permet de laver et si la chaussette est en laine
     * la taille diminue de 30%
     */
    public void laver() {
    }

    @Override 
    public boolean equals(Object obj) {
        if (obj == null) {return false;}
        if (obj == this) {return true;}
        if (obj instanceof Chaussette) {
            Chaussette chaussette = (Chaussette)obj;
            return chaussette.getComposition().equals(this.getComposition())
                   && chaussette.couleur.equals(this.couleur) 
                   && chaussette.taille == this.taille;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.taille * 31 + this.couleur.hashCode() * 17 
               + this.getComposition().hashCode() * 11;
    }

    @Override
    public int compareTo(Chaussette chaussette) {
        return this.taille - chaussette.taille;
    }

    @Override
    public String toString() {
        return "Chaussette " + this.couleur + " en " +
               this.getComposition() + " de taille " + this.taille;
    }
}