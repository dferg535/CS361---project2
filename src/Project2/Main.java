package Project2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Problem 3: Priority Factor is Value
        ArrayList<Item> itemList = new ArrayList<>();

        Item item0 = new Item(0, 23, 505, 23);
        Item item1 = new Item(1, 26, 352, 26);
        Item item2 = new Item(2, 20, 458, 20);
        Item item3 = new Item(3, 18, 220, 18);
        Item item4 = new Item(4, 32, 354, 32);
        Item item5 = new Item(5, 27, 414, 27);
        Item item6 = new Item(6, 29, 498, 29);
        Item item7 = new Item(7, 26, 545, 26);
        Item item8 = new Item(8, 30, 473, 30);
        Item item9 = new Item(9, 27, 553, 27);

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

        MaxBinHeap heapProb3 = new MaxBinHeap(itemList);
        System.out.println(heapProb3);


        //Problem 4: Additive inverse of the weight
        ArrayList<Item> itemListProb4 = new ArrayList<>();

        Item item00 = new Item(0, 23, 505, -505);
        Item item10 = new Item(1, 26, 352, -352);
        Item item20 = new Item(2, 20, 458, -458);
        Item item30 = new Item(3, 18, 220, -220);
        Item item40 = new Item(4, 32, 354, -354);
        Item item50 = new Item(5, 27, 414, -414);
        Item item60 = new Item(6, 29, 498, -498);
        Item item70 = new Item(7, 26, 545, -545);
        Item item80 = new Item(8, 30, 473, -473);
        Item item90 = new Item(9, 27, 553, -543);

        itemListProb4.add(item00);
        itemListProb4.add(item10);
        itemListProb4.add(item20);
        itemListProb4.add(item30);
        itemListProb4.add(item40);
        itemListProb4.add(item50);
        itemListProb4.add(item60);
        itemListProb4.add(item70);
        itemListProb4.add(item80);
        itemListProb4.add(item90);

        MaxBinHeap heapProb4 = new MaxBinHeap(itemListProb4);
        System.out.println(heapProb4);

        //Problem 5: value/weight
        ArrayList<Item> itemListProb5 = new ArrayList<>();

        Item item01 = new Item(0, 23, 505, ((double) 505 /23));
        Item item11 = new Item(1, 26, 352, ((double) 352 /26));
        Item item21 = new Item(2, 20, 458, ((double) 458 /20));
        Item item31 = new Item(3, 18, 220, ((double) 220 /18));
        Item item41 = new Item(4, 32, 354, ((double) 354 /32));
        Item item51 = new Item(5, 27, 414, ((double) 414 /27));
        Item item61 = new Item(6, 29, 498, ((double) 498 /29));
        Item item71 = new Item(7, 26, 545, ((double) 545 /26));
        Item item81 = new Item(8, 30, 473, ((double) 473 /30));
        Item item91 = new Item(9, 27, 553, ((double) 553 /27));

        itemListProb5.add(item01);
        itemListProb5.add(item11);
        itemListProb5.add(item21);
        itemListProb5.add(item31);
        itemListProb5.add(item41);
        itemListProb5.add(item51);
        itemListProb5.add(item61);
        itemListProb5.add(item71);
        itemListProb5.add(item81);
        itemListProb5.add(item91);

        MaxBinHeap heapProb5 = new MaxBinHeap(itemListProb5);
        System.out.println(heapProb5);


    }
}