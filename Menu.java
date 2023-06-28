import java.util.*;

class Menu {
    
    static ArrayList<String[]> menu = new ArrayList<String[]>();
    Scanner sc = new Scanner(System.in);
    
    void init() {
        String[] a = {"Pizza", "180"};
        menu.add(a);
        String[] b = {"Burger", "120"};
        menu.add(b);
        String[] c = {"Chicken", "150"};
        menu.add(c);
        String[] d = {"Pepsi", "40"};
        menu.add(d);
        String[] e = {"F.Fries", "60"};
        menu.add(e);
    }
    
    void addItem() {
        
        System.out.print("Enter the name of the new item: ");
        String itemName = sc.next();
        System.out.print("Enter the rate of the new item (in $): ");
        String rate = sc.next();
        
        String[] newItem = {itemName, rate};
        menu.add(newItem);
        itemName = null;
        rate = null;
        System.out.println();
        
        printMenu();
    }
    
    static void printMenu() {
        for(int i = 0; i < menu.size(); i++) {
            System.out.println((i+1) + ". " + menu.get(i)[0] + "\t Rate: " + menu.get(i)[1]);
        }
    }
}
