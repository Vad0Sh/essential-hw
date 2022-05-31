package homework9.task2;

import java.util.Arrays;
import java.util.Iterator;

public class MyList {
    private Object[] array;
    public int size;

    public MyList() {
        this.array = new Object[10];
    }

    public MyList(int capacity) {
        this.array = new Object[capacity];
    }

    public void add(Object element) {
        if(size == array.length) {
            grow();
        }

        array[size++] = element;
    }

    public int size() {
        return size;
    }

    public Object remove(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException( index + "out of bound!");
        }

        Object deleted = array[index];

        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }

        array[size--] = null;

        return deleted;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        String str = "[";

        for (int i = 0; i < size; i++) {
            str += array[i] + ", ";
        }

        str = str.substring(0, str.length() - 2);

        return str + "]";
    }

    public Iterator<Object> iterator() {
        return new MyIterator();
    }

    private void grow() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    public Object get(int i) {
        return array[i];
    }


    private class MyIterator implements Iterator<Object>  {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Object next() {
            return array[index++];
        }
    }
}

