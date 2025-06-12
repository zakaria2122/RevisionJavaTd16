package arbre;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class IterateurArbreBFS<T extends Comparable<? super T>> implements Iterator<T>{

    private Queue<Arbre<T>> file;

        public IterateurArbreBFS(Arbre<T> racine) {
            this.file = new LinkedList<>();
            if (racine != null) {
                file.add(racine);
            }
        }

        @Override
        public boolean hasNext() {
            return !file.isEmpty();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Arbre<T> noeud = file.poll();


            if (noeud.getFilsGauche() != null) {
                file.add(noeud.getFilsGauche());
            }


            if (noeud.getFilsDroit() != null) {
                file.add(noeud.getFilsDroit());
            }


            return noeud.getValeur();
        }

}
