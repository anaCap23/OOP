package dataStructure;


import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class TreeSet<E> implements Set<E> {

    private TreeNode<E> root;
    private int size;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {

        TreeNode<E> iter = root;

        Comparable<E> forCompare = (Comparable<E>) e;

        while (iter != null) {
            int compareRes = forCompare.compareTo(iter.val);
            if (compareRes < 0) {

                if (iter.left == null) {
                    iter.left = new TreeNode<E>(e, null, null, null);
                    size++;
                    return true;
                }
                iter = iter.left;
            } else if (compareRes > 0) {

                if (iter.right == null) {
                    iter.right = new TreeNode<E>(e, null, null, null);
                    size++;
                    return true;
                }
                iter = iter.right;

            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        root = null;
    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

    private void balanceRight() {
        TreeNode oldRoot = root;
        if (root.right != null) {
            root = root.right;
        }
        oldRoot.right = root.left;
        root.left = oldRoot;
    }

    private void balanceLeft() {
        TreeNode oldRoot = root;
        if (root.right != null) {
            root = root.left;
        }
    }
}

class TreeNode<T> {

    T val;
    TreeNode<T> parent;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T val, TreeNode<T> parent, TreeNode<T> left, TreeNode<T> right) {
        this.val = val;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }
}
