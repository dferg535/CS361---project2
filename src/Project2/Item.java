package Project2;

/**
 * An item or element used in the Knapsack Problem. Each item has a ID, weight,
 * value, and priority factor.
 */
public class Item {
    
    int ID;
    double weight;
    double value;
    double priorityFactor;
    
    public Item (int ID, double weight, double value, double priorityFactor) {
        this.ID = ID;
        this.weight = weight;
        this.value = value;
        this.priorityFactor = priorityFactor;
    }
    
    
    @Override
    public String toString() {
        StringBuilder itemString = new StringBuilder("[");
        itemString.append("Item " + ID + ": ");
        itemString.append("weight = " + weight + ", ");
        itemString.append("value = " + value + "] ");
        return itemString.toString();
    }
}
