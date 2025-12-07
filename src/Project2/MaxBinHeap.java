package Project2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A max binary heap
 */
public class MaxBinHeap {
    
    // The array representing the heap:
    ArrayList<Item> maxHeap;
    
    /**
     * Constructor takes in a list of items and builds a maxBinary heap using
     * helper methods
     * @param itemList A list of items being added to the heap
     */
    public MaxBinHeap(ArrayList<Item> itemList) {
        maxHeap = createMaxHeap(itemList);
    }
    
    
    /**
     * Builds a max heap given a list of items
     * @param itemList A list of items
     * @return A max heap containing all the items in the list
     */
    public ArrayList<Item> createMaxHeap(ArrayList<Item> itemList) {
        ArrayList<Item> heap = new ArrayList<>();
        for (Item item : itemList) {
            addToHeap(item, heap);
        }
        return heap;
    }
    
    /**
     * Adds a single item into the max heap. Adds at end, then bottom-up
     * heapification.
     * @param newItem The item being added
     * @param maxHeap The heap being added to
     * @return The max heap with the added item in its proper place
     */
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
    
    /**
     * Deletes the max (first/top) node. First swaps with the last node in the
     * heap, followed by top-down heapification.
     * @return The max node being deleted
     */
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
        
            // Compare children (select greater priority for swap):
            Item childToBeSwapped = leftChild;
            if (rightChild != null && childToBeSwapped.priorityFactor < rightChild.priorityFactor) {
                childToBeSwapped = rightChild;
            }
            
            // Swap child with parent
            Collections.swap(maxHeap, maxHeap.indexOf(item),
                    maxHeap.indexOf(childToBeSwapped));
            
            // Update Children nodes:
            int newIndex = maxHeap.indexOf(item);
            int leftChildIndex = newIndex * 2 + 1;
            int rightChildIndex = newIndex * 2 + 2;
            if (leftChildIndex < maxHeap.size()) {
                leftChild = maxHeap.get(leftChildIndex);
            }
            else { leftChild = null; }
            if (rightChildIndex < maxHeap.size()) {
                rightChild = maxHeap.get(rightChildIndex);
            }
            else { rightChild = null; }
        }
        
        // Return the deleted (max) node:
        return maxItem;
    }
    
    /**
     * @return The number of items contained in the heap
     */
    public int size(){ return maxHeap.size(); }
    
    /**
     * @return String representation of the heap: first the array representation
     * containing only the item ID's, then a list of the item details in the same
     * order.
     */
    @Override
    public String toString() {
        
        // Array string builder:
        StringBuilder array = new StringBuilder("Heap Built:\n");
                array.append("Array representation (item " + "ID's):\n[");
        for (Item item: maxHeap) {
            array.append(item.ID + ", ");
        }
        array.delete(array.length() - 2, array.length());
        array.append("]\n\n");
        
        // Detailed item list (in same order)
        StringBuilder heapString = new StringBuilder(array);
        for (Item item : maxHeap) {
            heapString.append(item + "\n");
        }
        
        return heapString.toString();
        
    }
    
    
    
}
