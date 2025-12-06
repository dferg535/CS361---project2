package Project2;

import java.util.ArrayList;
import java.util.Collections;

public class MaxBinHeap {

    public MaxBinHeap(Item[] array) {
        ArrayList<Item> newArray = new ArrayList<>();
    }

    public ArrayList<Item> addToHeap(Item newItem, ArrayList<Item> array) {

        //Keep track of position that item was replaced at

        array.add(newItem);
        int ArraySpot = array.indexOf(newItem);

        //System.out.println("");

        //Compare to parent
        System.out.println("I got here");
        System.out.println("Array Spot: " + ArraySpot);

        int ParentSpot = (ArraySpot - 1) / 2;
        System.out.println("ParentSpot is " + ParentSpot);

        while(ParentSpot > 0) {
            Item parentNode = array.get(ParentSpot);

            //If the Parent node is less than the Child, we need to swap for max binary heap
            if(parentNode.priorityFactor < newItem.priorityFactor) {
                //array[ParentSpot] = newItem;
                Collections.swap(array, ParentSpot, ArraySpot);
                //array[ArraySpot] = parentNode;
                System.out.println("ParentSpot is " + ParentSpot);
            }
            ParentSpot = (ParentSpot - 1) / 2;

        }


        return array;
    }

}
