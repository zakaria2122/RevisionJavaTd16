
package elements;

import forme.Forme;

public class Element implements Comparable<Element>{
    int x;
    int y;
    Forme forme;
    public Element(int x, int y, Forme forme) {
        this.x = x;
        this.y = y;
        this.forme = forme;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Forme getForme() {
        return forme;
    }
    public void setForme(Forme forme) {
        this.forme = forme;
    }
    @Override
    public int compareTo(Element o) {
       if (this.x == o.x)
        return this.y - o.y;
        else    
            return this.x -o.x;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (o == null)
            return false;
        if ( ! (o instanceof Element))
            return false;
        Element element = (Element)o;

        return element.x == this.x && element.y == this.y && element.forme.equals(this.forme);

    }

    @Override
    public int hashCode(){
        return this.x*31 + this.y*37 + this.forme.hashCode()*41;
    }

    @Override
    public String toString(){
        return "X : "+this.x+", Y : "+this.y+" "+this.getForme().toString();
    }

    public void affiche(char[][] grille){
        
        char[][] grilleForme = forme.getGrille();
        int hauteurForme = grilleForme.length;
        int largeurForme   = grilleForme[0].length;

        int hauteurGrille = grille.length;
        int largeurGrille = grille[0].length;

        int debutx = x-(hauteurForme/2);
        int debuty = y-(largeurForme/2);

        for (int i=0;i<hauteurForme;i++){
            for (int j=0;j<largeurForme;j++){
                //System.out.println(i+" "+j);
                int posx = debutx+i;
                int posy = debuty+j;
                if (posx>=0 && posx <hauteurGrille && posy >=0 && posy< largeurGrille)
                    grille[posx][posy] = grilleForme[i][j];

            }
                
        }


    }

}
