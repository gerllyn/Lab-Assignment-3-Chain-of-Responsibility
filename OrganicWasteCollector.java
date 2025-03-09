public class OrganicWasteCollector extends WasteCollectorHandler {
    public void handleRequest(WasteContainer container) {
        if (container.getType().equals("Organic") && container.isFull()) {
            System.out.println("Organic waste collected and disposed.");
            container.emptyContainer();
        } else {
            super.handleRequest(container);
        }
    }
}

