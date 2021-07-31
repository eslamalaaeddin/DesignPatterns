package IteratorPattern.aggregates;


import IteratorPattern.iterators.ArrayIterator;
import IteratorPattern.iterators.Iterator;

public class ArrayAggregate implements Aggregate {
    Integer[] array;


    public ArrayAggregate(Integer[] array) {
        this.array = array;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(array);
    }
}
