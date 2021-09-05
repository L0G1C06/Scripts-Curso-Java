// Adicionar dois números com entrada de usuário

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in); // Cria um objeto Scanner
        System.out.println("Escreva um número: ");
        x = myObj.nextInt();

        System.out.println("Escreva outro número: ");
        y = myObj.nextInt();

        sum = x + y;
        System.out.println("A soma é: " + sum);
    }
}
