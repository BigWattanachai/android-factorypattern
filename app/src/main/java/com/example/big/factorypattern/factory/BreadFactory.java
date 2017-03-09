package com.example.big.factorypattern.factory;

import com.example.big.factorypattern.bread.Baguette;
import com.example.big.factorypattern.interfaces.Bread;
import com.example.big.factorypattern.bread.Brioche;
import com.example.big.factorypattern.interfaces.Filling;
import com.example.big.factorypattern.bread.Roll;

/**
 * Created by BiG on 3/9/2017 AD.
 */

public class BreadFactory extends AbstractFactory {
    public Bread getBread(String breadType) {
        if (breadType == null) {
            return null;
        }
        if ("BRI".equalsIgnoreCase(breadType)) {
            return new Brioche();
        } else if ("ROL".equalsIgnoreCase(breadType)) {
            return new Roll();
        } else if ("BAG".equalsIgnoreCase(breadType)) {
            return new Baguette();
        } else {
            return null;
        }
    }

    @Override
    public Filling getFilling(String filling) {
        return null;
    }
}
