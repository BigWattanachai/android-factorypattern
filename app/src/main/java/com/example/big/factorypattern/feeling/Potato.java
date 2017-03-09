package com.example.big.factorypattern.feeling;

import com.example.big.factorypattern.interfaces.Filling;

public class Potato implements Filling {

    @Override
    public String name() {
        return "Potato";
    }

    @Override
    public String calories() {
        return " : 85 kcal";
    }
}
