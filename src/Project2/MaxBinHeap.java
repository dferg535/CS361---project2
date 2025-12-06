package Project2;

import java.util.ArrayList;
import java.util.Collections;

public class MaxBinHeap {
    
    ArrayList<Item> maxHeap;
    
    public MaxBinHeap(ArrayList<Item> itemList) {
        maxHeap = createMaxHeap(itemList);
    }

    
    public ArrayList<Item> createMaxHeap(ArrayList<Item> itemList) {
        ArrayList<Item> heap = new ArrayList<>();
        for (Item item : itemList) {
            addToHeap(item, heap);
        }
        return heap;
    }
    
    
    public ArrayList<Item> addToHeap(Item newItem, ArrayList<Item> maxHeap) {
        
        // Add to end of array:
        maxHeap.add(newItem);
        
        // Store indices of parent and child nodes:
        int newNodeIndex = maxHeap.indexOf(newItem);
        int parentIndex = (newNodeIndex - 1) / 2;
        
        if (newNodeIndex >= 0) {
            Item parentNode = maxHeap.get(parentIndex);
            while (parentNode.priorityFactor < newItem.priorityFactor) {
                Collections.swap(maxHeap, parentIndex, newNodeIndex);
                newNodeIndex = maxHeap.indexOf(newItem);
                parentIndex = (newNodeIndex - 1) / 2;
                parentNode = maxHeap.get(parentIndex);
            }
        }

        return maxHeap;
    }

    
    @Override
    public String toString() {
        StringBuilder heapString = new StringBuilder();
        for (Item item : maxHeap) {
            heapString.append(item + "\n");
        }
        return heapString.toString();
    }
    
}
