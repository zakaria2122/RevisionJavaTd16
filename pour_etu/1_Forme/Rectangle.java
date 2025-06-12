public class Rectangle extends Forme {

    private int hauteur;
    private int largeur;

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int longueur) {
        this.hauteur = longueur;
    }


    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public Rectangle(String nom, int longueur, int largeur) {
        super(nom);
        this.hauteur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double aire() {
        return hauteur * largeur;
    }

    @Override
    public String toString() {
        return super.toString() + ", longueur : " + hauteur + ", largeur : " + largeur;
    }

    @Override
    public double perimetre() {
        return 2 * (hauteur + largeur);
    }

    @Override
    public int hashCode(){
        return super.hashCode()+this.hauteur*31+this.largeur*37;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (o == null)
            return false;
        if ( ! (o instanceof Rectangle))
            return false;
        Rectangle rectangle = (Rectangle)o;

        return super.equals(o) && this.hauteur == rectangle.hauteur && this.largeur == rectangle.largeur;



    }


    
}
