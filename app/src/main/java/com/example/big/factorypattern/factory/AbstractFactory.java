package com.example.big.factorypattern.factory;

import com.example.big.factorypattern.interfaces.Bread;
import com.example.big.factorypattern.interfaces.Filling;

/**
 * Created by BiG on 3/9/2017 AD.
 */

public abstract class AbstractFactory {
    public abstract Bread getBread(String bread);
    public abstract Filling getFilling(String filling);
}
