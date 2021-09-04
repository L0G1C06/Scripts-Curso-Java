// Manipulando Java threads

public class Main extends Thread {
    public static int amount = 0;
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();

        /* Prevenindo problemas de simultaneidade, 
        esperando uma thread terminar para começar outra */
        while(thread.isAlive()) {
            System.out.println("Esperando...");
        }
        // Atualizando o amount e printando seu valor
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);

        // Printando as threads (os processos que estão dentro e fora da thread)
        System.out.println("Este código está fora de uma thread");
    }
    public void run() {
        System.out.println("Este código está rodando em thread");
        amount++;
    }
}
