# lab-assignment-3
**Problem Statement**

Municipalities and cities face significant challenges in waste management due to inefficiencies in traditional waste collection methods. These methods often result in delays, increased operational costs, and environmental hazards due to improper waste disposal. To address these issues, an **Automated Waste Management System** is proposed. 

### **Objective**
The system will implement the **Chain of Responsibility** design pattern to ensure efficient waste collection and disposal. It will categorize waste into different types (Organic, Recyclable, Hazardous) and assign appropriate handlers to process them. When a waste container reaches full capacity, the system will trigger the appropriate collector to manage the disposal process efficiently.

### **System Requirements**
1. **Waste Container Class**: Represents different waste bins with attributes such as type, capacity, and fill level.
2. **Chain of Responsibility Pattern**:
   - Abstract class **WasteCollectorHandler** for handling requests.
   - Concrete handlers (**OrganicWasteCollector, RecyclableWasteCollector, HazardousWasteCollector**) process specific types of waste.
3. **Waste Collection Process**:
   - Initializes a chain of collectors.
   - Identifies full waste containers and processes them using the appropriate handler.
   - Ensures proper waste disposal based on type and capacity.
4. **Validation**:
   - Ensures each waste type is handled by the correct collector.
   - Provides logs confirming successful waste disposal.
![image](https://github.com/user-attachments/assets/f7ce0e85-8e11-46f1-881a-ae82b70cd348)
