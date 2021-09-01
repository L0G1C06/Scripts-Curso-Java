// Manipulando enum

public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}

// enum em um switch 
enum Nivel {
    BAIXO,
    MÉDIO,
    ALTO
}

class sec {
    public static void main(String[] args) {
        Nivel newVar = Nivel.MÉDIO;

        switch(newVar) {
            case BAIXO:
            System.out.println("Nível Baixo");
            break;
            case MÉDIO:
            System.out.println("Nível Médio");
            break;
            case ALTO:
            System.out.println("Nível Alto");
            break;
        }

        // enum dentro de um loop
        for (Nivel Var : Nivel.values()) {
            System.out.println(Var);
        }
    }
}
