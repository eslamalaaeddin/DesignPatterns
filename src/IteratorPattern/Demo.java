package IteratorPattern;

import IteratorPattern.aggregates.ArrayAggregate;
import IteratorPattern.aggregates.ArrayListAggregate;

import java.util.ArrayList;
import java.util.List;

public class Demo {


    public static void main(String[] args) {

        Integer[] numbersArray = {1,2,3,4,5};
        List<Integer> numbersArrayList = new ArrayList<>(){
            {
                add(6);
                add(7);
                add(8);
                add(9);
                add(10);
            }

        };


        ArrayAggregate arrayAggregate = new ArrayAggregate(numbersArray);
        ArrayListAggregate arrayListAggregate = new ArrayListAggregate(numbersArrayList);

        Client client = new Client();

        client.printNumbers(arrayAggregate);
        client.printNumbers(arrayListAggregate);

    }
}
