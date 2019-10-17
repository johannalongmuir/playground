package com.manchesterdigital.designpattern.adaptor;


import com.manchesterdigital.designpatttern.adaptor.BritishPerson;
import com.manchesterdigital.designpatttern.adaptor.EuropeanPlug;
import com.manchesterdigital.designpatttern.adaptor.EuropeanPlugAdaptor;
import org.junit.Assert;
import org.junit.Test;



public class UsePlugTest {


    @Test
    public void whenBritishPersonUsesEuropeanPlugAdaptor() {
        BritishPerson britishPerson = new BritishPerson(new EuropeanPlugAdaptor());
        britishPerson.hasThreeProngs();

        //EuropeanPlug europeanPlug = new EuropeanPlug();
        //europeanPlug.hasTwoProngs();
        // String result = "I can work in Europe!";
        // when method british person has three prongs run, overrides and uses .hasTwoProngs.
        // Look at builder patterns design for examples on the testing.


    }


}
