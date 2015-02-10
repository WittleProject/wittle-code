package com.dev.wittle.letter;

import com.dev.wittle.GameContext;

/**
 * Created by Davin on 2/10/2015.
 */
public class B extends Letter{

    static Color _myColor;

    public B(GameContext context, char myChar, Color newColor) {
        this.context = context;
        this.myChar = myChar;
        B._myColor = newColor;
    }

    public void setColor(Color newColor){
        B._myColor = newColor;
        context.updateLetterInstances(myChar);
    }

    public Color getColor(){
        return B._myColor;
    }

    public void updateLetter(){};
}
