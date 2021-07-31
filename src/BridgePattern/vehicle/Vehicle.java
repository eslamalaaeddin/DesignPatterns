package BridgePattern.vehicle;

import BridgePattern.tyres.TyreImplementer;

public abstract class Vehicle {
//    TyreImplementer tyreImplementer;
//
//    public Vehicle(TyreImplementer tyreImplementer) {
//        this.tyreImplementer = tyreImplementer;
//    }

    public abstract void setTyre(TyreImplementer tyreImplementer);
}
