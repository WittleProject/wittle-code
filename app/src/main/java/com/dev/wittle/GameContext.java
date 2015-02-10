package com.dev.wittle;

import com.dev.wittle.letter.Alphabet;
import com.dev.wittle.letter.Color;
import com.dev.wittle.letter.Letter;
import com.dev.wittle.letter.LetterFactory;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Davin on 2/10/2015.
 */
public class GameContext {
    ArrayList<Word> words;
    ArrayList<Letter> alphabet; //change to DraggableLetter with decorator
    public GameContext() {

        //initialize alphabet, various other things
        this.words = new ArrayList<Word>();
        for(Alphabet letter : Alphabet.values()){
            alphabet.add(LetterFactory.LetterMaker(this,letter.getAlphaChar(), Color.BLUE));
            //do I even need the decorator? Could decorate at Tile creation
        }
    }

    public void updateLetterInstances(char myChar){
        for(int i = 0; i<26;i++) {
            if (alphabet.get(i).getChar() == myChar) {
                alphabet.get(i).updateLetter();
                break;
            }
        }
        Iterator listIter = words.iterator();
        Word word;
        while(listIter.hasNext()){
            word = (Word) listIter.next(); //there's something wrong - I shouldn't need to do this TODO
            for(int i = 0; i<word.getWord().length();i++){
                if(word.getWord().charAt(i) == myChar) {
                    word.getLetters().get(i).updateLetter();
                }
            }

        }
    }
}
