package com.manchesterdigital.messing.lambda;

public class CheckIfSwimmer implements CheckTrait{


    @Override
    public boolean test(Animal a) {
        return a.canSwim();
    }
}
