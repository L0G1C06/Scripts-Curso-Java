// MÉTODOS EM JAVA

// Criando e chamando um método, passando parâmetros
public class Main {
    static void myMethod(String fname, int age) {
        System.out.println(fname +" Refsnes" + " is " + age);
    }

    /* A void palavra-chave, usada nos exemplos acima, 
    indica que o método não deve retornar um valor. 
    Se quiser que o método retorne um valor, 
    você pode usar um tipo de dados primitivo (como int, char, etc.) 
    em vez de void, 
    e utilizar a return palavra-chave dentro do método: */
    static int newMethod(int x) {
        return 5 + x;
    }

    static int sumMethod(int x, int y) {
        return x + y;
    }
     // Utilizando loop for e else
    static void checkAge (int age) {
        if (age < 18) {
            System.out.println("Acesso negado - Você é muito novo");
        }
        else {
            System.out.println("Acesso garantido - Você tem idade o suficiente");
        }
    }

    // Utilizando dois métodos de mesmo nome com funções diferentes

    static int plusMethod(int a, int b) {
        return a + b;
    }

    static double plusMethod(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
        System.out.println(newMethod(3));
        int z = sumMethod(8, 10);
        System.out.println(z);
        checkAge(20);
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.70, 9.83);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
