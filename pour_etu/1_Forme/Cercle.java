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

