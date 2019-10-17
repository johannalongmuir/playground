package com.manchesterdigital.designpatttern.adaptor;

public class UsePlug {

    public static void main(String[] args) {

        BritishPerson britishPerson = new BritishPerson(new EuropeanPlugAdaptor());
        britishPerson.hasThreeProngs();

    }
}
