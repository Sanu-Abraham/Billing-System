import java.util.*;

class Interface {
    
    Menu m = new Menu();
    Bill b = new Bill();
    Scanner sc = new Scanner(System.in);
    
    void getInput() {
        
        System.out.print("What do you want to do?" + 
                        "\n1. Add a new item to the menu" +
                        "\n2. Calculate & print bill" +
                        "\n3. Exit" +
                        "\nEnter choice: ");
    
        String ch = sc.next();
        
        int c;
        try{
            c = Integer.parseInt(ch);
            System.out.println();
            doAsSaid(c);
        }
        catch(Exception e) {
            System.out.println("\nInvalid Input.\nPlease Try Again!\n");
            getInput();
        }
    }
    
    void doAsSaid(int choice) {
        switch(choice) {
            case 1: m.addItem();
                    System.out.println();
                    getInput();
                    break;
            case 2: b.inputOrdersAndQuantity();
                    System.out.println();
                    b.printBill();
                    break;
            case 3: System.exit(0);
            default: System.out.println("Invalid Input.\nPlease Try Again!\n");
                    getInput();
        }
    }
}
