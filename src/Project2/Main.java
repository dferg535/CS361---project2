package Project2;

import java.util.ArrayList;

/**
 * Uses helper methods to build heaps for problems 3-5, puts items in the knapsack
 * using the corresponding algorithm, then prints the results
 */
public class Main {
    public static void main(String[] args) {

        // Problem 3:
        System.out.println("Problem 3:");
        MaxBinHeap maxHeap3 = makeProblem3Heap();
        printResult(maxHeap3);
        
        //Problem 4:
        System.out.println("Problem 4:");
        MaxBinHeap maxHeap4 = makeProblem4Heap();
        printResult(maxHeap4);
        
        // Problem 5:
        System.out.println("Problem 5:");
        MaxBinHeap maxHeap5 = makeProblem5Heap();
        printResult(maxHeap5);
        
    }
    
    /**
     * Makes the max heap for problem 3, where item value = priority factor
     */
    public static MaxBinHeap makeProblem3Heap() {

        // Make the items:
        Item item0 = new Item(0, 23, 505, 505);
        Item item1 = new Item(1, 26, 352, 352);
        Item item2 = new Item(2, 20, 458, 458);
        Item item3 = new Item(3, 18, 220, 220);
        Item item4 = new Item(4, 32, 354, 354);
        Item item5 = new Item(5, 27, 414, 414);
        Item item6 = new Item(6, 29, 498, 498);
        Item item7 = new Item(7, 26, 545, 545);
        Item item8 = new Item(8, 30, 473, 473);
        Item item9 = new Item(9, 27, 553, 543);
        
        // Put the items into a list:
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(item0);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);
        itemList.add(item9);
        
        // Build and return the max heap:
        return new MaxBinHeap(itemList);
    }
    
    /**
     * Makes the max heap for problem 4, where additive inverse of item weight =
     * priority factor
     */
    public static MaxBinHeap makeProblem4Heap() {
        
        // Make the items:
        Item item0 = new Item(0, 23, 505, -23);
        Item item1 = new Item(1, 26, 352, -26);
        Item item2 = new Item(2, 20, 458, -20);
        Item item3 = new Item(3, 18, 220, -18);
        Item item4 = new Item(4, 32, 354, -32);
        Item item5 = new Item(5, 27, 414, -27);
        Item item6 = new Item(6, 29, 498, -29);
        Item item7 = new Item(7, 26, 545, -26);
        Item item8 = new Item(8, 30, 473, -30);
        Item item9 = new Item(9, 27, 553, -27);
        
        // Put the items into a list:
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(item0);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);
        itemList.add(item9);
        
        // Build and return the max heap:
        return new MaxBinHeap(itemList);
    }
    
    
    /**
     * Makes the max heap for problem 5, where additive inverse of item weight =
     * priority factor
     */
    public static MaxBinHeap makeProblem5Heap() {

        // Make the items:
        Item item0 = new Item(0, 23, 505, ((double) 505 /23));
        Item item1 = new Item(1, 26, 352, ((double) 352 /26));
        Item item2 = new Item(2, 20, 458, ((double) 458 /20));
        Item item3 = new Item(3, 18, 220, ((double) 220 /18));
        Item item4 = new Item(4, 32, 354, ((double) 354 /32));
        Item item5 = new Item(5, 27, 414, ((double) 414 /27));
        Item item6 = new Item(6, 29, 498, ((double) 498 /29));
        Item item7 = new Item(7, 26, 545, ((double) 545 /26));
        Item item8 = new Item(8, 30, 473, ((double) 473 /30));
        Item item9 = new Item(9, 27, 553, ((double) 553 /27));
        
        // Put the items into a list:
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(item0);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);
        itemList.add(item9);
        
        // Build and return the max heap:
        return new MaxBinHeap(itemList);
    }
    
    
    /**
     * Prints the heap built and the knapsack contents for each problem (for
     * problems 3-5)
     * @param heap The heap built for the problem at hand
     */
    public static void printResult(MaxBinHeap heap) {
        
        // Print the heap
        System.out.println(heap);
        
        // Make a knapsack:
        ArrayList<Item> knapSack = new ArrayList<>();
        double weightLimit = 67;
        double knapSackWeight = 0;
        
        // Check max item in heap, add to knapsack if still under weight limit
        // (check all items)
        int heapSize = heap.size();
        for (int i = 0; i < heapSize - 1; i++) {
            Item maxNode = heap.deleteMax();
            if (knapSackWeight + maxNode.weight <=  weightLimit) {
                knapSackWeight += maxNode.weight;
                knapSack.add(maxNode);
            }
        }
        
        // Print knapsack contents:
        System.out.println("Knapsack contents (item ID's):");
        StringBuilder sackString = new StringBuilder("[");
        for (Item item : knapSack) {
            sackString.append(item.ID + ", ");
        }
        sackString.delete(sackString.length() - 2, sackString.length());
        sackString.append("]\n");
        System.out.println(sackString);
    }
}