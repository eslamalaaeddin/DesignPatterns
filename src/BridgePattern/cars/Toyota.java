package BridgePattern.cars;

import BridgePattern.tyres.TyreImplementer;
import BridgePattern.vehicle.Vehicle;

public class Toyota extends Vehicle {
    @Override
    public void setTyre(TyreImplementer tyreImplementer) {
        tyreImplementer.attachTyre(this);
    }

    @Override
    public String toString() {
        return "Toyota";
    }
}
