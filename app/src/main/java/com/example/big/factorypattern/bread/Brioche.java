package com.example.big.factorypattern.bread;

import com.example.big.factorypattern.interfaces.Bread;

public class Brioche implements Bread {

   @Override
   public String name() {
       return "Brioche";
   }

   @Override
   public String calories() {
       return " : 85 kcal";
   }
}
