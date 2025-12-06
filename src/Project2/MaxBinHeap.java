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
    
    
    public Item deleteMax() {
        
        // Store the max node for return:
        Item maxItem = maxHeap.getFirst();
        
        // Swap the first and last node:
        Collections.swap(maxHeap, 0, maxHeap.indexOf(maxHeap.getLast()));
        
        // Remove the last node:
        maxHeap.removeLast();
        
        // Top-down heapify:
        Item item = maxHeap.getFirst();
        Item leftChild = null;
        if (maxHeap.size() > 1) { leftChild = maxHeap.get(1); }
        Item rightChild = null;
        if (maxHeap.size() > 2) { rightChild = maxHeap.get(2); }
        
        while( (leftChild != null && leftChild.priorityFactor > item.priorityFactor) ||
                (rightChild != null && rightChild.priorityFactor > item.priorityFactor) ) {
        
            Item childToBeSwapped = leftChild;
            if (rightChild != null && childToBeSwapped.priorityFactor < rightChild.priorityFactor) {
                childToBeSwapped = rightChild;
            }
            
            Collections.swap(maxHeap, maxHeap.indexOf(item),
                    maxHeap.indexOf(childToBeSwapped));
            
            int newIndex = maxHeap.indexOf(item);
            int leftChildIndex = newIndex * 2 + 1;
            int rightChildIndex = newIndex * 2 + 2;
            if (leftChildIndex < maxHeap.size()) {
                leftChild = maxHeap.get(leftChildIndex);
            }
            else { leftChild = null; }
            if (rightChildIndex < maxHeap.size()) {
                rightChild = maxHeap.get(leftChildIndex);
            }
            else { rightChild = null; }
        }
        
        return maxItem;
    }
    
    
    public int size(){ return maxHeap.size(); }
    
    @Override
    public String toString() {
        
        // Array string builder:
        StringBuilder array = new StringBuilder("Array representation (item " +
                "ID's):\n[");
        for (Item item: maxHeap) {
            array.append(item.ID + ", ");
        }
        array.delete(array.length() - 2, array.length());
        array.append("]\n\n");
        
        StringBuilder heapString = new StringBuilder(array);
        for (Item item : maxHeap) {
            heapString.append(item + "\n");
        }
        
        return heapString.toString();
        
    }
    
    
    
}
