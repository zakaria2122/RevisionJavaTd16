public abstract class Forme implements FormeGeometrique, Comparable<Forme>{
    private String nom;

    public Forme(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Forme : " + nom;
    }

    @Override
    public int hashCode(){
        return this.nom.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (o == null)
             return false;
        if ( ! (o instanceof Forme))
            return false;
        Forme forme = (Forme)o;

        return forme.nom.equals(this.nom);
    }

    @Override
    public int compareTo(Forme forme){
        return Double.compare(this.aire(), forme.aire());
    }


}
