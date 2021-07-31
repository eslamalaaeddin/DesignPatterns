package IteratorPattern;

import IteratorPattern.aggregates.Aggregate;
import IteratorPattern.iterators.Iterator;

public class Client {

    //input --> aggregate
    //output --> iterator
    public void printNumbers(Aggregate aggregate){
        Iterator iterator = aggregate.createIterator();
        printNumbers(iterator);
    }

    //input --> iterator
    //output --> iterator's data
    //this function is an example of polymorphism using iterator
    private void printNumbers(Iterator iterator){
        System.out.println(iterator);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
