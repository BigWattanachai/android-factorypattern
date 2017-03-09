package com.example.big.factorypattern.feeling;

import com.example.big.factorypattern.interfaces.Filling;

public class Cheese implements Filling {

    @Override
    public String name() {
        return "Cheese";
    }

    @Override
    public String calories() {
        return " : 85 kcal";
    }
}
