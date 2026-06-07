package ua.com.javarush.j4.language;

import java.util.List;

public class EnglishAlphabet extends Alphabet {

    public EnglishAlphabet() {
        setChars(List.of(
                'a','A','b','B','c','C','d','D','e','E',
                'f','F','g','G','h','H','i','I','j','J',
                'k','K','l','L','m','M','n','N','o','O',
                'p','P','q','Q','r','R','s','S','t','T',
                'u','U','v','V','w','W','x','X','y','Y',
                'z','Z'
        ));
    }
}
