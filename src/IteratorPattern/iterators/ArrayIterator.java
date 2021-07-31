package IteratorPattern.iterators;

public class ArrayIterator implements Iterator{
    private Integer[] array;
    int position = 0;

    public ArrayIterator(Integer[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (position >= array.length || array[position] == null){
            return false;
        }
        else{
            return true;
        }

    }

    @Override
    public Object next() {
        Integer item = array[position];
        position = position+1;
        return item;
    }

    @Override
    public String toString() {
        return "------\nArray\n-------";
    }
}
