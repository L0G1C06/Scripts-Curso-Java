// Manipulando polimorfismos

class Animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Dog extends Animal {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }
  
  class Main {
    public static void main(String[] args) {
      Animal myAnimal = new Animal();
      Animal myPig = new Pig();
      Animal myDog = new Dog();
          
      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();
    }
  }

// Aninhando classes

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

class Print {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}

// Classe interna estática 
class inter {
    int b = 10;

    static class second {
        int c = 5;
    }
}

class third {
    public static void main(String[] args) {
        inter.second myInter = new inter.second();
        System.out.println(myInter.c); /* Resultou apenas c, 
        por estar estática*/
    }
}

abstract class animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}

class Gato extends animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("O gato faz: miau");
  }
}

class fifth {
  public static void main(String[] args) {
    Gato meuGato = new Gato();
    meuGato.animalSound();
    meuGato.sleep();
  }
}

// Manipulando interfaces
/* Interfaces são outro tipo de abstração, onde passamos uma interface 
classe abstrata usada para agrupar métodos relacionados com corpos vazios*/

interface car {
  public void carSound();
  public void horn();
}

class aircross implements car {
  public void carSound() {
    System.out.println("Vruum");
  }
  public void horn() {
    System.out.println("Biiii");
  }
}

class action {
  public static void main(String[] args) {
    aircross myCar = new aircross();
    myCar.carSound();
    myCar.horn();
  }
}
