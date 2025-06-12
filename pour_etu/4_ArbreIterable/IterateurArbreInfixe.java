import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;


public class IterateurArbreInfixe<T extends Comparable<? super T>> implements Iterator<T>{

    private Stack<Arbre<T>> pile;

        public IterateurArbreInfixe(Arbre<T> racine) {
            this.pile = new Stack<>();
            if (racine != null) {
                this.pushLeft(racine);
            }
        }

        private void pushLeft(Arbre<T> noeud) {
            while (noeud != null) {
                pile.push(noeud);
                noeud = noeud.getFilsGauche();
            }
        }


        @Override
        public boolean hasNext() {
            return !pile.isEmpty();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Arbre<T> noeud = pile.pop();
            if (noeud.getFilsDroit() != null) {
                this.pushLeft(noeud.getFilsDroit());
            }
            return noeud.getValeur();
        }

}
