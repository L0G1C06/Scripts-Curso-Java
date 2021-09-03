// Manipulando classe de objetos wrapper

public class Main {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
    }
}

// Outra forma de reproduzir o mesmo resultado anterior
class second{
    public static void main(String[] args) {
        Integer myInt1 = 5;
        Double myDouble1 = 5.99;
        Character myChar1 = 'A';
        System.out.println(myInt1.intValue());
        System.out.println(myDouble1.doubleValue());
        System.out.println(myChar1.charValue());
    }
}

// Usando o toString() para converter valores int em String
class third {
    public static void main(String[] args) {
        Integer myInt2 = 100;
        String myString = myInt2.toString();
        System.out.println(myString.length()); // Printando o tamanho da String
    }
}
