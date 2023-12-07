package HmwrkTask2;
/*
2. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два
числа разного типа, над которыми должна быть произведена операция.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(Calculator.sum(1, 2));
        System.out.println(Calculator.multiply(2.5, 4.7));
        System.out.println(Calculator.divide(10.0f, 2.5f));
        System.out.println(Calculator.subtract(20L, 10L));

    }
}
