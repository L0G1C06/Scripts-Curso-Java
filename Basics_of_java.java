// Aqui estarão os scripts do curso de Java ("https://www.w3schools.com/java/default.asp")

// JAVA PRIMEIROS PASSOS
public class App {    // É necessário colocar App, pois estamos em App.java
    public static void main(String[] args) {
        //int meuint = 10;
        
        //float meufloat = 5.5f;
        
        //char meucaracter = 'D';
        
        //boolean meubool = true;
        
        //String meutexto = "Hello";
        
        //System.out.println(meuint);
        
        //System.out.println(meufloat);
        
        //System.out.println(meucaracter);
        
        //System.out.println(meubool);
        
        //System.out.println(meutexto);

        /* Para combinar texto
        usar o + caracter*/
        
        //String name = "John";
        //System.out.println("Hello" + name);

        /* Tmbém é possível usar o + caracter para adicionar uma variável
        a outra variável*/
        
        String firstName = "Eduardo ";
        String lastName = "Weber";
        String fullName = firstName + lastName;
        System.out.println("Eu me chamo " + fullName);

        /* Para declarar mais de uma variável do mesmo tipo,
        use uma lista separada por vírgulas*/
        
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        /* Todas as variáveis devem ser identificadas 
        com nomes exclusivos 
        esses nomes exclusivos são chamados de identificadores 
        Observação: é recomendável usar nomes descritivos para criar um código 
        compreensível e sustentável */

        //Byte
        byte myNum = 100;
        System.out.println(myNum);

        // Short
        short myNum1 = 5000;
        System.out.println(myNum1);

        // Int
        int myNum2 = 100000;
        System.out.println(myNum2);

        // Long
        long myNum3 = 15000000000L;
        System.out.println(myNum3);

        // Float
        float myNum4 = 5.75f;
        System.out.println(myNum4);

        // Double
        double myNum5 = 19.99d;
        System.out.println(myNum5);

        // Scientific Numbers
        float f1 = 5.75f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        // Booleans
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        // Characters
        char myGrade = 'B';
        System.out.println(myGrade);

        char a = 65, b = 70, c = 75;
        System.out.println(a + b + c / 3);

        // String
        String greeting = "Hello World";
        System.out.println(greeting);

        
        double Mydouble = 9.78d;
        float Myfloat = (float) Mydouble;
        System.out.println(Mydouble);
        System.out.println(Myfloat);

        // Ampliando o Casting
        
        //int MyInt = 9;
        //double MyDouble = MyInt; // Casting automático

        double MyDouble = 9.78d; 
        int MyInt = (int) MyDouble; // Casting manua: double para int

        System.out.println(MyInt); 
        System.out.println(MyDouble); 

        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;

        System.out.println(sum3);

        int f = 10;
        f += 5;

        System.out.println(f); // output = 15

        int g = 10;
        ++g;

        System.out.println(g);// Adiciona 1 e resulta 11

        // Comprimento de strings
        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("O comprimento do texto é: " + text.length());

        // Uppercase e Lowercase
        String txt = "Hello World";
        System.out.println(txt.toUpperCase()); // outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase()); // outputs "hello world"

        /* O indexOf() método retorna o índice (a posição) da primeira ocorrência de um texto
        especificado em uma string (incluindo espaços em branco) */
        String texto = "Please locate where 'locate' occurs!";
        System.out.println(texto.indexOf("locate"));  // Outputs 7

        // Concatenação de Strings
        String FirstName = "Igor";
        String LastName = "3K";
        System.out.println(FirstName + " " + LastName);

        // Outra forma de concatenação
        String firstname = "Igor";
        String lastname = "3K";
        System.out.println(firstname.concat(lastname));

        // Caracteres especiais
        String texto1 = "We are so-called \"Vikings\" from the north ";
        System.out.println(texto1);

        // Math.max(X, Y) --> usado para encontrar o maior valor entre X e Y
        System.out.println(Math.max(5, 10));

        // Math.min(X, Y) --> usado para encontrar o menor valor entre X e Y
        System.out.println(Math.min(5, 10));

        // Math.sqrt(X) --> usado para encontrar a raíz de X
        System.out.println(Math.sqrt(64));

        /* Math.abs(X) --> usado para retornar o valor 
        absoluto (positivo) de X */
        System.out.println(Math.abs(-4.7));

        // Math.random() --> usado para retornar um valor aleatório
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);

        // Expressão booleana
        int ç = 10;
        int r = 9;
        System.out.println(r > ç);

        // Outra forma booleana
        System.out.println(10 > 9);

        int d = 10;
        System.out.println(d == 10); /* retorna true, 
                                        porque o valor de d é igual a 10 */
        
        System.out.println(10 == 15);

        // Condicional if
        if (20 > 18) {
            System.out.println("20 é maior que 18");
        }

        int q = 20;
        int l = 18;
        if (q > l) {
            System.out.println("q é maior que l");
        }

        // Condicional else
        int time = 20;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        
        int tempo = 20;
        if (tempo < 18) {
            System.out.println("Bom dia.");
        } else {
            System.out.println("Boa tarde.");
        }

        int t = 20;
        String result = (t < 18) ? "Bom dia." : "Boa tarde.";
        System.out.println(result);

        int day = 7;
        switch (day) {
            case 1:
            System.out.println("Segunda");
            break;
            case 2:
            System.out.println("Terça");
            break;
            case 3:
            System.out.println("Quarta");
            break;
            case 4:
            System.out.println("Quinta");
            break;
            case 5:
            System.out.println("Sexta");
            break;
            case 6:
            System.out.println("Sábado");
            break;
            case 7:
            System.out.println("Domingo");
            break;
        }

        int dia = 4;
        switch (dia) {
            case 6:
            System.out.println("Hoje é Sábado");
            break;
            case 7:
            System.out.println("Hoje é Domingo");
            break;
            default:
            System.out.println("Esperando ansiosamente para o fim de semana");
        }

        // Java loop While
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++; // é necessário colocar isso senão vai ficar em loop infinito
        }

        int m = 0;
        do {
            System.out.println(m);
            m++;
        }
        while (m < 5);

        // Java loop For
        for (int h = 0; h < 5; h++) {
            System.out.println(h);
        }

        for (int count = 0; count <= 10; count = count + 2) {
            System.out.println(count);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String k : cars) {
            System.out.println(k);
        }

        // Java break
        for (int p = 0; p < 10; p++) {
            if (p == 4) {
                break;
            }
            System.out.println(p);
        }

        // Java continue
        for (int o = 0; o < 10; o++) {
            if ( o == 4) {
                continue;
            }
            System.out.println(o);
        }  
        
        // Break e continue em while
        int u = 0;
        while (u < 10) {
            System.out.println(u);
            u++;
            if (u == 4) {
                break;
            }
        }

        // Arrays em Java
        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(carros[0]);

        // Alterar um elemento em Array
        carros[0] = "Opel";
        System.out.println(carros[0]);

        // Comprimento do Array
        System.out.println(carros.length);

        // Loop por meio de uma matriz
        for (int car = 0; car < carros.length; car++) {
            System.out.println(carros[car]);
        }

        // Loop em um array com For-Each
        for (String v : carros) {
            System.out.println(v);
        }

        // Matrizes multidimensionais
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int s = myNumbers[1][2];
        System.out.println(s);

        
    }   
}
