package Task2_3;

import java.util.Iterator;

/*
    – Описать собственную коллекцию – список на основе массива. Коллекция должна иметь
  возможность хранить любые типы данных, иметь методы добавления и удаления элементов.
 */
public class MyList<E> implements Iterable<E> {
    Object[] initialArray = {};
    private E[] array;
    private int size;

    public MyList(E[] baseArray) {
        this.array = baseArray;
        size = array.length;
    }

    public <T extends E> void addElement(T element) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[size] = element;
            array = (E[]) newArray;
        } else {
            array[size] = element;
        }
        size++;
    }

    public void printList() {
        for (E e : array) {
            System.out.println(e + "");
        }
        System.out.println();
        //array.forEach(System.out::println);
    }

    public int getSize() {
        return size;
    }

    public void removeElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size - 1] = null;
        size--;
    }

    public int getArrayLength() {
        return array.length;
    }

    class MyListIterator implements Iterator<E> {
        int index;

        public MyListIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            return array[index++];
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyListIterator();
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return array[index];
    }

    /*
    – Написать итератор по массиву.
  Итератор – это объект, осуществляющий движение по коллекциям любого типа,
  содержащим любые типы данных. Итераторы обычно имеют только
  два метода – проверка на наличие следующего элемента и переход к следующему элементу.
  Но также, особенно в других языках программирования, возможно встретить итераторы,
  реализующие дополнительную логику.
 */
//    public class MyListIterator<E> implements Iterator<E> {
//        int index;
//
//        public MyListIterator() {
//            this.index = 0;
//        }
//        @Override
//        public boolean hasNext() {
//            return index < size;
//        }
//
//        @Override
//        public E next() {
//            return array[index++];
//        }
//
//        @Override
//        public Iterator<E> iterator() {
//            return new Task2_3.MyListIterator<E>();
//        }
//    }
}







//public class MyList<E> {
//    private E[] array;
//    private int size;
//
//    public MyList() {
//        this.array = (E[]) new Object[10];
//        this.size = 0;
//    }
//
//    public void add(E element) {
//        if (size == array.length) {
//            resizeArray();
//        }
//        array[size++] = element;
//    }
//
//    public void remove(E element) {
//        int index = -1;
//        for (int i = 0; i < size; i++) {
//            if (array[i].equals(element)) {
//                index = i;
//                break;
//            }
//        }
//        if (index != -1) {
//            for (int i = index; i < size - 1; i++) {
//                array[i] = array[i + 1];
//            }
//            size--;
//        }
//    }
//
//    private void resizeArray() {
//        E[] newArray = (E[]) new Object[array.length * 2];
//        System.arraycopy(array, 0, newArray, 0, size);
//        array = newArray;
//    }
//
//    public E get(int index) {
//        if (index >= 0 && index < size) {
//            return array[index];
//        } else {
//            throw new IndexOutOfBoundsException();
//        }
//    }
//
//    public void set(int index, E element) {
//        if (index >= 0 && index < size) {
//            array[index] = element;
//        } else {
//            throw new IndexOutOfBoundsException();
//        }
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public boolean contains(E element) {
//        for (int i = 0; i < size; i++) {
//            if (array[i].equals(element)) {
//                return true;
//            }
//        }
//        return false;
//    }
//}