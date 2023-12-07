package HmwrkTask3;

/*
3. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
но должны иметь одинаковую длину и содержать элементы одного типа. ______________________
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений пары, а также переопределение метода
toString(), возвращающее строковое представление пары.
 */
public class Main {
    public static void main(String[] args) {
        // Проверка compareArrays()
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        Integer[] array3 = {1, 2, 4};
        String[] array4 = {"one", "two", "three"};
        System.out.println(Arrays.compareArrays(array1, array2)); // true
        System.out.println(Arrays.compareArrays(array1, array3)); // false
        System.out.println(Arrays.compareArrays(array1, array4)); // false

        // Проверка класса Pair
        Pair<String, Integer> pair1 = new Pair<>("one", 1);
        Pair<String, Integer> pair2 = new Pair<>("two", 2);
        System.out.println(pair1.getFirst()); //  "one"
        System.out.println(pair1.getSecond()); //  1
        System.out.println(pair1.toString()); // "Pair{first=one, second=1}"
        System.out.println(pair2.toString()); // "Pair{first=two, second=2}"
    }
}


