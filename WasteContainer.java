public class WasteContainer {
    private String type;
    private int capacity;
    private int currentFillLevel;

    public WasteContainer(String type, int capacity, int currentFillLevel) {
        this.type = type;
        this.capacity = capacity;
        this.currentFillLevel = currentFillLevel;
    }

    public String getType() {
        return type;
    }

    public boolean isFull() {
        return currentFillLevel >= capacity;
    }

    public void emptyContainer() {
        currentFillLevel = 0;
        System.out.println(type + " waste container emptied.");
    }
}
