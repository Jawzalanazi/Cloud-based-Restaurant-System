import java.util.Scanner;

public class RestaurantSystem {

    static TreeNode ItemsRoot = new TreeNode(0, "Menu");
    static Queue<Order> kitchenQueue = new Queue<>();
    static DrinkVendingMachine vendingMachine = new DrinkVendingMachine();
    static int id=0;
    
    private static void FillIMenu() {
      
        //Kitchen
        TreeNode Appetizers = new TreeNode(1, "Appetizers");
        TreeNode Salads = new TreeNode(2, "Salads");
        TreeNode Burgers = new TreeNode(3, "Burgers");
        TreeNode Pizzas = new TreeNode(4, "Pizzas");
        TreeNode Desserts = new TreeNode(5, "Desserts");
        TreeNode FriedBurgers = new TreeNode(6, "Fried_Burgers");
        TreeNode GrilledBurgers = new TreeNode(7, "Grilled_Burgers");
        ItemsRoot.children.addLast(Appetizers);
        ItemsRoot.children.addLast(Salads);
        ItemsRoot.children.addLast(Burgers);
        ItemsRoot.children.addLast(Pizzas);
        ItemsRoot.children.addLast(Desserts);
        Burgers.children.addLast(FriedBurgers);
        Burgers.children.addLast(GrilledBurgers);
        
        Appetizers.items.addLast(new Item(1, "French_Fries", 18, 7, 20));
        Appetizers.items.addLast(new Item(2, "Onion_Rings", 18, 7, 18));
        Appetizers.items.addLast(new Item(3, "Mozzarella_Sticks", 22, 9, 15));
        Appetizers.items.addLast(new Item(4, "Chicken_Wings", 24, 10, 12));
        Appetizers.items.addLast(new Item(5, "Nachos", 20, 8, 12));
        
        Salads.items.addLast(new Item(6, "Caesar_Salad", 24, 12, 8));
        Salads.items.addLast(new Item(7, "Greek_Salad", 24, 12, 8));
        Salads.items.addLast(new Item(8, "Caprese_Salad", 24, 12, 8));
        Salads.items.addLast(new Item(9, "Cobb_Salad", 26, 13, 8));
        Salads.items.addLast(new Item(10, "Garden_Salad", 20, 10, 10));

        FriedBurgers.items.addLast(new Item(11, "Cheeseburger", 30, 10, 10));
        FriedBurgers.items.addLast(new Item(12, "Hamburger", 28, 9, 15));

        GrilledBurgers.items.addLast(new Item(13, "Veggie_Burger", 26, 10, 12));
        GrilledBurgers.items.addLast(new Item(14, "Mushroom_Swiss_Burger", 32, 12, 10));
        GrilledBurgers.items.addLast(new Item(15, "BBQ_Chicken_Burger", 32, 12, 10));
        
        Pizzas.items.addLast(new Item(16, "Cheese_Pizza", 36, 14, 10));
        Pizzas.items.addLast(new Item(17, "Pepperoni_Pizza", 36, 14, 10));
        Pizzas.items.addLast(new Item(18, "Margherita_Pizza", 36, 14, 10));
        Pizzas.items.addLast(new Item(29, "BBQ_Chicken_Pizza", 38, 15, 10));
        Pizzas.items.addLast(new Item(20, "Veggie_Pizza", 38, 15, 10));

        Desserts.items.addLast(new Item(21, "Chocolate_Cake", 18, 9, 10));
        Desserts.items.addLast(new Item(22, "Apple_Pie", 18, 9, 10));
        Desserts.items.addLast(new Item(23, "Ice_Cream_Sundae", 12, 9, 10));
        Desserts.items.addLast(new Item(24, "Brownie_Sundae", 14, 10, 10));
        Desserts.items.addLast(new Item(25, "Cheesecake", 20, 11, 8));
        
        //Drinks
        vendingMachine.colaStack.push(new Item(2, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(5, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(8, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(11, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(14, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(17, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(20, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(23, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(26, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(29, "Cola", 10, 5, null));
        
        vendingMachine.juiceStack.push(new Item(1, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(4, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(7, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(10, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(13, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(16, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(19, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(22, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(25, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(28, "Juice", 100, 10, null));
        
        vendingMachine.waterStack.push(new Item(3, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(6, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(9, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(12, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(15, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(18, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(21, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(24, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(27, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(30, "Water", 10, 2, null));
    }
      
   public static void ShowTree(TreeNode Category){
        System.out.println(Category.name + ":\n==================\n");
        if(Category.children.isEmpty()){
            for (int i = 0; i < Category.items.size(); i++) {
                Item t = Category.items.removeFirst();
                System.out.println("\t" + t.getId() + " " + t.getName() + " " + t.getPreparingTime() + "  " + t.getCost() + " " + t.getCount());
                Category.items.addLast(t);
            }
        }
        else{
            for (int i = 0; i < Category.children.size(); i++) {
                TreeNode node = Category.children.removeFirst();
                ShowTree(node);
                Category.children.addLast(node);
            }
        }        
    }
    
    
    //===============================================
    public static void main(String[] args) {

        FillIMenu();
        ShowTree(ItemsRoot);
        Scanner scan = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n =====Restaurant=======");
            System.out.println("\nChoose an option.\n 1 = make an order,\n 2 = preparing orders, \n 3 = drinks vending machine,\n 4 = close this application.\n=================\n ?");
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    //Create an order
                    Order order = new Order(++id);
                    do {
                        //Show Catogories

                        TreeNode Category = ItemsRoot;
                        while (!Category.children.isEmpty()) {
                            //====== 1- show roote children nodes list
                            for (int i = 0; i < Category.children.size(); i++) {
                                TreeNode node = Category.children.removeFirst();
                                System.out.print(node.id + "-" + node.name + "   ");
                                Category.children.addLast(node);
                            }
                            //===================================ادخال رقم الصنف الرئيسي المطلوب
                            System.out.println();
                            System.out.println("Choose a category number.");
                            choice = scan.nextInt();

                            //=============================== الوصول الى الصنف الرئيسي 
                            TreeNode categoryChoice = Category;
                            for (int i = 0; i < Category.children.size(); i++) {
                                TreeNode node = Category.children.removeFirst();
                                if (node.id == choice) {
                                    categoryChoice = node;
                                }
                                Category.children.addLast(node);
                            }
                            Category = categoryChoice;

                        }

                        //Show Category Items طباعة الاصناف الفرعية 
                        for (int i = 0; i < Category.items.size(); i++) {
                            Item node = Category.items.removeFirst();
                            System.out.print(node.getId() + " - " + node.getName() + " - " + node.getCost() + ",  ");
                            Category.items.addLast(node);
                        }
                        System.out.println();

                        //============================ البحث في ليست العناصر عن العنصر المطلوب
                        Item item = null;
                        int count = 0;
                        System.out.println("Choose an item.");
                        choice = scan.nextInt();
                        for (int i = 0; i < Category.items.size(); i++) {
                            item = Category.items.removeFirst();

                            if (item.getId() == choice) {//اختبار الكمية اذا تسمح بالطلب 
                                System.out.println("the count in menu is**** " + item.getCount());
                                System.out.println("Enter how many item you need ?");
                                count = scan.nextInt();
                                if (item.getCount() >= count) {
                                    item.setCount(item.getCount() - count);

                                    Item CusItm = new Item(item.getId(), item.getName(), item.getPreparingTime(), item.getCost(), count);

                                    order.items.addLast(CusItm);
                                    System.out.println("the count in menu is **** " + item.getCount());
                                } else {
                                    System.out.println("We are sorry, this item is currently not availble.");
                                }
                            }
                            Category.items.addLast(item);
                        }

                        System.out.println("Add another item? 1 = yes, 0 = no.");

                        choice = scan.nextInt();
                    } while (choice == 1);

                    //////////////////////// Add Drink //////////////////////////////////
                    
                       System.out.println(" DrinK with order ? 1-> yes--- 0-> no");
                    choice = scan.nextInt();
                    if (choice == 1) {
                        do {
                            System.out.println("Choose a drink   1 = juice, 2 = cola, 3 = water.");
                            int n = scan.nextInt();

                            int drcout = 0;
                            System.out.println("how many drink you need?");
                            drcout = scan.nextInt();
                            Stack<Item> drinkStack = null;

                            switch (n) {

                                case 1: {
                                    drinkStack = vendingMachine.juiceStack;
                                    break;
                                }
                                case 2: {
                                    drinkStack = vendingMachine.colaStack;
                                    break;
                                }
                                case 3: {
                                    drinkStack = vendingMachine.waterStack;
                                    break;
                                }
                                default:
                                    System.out.println("Invalid drink!");
                            }
                            if (drinkStack.size() >= drcout) {
                                Item drk = null;
                                for (int i = 0; i < drcout; i++)
                                    drk = drinkStack.pop(); 
                                
                                Item CItm = new Item(drk.getId(), drk.getName(), 0, drk.getCost(), drcout);
                                order.items.addLast(CItm);

                            } else {
                                System.out.println("We are sorry, this drink is currently not availble.");
                            }
                        
                        System.out.println("Order another drink? 1 = yes, 0 = no.");
                        choice = scan.nextInt();
                    } while (choice == 1);
                    }
                    //////////////////////// Add Drink //////////////////////////////////
                    order.printOrder();

                    System.out.println();
                    System.out.println("Total order cost = " + order.total_cost());
                    System.out.println("Total order time = " + order.OrderPreparingTime());
                  
                    kitchenQueue.enqueue(order);
//                    
                    break;
                }               
               

                case 2: {
                    do {
                        if (kitchenQueue.size() > 0) {
                          

                            Order MiniTime = kitchenQueue.first();
                            int size = kitchenQueue.size();
                            for (int i = 0; i < size; i++) {
                                Order o = kitchenQueue.dequeue();
                                if (o.OrderPreparingTime() < MiniTime.OrderPreparingTime()) {
                                    MiniTime = o;
                                }
                                kitchenQueue.enqueue(o);
                            }
                            for (int i = 0; i < size; i++) {
                                Order o = kitchenQueue.dequeue();
                                if (o != MiniTime) {
                                    kitchenQueue.enqueue(o);
                                }
                            }
                            System.out.print("Current order is: "+MiniTime.getId());
                           
                           
                           
                            System.out.println("\nOrder preparing time: " + MiniTime.OrderPreparingTime() + "\n  total cost: " + MiniTime.total_cost());
                            System.out.println();
                        } else {
                            System.out.println("kitchen queue is empty.");
                            break;
                        }
                        System.out.println("Prepare another order? 1 = yes, 0 = no.");
                        choice = scan.nextInt();
                    } while (choice == 1);
                    break;
                }
                //drinks vending machine
                case 3: {
                    do {
                        System.out.println("Choose a drink category. 1 = juice, 2 = cola, 3 = water.");
                        choice = scan.nextInt();
                        int count = 0;
                        System.out.println("Enter drink count you need ");
                        count = scan.nextInt();
                        switch (choice) {
                            case 1: {

                                if (vendingMachine.juiceStack.size() > 0) {
                                    for (int i = 0; i < count; i++) {
                                        vendingMachine.juiceStack.pop();
                                    }

                                }

                                break;
                            }
                            case 2: {
                                if (vendingMachine.colaStack.size() > 0) {

                                    for (int i = 0; i < count; i++) {
                                        vendingMachine.colaStack.pop();
                                    }

                                }
                                break;
                            }
                            case 3: {
                                if (vendingMachine.waterStack.size() > 0) {

                                    for (int i = 0; i < count; i++) {
                                        vendingMachine.waterStack.pop();
                                    }
                                }
                                break;
                            }
                            default:
                                System.out.println("Invalid drink!");
                        }

                        System.out.println("Order another drink? 1 = yes, 0 = no.");
                        choice = scan.nextInt();
                    } while (choice == 1);
                    break;
                }
                default: {
                    if (choice != 4) {
                        System.out.println("Invalid choice!");
                    }
                }
            }
        } while (choice != 4);

    }
}
