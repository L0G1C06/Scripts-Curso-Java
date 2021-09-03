// Tratamento de erros em Java usando try e catch

public class Main {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Alguma coisa deu errado, revise o seu código.");
        }    
    }
}

// Usando a instrução finally
class second {
    public static void main(String[] args) {
        try {
            int[] newNumbers = {1, 2, 3};
            System.out.println(newNumbers[10]);
        } catch(Exception e) {
            System.out.println("Alguma coisa deu errado, revise o seu código.");
        } finally {
            System.out.println("Fim do código!");
        }
    }
}

// Usando a intrução throw
class third {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Acesso negado para menores de 18");
        }
        else {
            System.out.println("Acesso concedido");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
