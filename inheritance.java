/* Manipulando herança (superclasse e subclasse) em Java*/

/* No exemplo abaixo, a Car classe (subclasse) herda os atributos e métodos
de heranc classe (superclasse): */

public class heranc {
    protected String brand = "Ford";  // Atributo de heranc
    public void honk() {              // Método de heranc
        System.out.println("Tuut, tuut!");
    }    
}

class Car extends heranc {
    private String modelName = "Mustang"; // Atributo de Car
    public static void main(String[] args) {

        // Criando o objeto myCar
        Car myCar = new Car();

        // Chamando honk() método (da classe heranc) no objeto myCar
        myCar.honk();

        /* Exibindo o valor do atributo da marca (da classe heranc) e o valor 
        de modelName da classe Car */
        System.out.println(myCar.brand + " " + myCar.modelName); 
    }
}
