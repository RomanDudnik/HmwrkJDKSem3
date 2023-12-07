package Task1;

import java.io.DataInput;
import java.io.DataInputStream;

public class Program {
    public static void main(String[] args) {
        String t = "String";
        DataInputStream v = new DataInputStream(System.in);
        Integer k = 5;
        MegaClass<String, DataInputStream, Integer> megaClass = new MegaClass<>(t, v, k);
        megaClass.printType();

    }
}
