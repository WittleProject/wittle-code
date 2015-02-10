package com.dev.wittle.letter;

/**
 * Created by Davin on 2/10/2015.
 */
public enum Alphabet {
    A ('a'), B ('b'), C ('c'), D ('d'), E ('e'), F ('f'), G ('g'),
    H ('h'), I ('i'), J ('j'), K ('k'), L ('l'), M ('m'), N ('n'),
    O ('o'), P ('o'), Q ('q'), R ('r'), S ('s'), T ('t'), U ('u'),
    V ('v'), W ('w'), X ('x'), Y ('y'), Z ('z');

    char alphaChar;
    Alphabet(char alphaChar){
        this.alphaChar = alphaChar;
    }

    public char getAlphaChar(){return alphaChar;}
}
