package com.dev.wittle.letter;

import com.dev.wittle.GameContext;

/**
 * Created by Davin on 2/10/2015.
 */
public class E extends Letter{

    static Color _myColor;

    public E(GameContext context, char myChar, Color newColor) {
        this.context = context;
        this.myChar = myChar;
        E._myColor = newColor;
    }

    public void setColor(Color newColor){
        E._myColor = newColor;
        context.updateLetterInstances(myChar);
    }

    public Color getColor(){
        return E._myColor;
    }

    public void updateLetter(){};
}