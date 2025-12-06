package Project2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Item> itemList = new ArrayList<>();
        
        Item item1 = new Item(1, 453, 505, 100);
        Item item2 = new Item(2, 453, 505, 20);
        Item item3 = new Item(3, 453, 505, 70);
        Item item4 = new Item(4, 453, 505, 1000);
        
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);

        MaxBinHeap heap = new MaxBinHeap(itemList);
        System.out.println(heap);

    }
}