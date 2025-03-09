public class WasteCollectorHandler {
    protected WasteCollectorHandler nextHandler;

    public void setNextHandler(WasteCollectorHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(WasteContainer container) {
        if (nextHandler != null) {
            nextHandler.handleRequest(container);
        } else {
            System.out.println("No handler available for: " + container.getType());
        }
    }
}
