package com.dev.wittle.letter;

import com.dev.wittle.GameContext;

/**
 * Created by Davin on 2/10/2015.
 */
public class LetterFactory {
    public static Letter LetterMaker(GameContext context, char myChar, Color myColor){
        switch (myChar){
            case 'a':
                return new A(context, myChar, myColor);
            case 'b':
                return new B(context, myChar, myColor);
            case 'c':
                return new C(context, myChar, myColor);
            case 'd':
                return new D(context, myChar, myColor);
            case 'e':
                return new E(context, myChar, myColor);
            default :
                return null;
        }
    }
}
