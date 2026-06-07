package ua.com.javarush.j4;


import ua.com.javarush.j4.crypto.Cypher;
import ua.com.javarush.j4.file.FileManager;
import ua.com.javarush.j4.language.Alphabet;
import ua.com.javarush.j4.language.EnglishAlphabet;
import ua.com.javarush.j4.runner.ArgsParser;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        ArgsParser a = ArgsParser.parse(args);

        Alphabet alphabet = new EnglishAlphabet();
        Cypher cypher = new Cypher(alphabet);
        String input = FileManager.read(a.getFile());

        switch (a.getMode()) {
            case ENCRYPT -> {
                String encrypted = cypher.encrypt(input, a.getKey());
                Path out = FileManager.buildOutputPath(a.getFile(), "[ENCRYPTED]");
                FileManager.write(out, encrypted);
                System.out.println("ENCRYPTED SUCCESSFULLY! → " + out);
            }
            case DECRYPT -> {
                String decrypted = cypher.decrypt(input, a.getKey());
                Path out = FileManager.buildOutputPath(a.getFile(), "[DECRYPTED]");
                FileManager.write(out, decrypted);
                System.out.println("DECRYPTED SUCCESSFULLY! → " + out);
            }
            case BRUTE_FORCE ->
                System.out.println("Will be initialized soon");
        }
    }
}