package BridgePattern.tyres;

import BridgePattern.vehicle.Vehicle;

public class ApolloTyre implements TyreImplementer {

    @Override
    public void attachTyre(Vehicle vehicle) {
        System.out.println("Attaching ApolloTyre"+" to "+vehicle);
    }
}
