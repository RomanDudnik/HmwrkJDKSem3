package Task2_3;

import java.util.Iterator;

/*
    – Написать итератор по массиву.
  Итератор – это объект, осуществляющий движение по коллекциям любого типа,
  содержащим любые типы данных. Итераторы обычно имеют только
  два метода – проверка на наличие следующего элемента и переход к следующему элементу.
  Но также, особенно в других языках программирования, возможно встретить итераторы,
  реализующие дополнительную логику.
 */
/*
   1. Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
   чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
*/
public class MyListIterator<E> implements Iterator<E> {
    private final MyList<E> myList;
    private int currentIndex;

    public MyListIterator(MyList<E> myList) {
        this.myList = myList;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < myList.getSize();
    }

    @Override
    public E next() {
        return myList.get(currentIndex++);
    }

    @Override
    public void remove() {
        myList.removeElement(currentIndex - 1);
        currentIndex--;
    }
}