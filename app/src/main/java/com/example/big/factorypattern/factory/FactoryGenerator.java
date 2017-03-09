package com.example.big.factorypattern.factory;

/**
 * Created by BiG on 3/9/2017 AD.
 */

public class FactoryGenerator {
public static AbstractFactory getFactory(String factory) {

        if (factory == null) {
            return null;
        }

        if (factory == "BRE") {
            return new BreadFactory();
        } else if (factory == "FIL") {
            return new FillingFactory();
        }

        return null;
    }
}
