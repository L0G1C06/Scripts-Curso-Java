import java.util.ArrayList;
import java.util.Collections;

// Manipulando ArrayList

public class arr {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));  // Acessando um item da ArrayList()
        System.out.println(cars.set(0, "Opel"));  // Mudando um item
        System.out.println(cars.remove(2));  // Removendo um item
        cars.clear();  // Removendo toda a lista
        System.out.println(cars);
        System.out.println(cars.size());  // Descobrindo tamanho da ArrayList
    }
}

// Loop por meio de um array
class loop {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Ferrari");
        carros.add("Citroên");
        carros.add("Mustang");
        carros.add("Fusca");
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
    }
}

// Criando um array com outros objetos (int)
class other {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}

// Classificando uma ArrayList
class classifying {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<String>();
        subjects.add("Matemática");
        subjects.add("Física");
        subjects.add("Química");

        Collections.sort(subjects);  // Classificando subjects
        for (String i : subjects) {
            System.out.println(i);
        }
    }
}
