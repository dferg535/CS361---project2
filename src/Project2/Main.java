package Project2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        Item item1 = new Item(1, 453, 505, 100);
        Item item2 = new Item(1, 453, 505, 20);
        Item item3 = new Item(1, 453, 505, 70);

        Item[] newArray = new Item[3];
        newArray[0] = item1;
        newArray[1] = item2;
        newArray[2] = item3;

        Item item4 = new Item(1, 453, 505, 1000);
        MaxBinHeap maxBin = new MaxBinHeap(newArray);

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

        Item[] array = maxBin.add(item4, newArray);



    }
}