package AdapterPattern.clients;

import AdapterPattern.interfaces.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Turkey is gobbling");
    }

    @Override
    public void fly() {
        System.out.println("Turkey is flying");
    }
}
