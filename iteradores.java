// Manipulando Iteradores 

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // Fazer uma coleção
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Pegando o iterador
        Iterator<String> it = cars.iterator();

        // Printar o primeiro item
        System.out.println(it.next());
        // Printar o segundo item
        System.out.println(it.next());

        // Looping por meio de uma coleção
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class second {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
