package IteratorPattern.aggregates;


import IteratorPattern.iterators.Iterator;

public interface Aggregate {
    Iterator createIterator();
}
