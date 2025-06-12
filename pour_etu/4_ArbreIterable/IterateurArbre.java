import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class IterateurArbre<T extends Comparable<? super T>> implements Iterator<T>{

    private Stack<Arbre<T>> pile;

        public IterateurArbre(Arbre<T> racine) {
            this.pile = new Stack<>();
            if (racine != null) {
                pile.push(racine);
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
                pile.push(noeud.getFilsDroit());
            }

            if (noeud.getFilsGauche() != null) {
                pile.push(noeud.getFilsGauche());
            }

            return noeud.getValeur();
        }

}
