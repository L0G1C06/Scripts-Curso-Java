// Manipulando HashSet
import java.util.HashSet;


public class Main {
   public static void main(String[] args) {
       HashSet<String> cars = new HashSet<String>();
       cars.add("Volvo");
       cars.add("BMW");
       cars.add("Ford");
       cars.add("BMW");
       cars.add("Mazda");
       System.out.println(cars);  /* Mesmo BMW aparecendo duas vezes,
                                     por conta do HashSet ele vai aparecer
                                     apenas uma vez */
       System.out.println(cars.contains("Mazda")); // Checa se existe no conjunto
       System.out.println(cars.remove("Volvo")); // Remove do conjunto
       cars.size();  // Printando o tamanho conjunto
       for (String i : cars) {
           System.out.println(i);  // HashSet em um loop for-each
       }
       
       cars.clear(); // Removendo todos objetos do conjunto
   } 
}

class second {
    public static void main(String[] args) {

        // Cria um HashSet objeto chamado numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Adiciona valores ao conjunto
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Mostra se existe algum número do conjunto entre 1 e 10
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " foi encontrado no conjunto");
            } else {
                System.out.println(i + " não foi encontrado no conjunto");
            }
        }
    }
}
