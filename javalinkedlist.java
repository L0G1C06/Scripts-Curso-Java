// Manipulando JavaLinkedList

import java.util.LinkedList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}

// Manipulando HashMap
class hash {
    public static void main(String[] arg) {
        // Criando um objeto do HashMap chamado capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Adicionando chave e valor (País e Cidade)
        capitalCities.put("England ", " London");
        capitalCities.put("Germany ", " Berlin");
        capitalCities.put("Norway ", " Oslo");
        capitalCities.put("USA ", " Washington DC");
        //System.out.println(capitalCities);

        // Acessando um item no HashMap
        System.out.println(capitalCities.get("England "));

        // Removendo um item no HashMap
        System.out.println(capitalCities.remove("England "));

        // Tamanho do HashMap
        System.out.println(capitalCities.size());

        // Loop através de um HashMap
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
    }
}

//  Criando um HashMap com outro tipo 
class other {
    public static void main(String[] args) {

        // Criar um objeto HashMap chamado people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Adicionar chave e valor (Nome e idade)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("name: " + i + " age: " + people.get(i));
        }
    }
}
