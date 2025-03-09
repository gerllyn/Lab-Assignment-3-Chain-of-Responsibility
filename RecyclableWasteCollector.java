public class RecyclableWasteCollector extends WasteCollectorHandler {
    public void handleRequest(WasteContainer container) {
        if (container.getType().equals("Recyclable") && container.isFull()) {
            System.out.println("Recyclable waste collected and sent for recycling.");
            container.emptyContainer();
        } else {
            super.handleRequest(container);
        }
    }
}
