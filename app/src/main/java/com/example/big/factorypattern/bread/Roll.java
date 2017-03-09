package com.example.big.factorypattern.bread;

import com.example.big.factorypattern.interfaces.Bread;

public class Roll implements Bread {

   @Override
   public String name() {
       return "Roll";
   }

   @Override
   public String calories() {
       return " : 75 kcal";
   }
}

