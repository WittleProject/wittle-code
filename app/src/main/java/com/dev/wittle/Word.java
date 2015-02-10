package com.dev.wittle;

import com.dev.wittle.letter.Letter;
import java.util.ArrayList;

/**
 * Created by Davin on 2/10/2015.
 */
public class Word {
    ArrayList<Letter> letters;
    String word;

    public Word(ArrayList<Letter> letters, String word) {
        this.letters = letters;
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public ArrayList<Letter> getLetters(){
        return letters;
    }
}
