package org.example.app;

public class Main {
    public static void main(String[] args) {

        String message = "no me gusta el desarrollo de software";
        int offset=12;
        CaesarCipher caesarCipher = new CaesarCipher();
        String ciphered = caesarCipher.cipher(message, offset);

        System.out.println("Message: " + message);
        System.out.println("Offset: " + offset);
        System.out.println("Ciphered message: " + ciphered);
    }
}
