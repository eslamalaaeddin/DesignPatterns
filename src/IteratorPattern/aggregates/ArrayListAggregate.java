package IteratorPattern.aggregates;


import IteratorPattern.iterators.ArrayListIterator;
import IteratorPattern.iterators.Iterator;

import java.util.List;

public class ArrayListAggregate implements Aggregate {
    List<Integer> arrayList;

    public ArrayListAggregate(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayListIterator(arrayList);
    }
}
