package BridgePattern.demo;

import BridgePattern.cars.Carro;
import BridgePattern.cars.Chevrolet;
import BridgePattern.cars.Fiat;
import BridgePattern.cars.Toyota;
import BridgePattern.tyres.ApolloTyre;
import BridgePattern.tyres.CeatTyre;
import BridgePattern.tyres.HankookTyre;
import BridgePattern.vehicle.Vehicle;

public class Demo {

    public static void main(String[] args) {

        Vehicle chevrolet = new Chevrolet();
        Vehicle fiat = new Fiat();
        Vehicle toyota = new Toyota();
        Vehicle carro = new Carro();

        chevrolet.setTyre(new HankookTyre());
        fiat.setTyre(new ApolloTyre());
        toyota.setTyre(new CeatTyre());
        carro.setTyre(new ApolloTyre());
    }
}
