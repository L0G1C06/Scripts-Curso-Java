// Manipulando expressões regulares 

// Descubrindo se há a ocorrência de palavra "w3schools" em uma frase

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /* CASE_INSENSITIVE = sinalizador que significa a insensibilidade
        a palavras em maiúsculas e minúsculas */
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
