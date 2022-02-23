package uz.sanatbek;

import java.util.*;
import java.util.function.Consumer;

public class Java8ForEachExample {
    public static void main(String[] args) {

        // creating sample Collection
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        //traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator value:: " + i);
        }

        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("forEach anonymous class Value::" + integer);
            }
        });
        MyConsumer action = new MyConsumer();
        myList.forEach(action);

    }
}
//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }
}
