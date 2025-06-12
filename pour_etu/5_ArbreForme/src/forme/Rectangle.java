package forme;

public class Rectangle extends Forme {

    private int hauteur;
    private int largeur;

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }



    public Rectangle(String nom, int hauteur, int largeur) {
        super(nom);
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    @Override
    public double aire() {
        return hauteur * largeur;
    }

    @Override
    public String toString() {
        return super.toString() + ", hauteur : " + hauteur + ", largeur : " + largeur;
    }


    @Override
    public double perimetre() {
        return 2 * (hauteur + largeur);
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    @Override
    public char[][] getGrille() {
        char[][] rectangle = new char[largeur][hauteur];

        // Remplissage du rectangle avec des espaces
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                rectangle[j][i] = '*';
            }
        }

        return rectangle;

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
