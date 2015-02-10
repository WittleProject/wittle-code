package com.dev.wittle.letter;

import com.dev.wittle.GameContext;

/**
 * Created by Davin on 2/10/2015.
 */
public class A extends Letter{

    static Color _myColor;

    public A(GameContext context, char myChar, Color newColor) {
        this.context = context;
        this.myChar = myChar;
        A._myColor = newColor;
    }

    @Override
    public void setColor(Color newColor){
        A._myColor = newColor;
        context.updateLetterInstances(myChar);
    }

    public Color getColor(){
        return A._myColor;
    }

    public void updateLetter(){};
}
