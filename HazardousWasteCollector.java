public class HazardousWasteCollector extends WasteCollectorHandler {
    public void handleRequest(WasteContainer container) {
        if (container.getType().equals("Hazardous") && container.isFull()) {
            System.out.println("Hazardous waste handled with special precautions.");
            container.emptyContainer();
        } else {
            super.handleRequest(container);
        }
    }
}
