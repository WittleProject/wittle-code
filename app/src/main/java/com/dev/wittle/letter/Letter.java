package com.dev.wittle.letter;

import com.dev.wittle.GameContext;

/**
 * Created by Davin on 2/10/2015.
 */

public abstract class Letter {
    char myChar;
    GameContext context;

    abstract void setColor(Color newColor);
    abstract Color getColor();
    public char getChar(){
        return myChar;
    }
    public abstract void updateLetter();
}
