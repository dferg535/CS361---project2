package Project2;

/**
 * An item or element used in the Knapsack Problem. Each item has an ID, weight,
 * value, and priority factor.
 */
public class Item {
    
    int ID;
    double weight;
    double value;
    double priorityFactor;
    
    /**
     * @param ID item ID
     * @param weight item weight
     * @param value item value
     * @param priorityFactor priority factor (dependent on algorithm used)
     */
    public Item (int ID, double weight, double value, double priorityFactor) {
        this.ID = ID;
        this.weight = weight;
        this.value = value;
        this.priorityFactor = priorityFactor;
    }
    
    
    /**
     * @return Detailed string representation of the item
     */
    @Override
    public String toString() {
        StringBuilder itemString = new StringBuilder("[");
        itemString.append("ID: " + ID + ", (");
        itemString.append("w=" + weight + ", ");
        itemString.append("v=" + value + ", ");
        itemString.append("priority=" + priorityFactor + ")]");
        return itemString.toString();
    }
}
