package com.manchesterdigital.designpatttern.adaptor;

/**
 * British person uses British Plug Interface normally
 * Needs to use the European Plug adapter to use two prongs as in Europe
 */

public class BritishPerson {

    // uses british plug normally
    private BritishPlug britishPlug;


    // constructor
    public BritishPerson(BritishPlug britishPlug) {
        this.britishPlug = britishPlug;
    }


    public void setBritishPlug(BritishPlug britishPlug) {
        this.britishPlug = britishPlug;
    }

    // abstract method from interface.
    public void hasThreeProngs() {
        britishPlug.hasThreeProngs();
    }



}


