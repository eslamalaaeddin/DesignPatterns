package BridgePattern.tyres;

import BridgePattern.vehicle.Vehicle;

public class CeatTyre implements TyreImplementer {

    @Override
    public void attachTyre(Vehicle vehicle) {
        System.out.println("Attaching CeatTyre"+" to "+vehicle);
    }
}
