// Codificando e decodificando palavras e frases no padrão Base-64


import java.util.*;

//Codificando
public class Encryption {
    public static void main(String[] ak) {
        String secret = "Eduardo";
        String encrypted = Base64.getEncoder().encodeToString(secret.getBytes());

        System.out.println("Original String: " + secret);
        System.out.println("Encrypted String: " + encrypted);
    }
}

// Decodificando
class Decrypted {
    public static void main(String [] ak) {
        String encodedString = "U2VjcmV0IE1lc3NhZ2U=";
        
        byte [] decodedBytes = Base64.getDecoder().decode(encodedString);

        String decodedString = new String(decodedBytes);

        System.out.println("Encoded Strings: " + encodedString);
        System.out.println("Decrypted String: " + decodedString);
    }
}
