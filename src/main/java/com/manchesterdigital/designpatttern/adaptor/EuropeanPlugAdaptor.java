package com.manchesterdigital.designpatttern.adaptor;

/**
 * uses British Plug interface which is what British Person uses/relys on
 * Has member variables of EuropeanPlug. Need this to access the methods for that Class to override BritishPlug methods
 * Constructor to make new instances of European Plug
 * And override method so that when using the ThreeProngs method in BritishPlug
 * it will instead use the TwoProng method that EuropeanPlug uses
 */
public class EuropeanPlugAdaptor implements BritishPlug{
    private EuropeanPlug europeanPlug;

    public EuropeanPlugAdaptor() {
        europeanPlug = new EuropeanPlug();
    }

    @Override
    public void hasThreeProngs() {
        europeanPlug.hasTwoProngs();

    }
}
