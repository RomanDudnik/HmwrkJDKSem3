package Task2_3;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
//        Number[] numArray = new Number[4];
//        numArray[0] = 1;
//        numArray[1] = 2.0f;
//        numArray[2] = 3.0;
//        numArray[3] = 12316544896456L;
//        MyList<Number> myList = new MyList<>(numArray);
//        myList.printList();
//
//        System.out.println("\n");
//
//        myList.addElement(4.0f);
//
//        Integer num = 4;
//        myList.addElement(num);
//
//        System.out.println("\n");
//        myList.printList();
//
//        System.out.println("size: " + myList.getSize());
//        System.out.println("array length: " + myList.getArrayLength());
//
//        myList.removeElement(2);
//        System.out.println("\n");
//
//        myList.printList();
//
//        System.out.println("size: " + myList.getSize());
//        System.out.println("array length: " + myList.getArrayLength());
//
//        for (Number number :
//                myList) {
//            System.out.println(number);
//        }

        /*
        1. Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
            чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
         */
        System.out.println("\n" + "HmwrkTask1: ");

        Integer[] baseArray = {32, 45, 63, 12, 51};
        MyList<Integer> myList1 = new MyList<>(baseArray);

        for (Integer element : myList1) {
            System.out.println(element);

        }

        // Пример использования явного вызова методов hasNext() и next()
        System.out.println("\n" + "Пример использования явного вызова: ");

        Iterator<Integer> iterator = myList1.iterator();
        myList1.addElement(1);
        myList1.addElement(2);
        myList1.addElement(3);
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }
}
