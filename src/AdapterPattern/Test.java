package AdapterPattern;


import AdapterPattern.adapters.DuckAdapter;
import AdapterPattern.adapters.TurkeyAdapter;
import AdapterPattern.clients.MallardDuck;
import AdapterPattern.clients.WildTurkey;

public class Test {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
        DuckAdapter duckAdapter = new DuckAdapter(mallardDuck);

//        mallardDuck.quack();
//        mallardDuck.fly();
//
//        System.out.println("-----------------");
//
//        wildTurkey.gobble();
//        wildTurkey.fly();
//
//        System.out.println("-----------------");
//
//        turkeyAdapter.quack();
//        turkeyAdapter.fly();

        System.out.println("-----------------");

        duckAdapter.gobble();
        duckAdapter.fly();
    }
}
