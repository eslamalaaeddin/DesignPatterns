package BridgePattern.cars;

import BridgePattern.tyres.TyreImplementer;
import BridgePattern.vehicle.Vehicle;

public class Chevrolet extends Vehicle {

    @Override
    public void setTyre(TyreImplementer tyreImplementer) {
        tyreImplementer.attachTyre(this);
    }

    @Override
    public String toString() {
        return "Chevrolet";
    }
}
