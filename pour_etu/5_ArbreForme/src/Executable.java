import forme.Cercle;
import forme.Rectangle;
import elements.Element;
import elements.Panneau;
/**

En etant à la racine :
javac -sourcepath src -d bin src/Executable.java
java -cp bin/ Executable

Creation d'un jar :
jar cvfe Arbre.jar Executable -C ./bin/ .

-c : creation d'un fichier jar
-f : la sortie va dans un fichier (plutot que sur stdout)
-v : verbose (optionnel)
-e : on spécifie le point d'entree de notre programme

Arbre.jar : nom du jar à créer
Executable : classe jouant le role de pont d'entrée

-C ./bin . : on ajoute le contenu de bin dans le jar

Execution

java -jar Arbre.jar

 **/
public class Executable {
    public static void main(String ... args) {
        

        Cercle cercle = new Cercle("cercle", 4);
        Element elem = new Element(10, 10, cercle);
        Panneau panneau = new Panneau(100,100,new Element(20,80,cercle ));
        panneau.ajouter(new Element(80,80,cercle ));
        panneau.ajouter(new Element(50,20, new Rectangle("rec", 8,28)));
        panneau.ajouter(new Element(50,50, new Rectangle("rec", 10,10)));
        panneau.ajouter(elem,elem,elem,elem,elem,elem,elem,elem,elem,elem,elem,elem);
        System.out.println(panneau);
        panneau.affiche();
    }
}
