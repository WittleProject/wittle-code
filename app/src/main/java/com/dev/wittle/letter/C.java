package com.dev.wittle.letter;

import com.dev.wittle.GameContext;

/**
 * Created by Davin on 2/10/2015.
 */
public class C extends Letter{

    static Color _myColor;

    public C(GameContext context, char myChar, Color newColor) {
        this.context = context;
        this.myChar = myChar;
        C._myColor = newColor;
    }

    public void setColor(Color newColor){
        C._myColor = newColor;
        context.updateLetterInstances(myChar);
    }

    public Color getColor(){
        return C._myColor;
    }

    public void updateLetter(){};
}
