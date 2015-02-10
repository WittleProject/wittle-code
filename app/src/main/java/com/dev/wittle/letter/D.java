package com.dev.wittle.letter;

import com.dev.wittle.GameContext;

/**
 * Created by Davin on 2/10/2015.
 */
public class D extends Letter{

    static Color _myColor;

    public D(GameContext context, char myChar, Color newColor) {
        this.context = context;
        this.myChar = myChar;
        D._myColor = newColor;
    }

    public void setColor(Color newColor){
        D._myColor = newColor;
        context.updateLetterInstances(myChar);
    }

    public Color getColor(){
        return D._myColor;
    }

    public void updateLetter(){};
}
