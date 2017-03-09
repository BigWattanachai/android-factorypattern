package com.example.big.factorypattern.factory;

import com.example.big.factorypattern.interfaces.Bread;
import com.example.big.factorypattern.feeling.Cheese;
import com.example.big.factorypattern.interfaces.Filling;
import com.example.big.factorypattern.feeling.Potato;

/**
 * Created by BiG on 3/9/2017 AD.
 */

public class FillingFactory extends AbstractFactory {
   @Override
   public Filling getFilling(String filling) {

        if (filling == null) {
            return null;
        }

        if (filling == "CHE") {
            return new Cheese();
        } else if (filling == "POT") {
            return new Potato();
        }

        return null;
    }

    @Override
    public Bread getBread(String bread) {
        return null;
    }
}
