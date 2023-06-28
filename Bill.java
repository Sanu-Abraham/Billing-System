import java.util.*;

class Bill {
    
    ArrayList<String[]> menu = Menu.menu;
    String input = "";
    int total = 0;
    int[] orders;
    int[] quantity;
    int orderPrice, orderQuantity, orderTotal = 0;
    Scanner sc = new Scanner(System.in);
    
    
    void inputOrdersAndQuantity() {
        
        Menu.printMenu();
        
        System.out.print("\nEnter the index of orders as shown\nSample input for Pizza & Pepsi: 1,4\nIndexes: ");
        input = sc.nextLine();
        System.out.println();
        
        String[] ordersArray = input.split(",");
        
        orders = new int[ordersArray.length];
        quantity = new int[orders.length];
        
        for(int i = 0; i < ordersArray.length; i++) {
            orders[i] = Integer.parseInt(ordersArray[i])-1;
            System.out.print("Quantity of " + menu.get(orders[i])[0] + ": ");
            quantity[i] = sc.nextInt();
        }
        
    }
    
    void printBill() {
        System.out.println("----------------------------------------------");
        System.out.println("ITEM\t\tQUANTITY\t\tPRICE");
        System.out.println("----------------------------------------------");
        
        for(int i = 0; i < orders.length; i++) {
            
            orderPrice = Integer.parseInt(menu.get(orders[i])[1]);
            orderQuantity = quantity[i];
            orderTotal = (orderQuantity * orderPrice);
            
            System.out.println(menu.get(orders[i])[0] + "\t\t" + orderQuantity + "\t\t\t" + orderTotal);
            
            total += orderTotal;
        }
        System.out.println("\n----------------------------------------------");
        System.out.println("TOTAL:\t\t\t\t\t" + total);
        System.out.println("----------------------------------------------");
    }
    

}
