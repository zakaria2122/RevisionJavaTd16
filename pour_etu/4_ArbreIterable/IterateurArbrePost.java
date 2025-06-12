import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;


public class IterateurArbrePost<T extends Comparable<? super T>> implements Iterator<T>{

   private Stack<Arbre<T>> stack;
    private Stack<Arbre<T>> outputStack;

    public IterateurArbrePost(Arbre<T> root) {
        stack = new Stack<>();
        outputStack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            Arbre<T> node = stack.pop();
            outputStack.push(node);
            if (node.getFilsGauche() != null) {
                stack.push(node.getFilsGauche());
            }
            if (node.getFilsDroit() != null) {
                stack.push(node.getFilsDroit());
            }
        }
    }

    @Override
    public boolean hasNext() {
        return !outputStack.isEmpty();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return outputStack.pop().getValeur();
    }

}
