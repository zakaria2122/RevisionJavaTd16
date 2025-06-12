package forme;

public abstract class Forme implements FormeGeometrique{
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


}
