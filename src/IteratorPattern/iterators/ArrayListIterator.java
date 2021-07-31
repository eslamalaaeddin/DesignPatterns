package IteratorPattern.iterators;

import java.util.List;

public class ArrayListIterator implements Iterator{
    List<Integer> arrayList;
    int position = 0;

    public ArrayListIterator(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        if (position >= arrayList.size() || arrayList.get(position) == null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Object next() {
        Integer item = arrayList.get(position);
        position = position+1;
        return item;
    }

    @Override
    public String toString() {
        return "------\nArrayList\n-------";
    }
}
