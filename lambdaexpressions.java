// Manipulando expressões Lambda 

// Sintaxe: parameter -> expression

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );
    }
}

// Armazenando expressões lambda em variáveis

class second {
    public static void main(String[] args) {
        ArrayList<Integer> newnumbers = new ArrayList<Integer>();
        newnumbers.add(5);
        newnumbers.add(7);
        newnumbers.add(3);
        newnumbers.add(4);
        Consumer<Integer> method = (a) -> { System.out.println(a); };
        newnumbers.forEach(method);
    }
}

// Usando uma expressão lambda em um método
interface StringFunction {
    String run(String str);
  }

class third {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
