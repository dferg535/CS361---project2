package Project2;

public class MaxBinHeap {

    public MaxBinHeap(Item[] array) {
        Item[] newArray = new Item[array.length];
    }

    public Item[] add(Item newItem, Item[] array) {

        //Keep track of position that item was replaced at
        int ArraySpot = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                //Adding new item to next available position
                array[i] = newItem;
                //Save this to compare with parent in HeapSort
                ArraySpot = i;
                break;
            }
        }

        //Compare to parent
        System.out.println("I got here");
        //System.out.println("Array Spot: " + ArraySpot);

        int ParentSpot = (ArraySpot - 1) / 2;
        System.out.println("ParentSpot is " + ParentSpot);
        while(ParentSpot >= -1) {
            Item parentNode = array[ParentSpot];

            //If the Parent node is less than the Child, we need to swap for max binary heap
            if(parentNode.priorityFactor < newItem.priorityFactor) {
                array[ParentSpot] = newItem;
                array[ArraySpot] = parentNode;
                ParentSpot = (ParentSpot - 1) / 2;
            }

        }


        return array;
    }

}
