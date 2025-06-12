package elements;

import arbre.Arbre;

public class Panneau {

    int hauteur;
    int largeur;

    Arbre<Element> arbre;
    char[][] grille;

    public Panneau(int hauteur, int largeur,Element e){
        this.hauteur = hauteur;
        this.largeur = largeur;
        arbre = new Arbre<Element>(e);
        grille = new char[hauteur][largeur];
        for(int i=0;i<hauteur;i++){
            grille[i] = new char[largeur];
            for(int j=0;j<largeur;j++)
                grille[i][j]=' ';
        }
    }

    /**
     * Ajoute un element au panneau. On peut noter l'utilisation des ..., pour ajouter un ou plusieurs Elements
     * @param elements
     */
    public void ajouter(Element ... elements ){
        for (Element e : elements)
            arbre.ajouter(e);
    }

    @Override
    public String toString(){
        String result="";
        for(Element e : arbre){
            result += e.toString()+"\n";
        }
        return result;
    }

    public void affiche(){
        
         for(Element e : arbre)
            e.affiche(grille);



        for (int i=hauteur-1;i>=0;i--){
            for (int j = 0; j< largeur;j++){
                System.out.print(grille[j][i]);
            }
            System.out.println();
        }
    }

}
