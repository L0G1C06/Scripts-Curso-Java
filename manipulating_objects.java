// Manipulando objetos em classes
/* Se não quiser substituir os valores existentes, 
declare o atributo como final */

public class obj {
    int x;
    public void fullThrottle() {
        System.out.println("O carro está indo o mais rápido possível");
    }
    public void speed(int maxSpeed) {
        System.out.println("Velocidade máxima é: " + maxSpeed);
    }


    // Criando dois objetos (Myobj1, Myobj2)
    public static void main(String[] args) {
        obj Myobj1 = new obj();
        obj Myobj2 = new obj();
        System.out.println(Myobj1.x);
        System.out.println(Myobj2.x);
    }
}

/* Criando outra classe para imprimir o valor da classe obj
É necessário, para se fazer isso, criar a classe fora da classe obj */
class Second {
    public static void main(String[] args) {
        obj Myobj3 = new obj();
        System.out.println(Myobj3.x);
    }
}

// Atribuindo um valor a um atributo da classe obj 
class value {
    public static void main(String[] args) {
        obj Myobj4 = new obj();
        Myobj4.x = 40;
        System.out.println(Myobj4.x);
    }
}

class modify {
    public static void main(String[] args) {
        obj Myobj5 = new obj();
        Myobj5.x = 30;
        System.out.println(Myobj5.x);
    }
}

// Usando apenas um dos objetos para modificar o valor de x (Myobj7)
class simple_modify {
    public static void main(String[] args) {
        obj Myobj6 = new obj();
        obj Myobj7 = new obj();
        Myobj7.x = 25;
        System.out.println(Myobj6.x);
        System.out.println(Myobj7.x);
    }
}

// Métodos de acesso com um objeto (diferença entre static e public)
class checking_the_speed {
    public static void main(String[] args) {
        obj myCar = new obj();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}

// exemplo de modificador de acesso (private)
class defender {
    private String name = "John";
    private String lstname = "Doe";
    private String email = "john@doe.com";
    private int age = 24;

    public static void main(String[] args) {
        defender defObj = new defender();
        System.out.println("Nome: " + defObj.name + " " + defObj.lstname);
        System.out.println("Email: " + defObj.email);
        System.out.println("Age: " + defObj.age);
    }
}

//  exmplo de modificadores sem acesso (abstract)
// Criando a classe abstrata
abstract class nosec {
    public String fname = "Eduardo";
    public String lname = "Maldaner";
    public String mail = "eduwmaldaner@gmail.com";
    public int idade = 17;
    public abstract void study();
}
// Criando a subclasse (pertencente a classe nosec)
class dev extends nosec {
    public int startsYear = 2020;
    public void study() {
        System.out.println("Estudando a pouco tempo");
    }
}
// Classe para printar as informações
class print {
    public static void main(String[] args) {
        dev obj = new dev();
        
        System.out.println("Name: " + obj.fname + " " + obj.lname);
        System.out.println("Email: " + obj.mail);
        System.out.println("Age: " + obj.idade);
        System.out.println("Ano que comecei a estudar programação: " + obj.startsYear);
        obj.study();
    }
}
