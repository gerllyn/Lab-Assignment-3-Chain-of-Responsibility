public class WasteManagementSystem {
    public static void main(String[] args) {
        // Setting up chain of responsibility
        WasteCollectorHandler organicCollector = new OrganicWasteCollector();
        WasteCollectorHandler recyclableCollector = new RecyclableWasteCollector();
        WasteCollectorHandler hazardousCollector = new HazardousWasteCollector();

        organicCollector.setNextHandler(recyclableCollector);
        recyclableCollector.setNextHandler(hazardousCollector);

        // Sample waste containers
        WasteContainer organicBin = new WasteContainer("Organic", 100, 100);
        WasteContainer recyclableBin = new WasteContainer("Recyclable", 80, 80);
        WasteContainer hazardousBin = new WasteContainer("Hazardous", 50, 50);

        // Trigger waste collection
        System.out.println("Processing waste collection:");
        organicCollector.handleRequest(organicBin);
        organicCollector.handleRequest(recyclableBin);
        organicCollector.handleRequest(hazardousBin);
    }
}
