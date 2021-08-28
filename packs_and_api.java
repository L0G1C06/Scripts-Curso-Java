// Manipulando pacotes e API Java

// Importando a classe Scanner
import java.util.Scanner;

public class packs {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}

// Criando o meu próprio pacote
package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}
