package Project2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Problem 3:
        MaxBinHeap heap3 = Problem3();
        printResult(heap3);
        
    }

    //Problem 3: Priority Factor is Value
    public static MaxBinHeap Problem3() {

        ArrayList<Item> itemList = new ArrayList<>();

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
        MaxBinHeap heap = new MaxBinHeap(itemList);
        return heap;

    }

    //Problem 4: Additive inverse of the weight
    public static MaxBinHeap Problem4() {

        ArrayList<Item> itemList = new ArrayList<>();

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
        MaxBinHeap heap = new MaxBinHeap(itemList);
        return heap;
    }

    //Problem 5: value/weight
    public static MaxBinHeap Problem5() {

        ArrayList<Item> itemList = new ArrayList<>();

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
        MaxBinHeap heap = new MaxBinHeap(itemList);
        return heap;
    }

    
    public static void printResult(MaxBinHeap heap) {
        
        // Print the heap
        System.out.println("Problem 3:");
        System.out.println(heap);
        
        // Make a knap sack:
        ArrayList<Item> knapSack = new ArrayList<>();
        int weightLimit = 67;
        int knapSackWeight = 0;
        
        // Check max item in heap, add to knapsack if still under weight limit
        // (check all items)
        for (int i = 0; i < heap.size(); i++) {
            Item maxNode = heap.deleteMax();
            if (knapSackWeight + maxNode.weight <=  weightLimit) {
                knapSackWeight += maxNode.weight;
                knapSack.add(maxNode);
            }
        }
        
        
        System.out.println("Knap sack contents (item ID's):");
        
        StringBuilder sackString = new StringBuilder("[");
        for (Item item : knapSack) {
            sackString.append(item.ID + ", ");
        }
        sackString.delete(sackString.length() - 2, sackString.length());
    }
}