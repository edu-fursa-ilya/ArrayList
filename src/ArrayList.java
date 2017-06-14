import java.util.Arrays;

public class ArrayList<T> {
    private int size = 0;
    private static final int DEFAULT_SIZE_OF_LIST = 10;
    private Object objects[];

    public ArrayList() {
        objects = new Object[DEFAULT_SIZE_OF_LIST];
    }

    void add(T t) {
        if (size == objects.length) {
            increaseSizeOfList();
        }

        objects[size++] = t;
    }

    private void increaseSizeOfList() {
        int newSize = objects.length * 2;
        objects = Arrays.copyOf(objects, newSize);
    }

    public T get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index out of Bounds Exception!");
        }

        return (T) objects[i];
    }

    public void print() {
        for (int i = 0; i < objects.length; i++) {
            if(objects[i]!=null) {
                System.out.print(objects[i] + ", ");
            }
        }
    }

    public int getSize() {
        return objects.length;
    }

    public T getItemAt(int position) {
        return (T) objects[position];
    }

    public T remove(int position) {
        if(position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Index out of Bounds Exception!");
        }

        Object itemToRemove = objects[position];
        for (int i = 0; i < objects.length - 1; i++) {
            objects[i] = objects[i + 1];
        }

        size--;
        return (T) itemToRemove;
    }
}
