package forme;

public class Cercle extends Forme {

    private int rayon;

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    public Cercle(String nom, int rayon) {
        super(nom);
        this.rayon = rayon;
    }

    @Override
    public double aire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
 

    @Override
    public String toString() {
        return super.toString() + ", rayon : " + rayon;
    }

    @Override
    public char[][] getGrille() {

        char[][] cercle = new char[2 * rayon + 1][2 * rayon + 1];

        // Remplissage du cercle avec des espaces
        for (int i = 0; i < 2 * rayon + 1; i++) {
            for (int j = 0; j < 2 * rayon + 1; j++) {
                cercle[i][j] = ' ';
            }
        }

        // Dessiner le cercle
        for (int y = -rayon; y <= rayon; y++) {
            for (int x = -rayon; x <= rayon; x++) {
                if (x * x + y * y <= rayon * rayon) {
                    cercle[y + rayon][x + rayon] = '*';
                }
            }
        }
        return cercle;
    }


    @Override
    public int hashCode(){
        return super.hashCode() + this.rayon*31;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (o == null)
            return false;
        if ( ! (o instanceof Cercle))
            return false;
        Cercle cercle = (Cercle)o;

        return super.equals(o) && this.rayon == cercle.rayon;
    }
}

