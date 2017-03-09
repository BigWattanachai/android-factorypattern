package com.example.big.factorypattern.bread;

import com.example.big.factorypattern.interfaces.Bread;

public class Baguette implements Bread {

   @Override
   public String name() {
       return "Baguette";
   }

   @Override
   public String calories() {
       return " : 65 kcal";
   }
}
