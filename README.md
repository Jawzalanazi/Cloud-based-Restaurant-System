**Project Description: Cloud-based Restaurant System**

The **Cloud-based Restaurant System** is designed to streamline the ordering and collection process for customers in a restaurant. It integrates menu browsing, order placement, inventory management, kitchen organization, and order collection, along with a vending machine for drinks.

### Core Features:

1. **Menu and Order Collection:**
   - The menu is structured as a tree, where each node represents a category, with subcategories or items. Each node contains an ID, name, a list of child nodes (subcategories), and a list of items.
   - Customers can browse the menu, select items with desired quantities, and place their order.
   - Items are represented as instances of an `item` class, which contains ID, name, preparation time, cost, and stock count.
   
2. **Inventory Management:**
   - The system checks the inventory to ensure there is enough stock for the selected items.
   - If the stock is insufficient, the system prompts the user to update the quantity.
   - Once the order is confirmed, the system stores the items in a list (linked list or array) and calculates the total preparation time.
   - The inventory count is updated as items are ordered.

3. **Kitchen Organization:**
   - Orders are processed in the kitchen using a queue system. Orders are served based on the "first come, first served" principle.
   - A queue maintains the order of food preparation, and there is a timer to ensure food is ready for collection.
   - Drinks are served via a vending machine, separate from the kitchen queue.

4. **Order Collection and Vending Machine:**
   - After the food is prepared, customers collect their order at the restaurant's collection window.
   - For drinks, the `drink_vending` class manages separate stacks for each drink type (juice, cola, water).
   - The system uses stacks for each drink type, ensuring customers can collect drinks from the vending machine.

### Data Structures:
- **Tree**: Used for representing the menu and its structure (e.g., categories and items).
- **Linked List**: Used to store items in an order, ensuring dynamic inventory updates.
- **Queue**: Used in the kitchen to process orders in a "first in, first out" manner.
- **Stack**: Used in the vending machine to store and dispense different drink types.

### Notes:
- Item and drink details, including ID, name, preparation time, cost, and stock, are stored in text files for easy reference and updating.
- This system provides a seamless experience for customers to place orders, monitor inventory, and collect their orders (including drinks).

This project integrates multiple functionalities for a modern, cloud-based restaurant system, improving customer experience, operational efficiency, and inventory management.
