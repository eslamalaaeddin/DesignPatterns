package BridgePattern.tyres;

import BridgePattern.vehicle.Vehicle;

public class HankookTyre implements TyreImplementer {
    @Override
    public void attachTyre(Vehicle vehicle) {
        System.out.println("Attaching HankookTyre"+" to "+vehicle);
    }
}
