package xyz.whinyaan.dcit50.lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static final Scanner scanner = new Scanner(System.in);
    public static InventoryManager inventoryManager = new InventoryManager();

    public static void main(String[] args) {
        String[] options = {
            "add a single product",
            "add a box product",
            "exit"
        };
        String brand;
        while (true) {
            switch (showMenu(options)) {
                case 1:
                    System.out.print("Brand: ");
                    brand = scanner.nextLine();

                    try {
                        System.out.print("Quantity: ");
                        String qtyString = scanner.nextLine();
                        int quantity = Integer.parseInt(qtyString);

                        SingleProduct singleProduct = new SingleProduct(brand);
                        inventoryManager.add(singleProduct, quantity);
                        System.out.println();
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a " +
                        "number.");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Brand: ");
                    brand = scanner.nextLine();

                    try {
                        System.out.print("Number of Items in Box: ");
                        String itemsBoxString = scanner.nextLine();
                        int itemsBox = Integer.parseInt(itemsBoxString);
                        try {
                            System.out.print("Quantity: ");
                            String qtyString = scanner.nextLine();
                            int quantity = Integer.parseInt(qtyString);

                            BoxedProduct boxedProduct = new BoxedProduct(
                                brand,
                                itemsBox
                            );
                            inventoryManager.add(boxedProduct, quantity);
                            System.out.println();
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter " +
                            "a number.");
                            System.out.println();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter " +
                        "a number.");
                        System.out.println();
                    }

                    break;
                case 3:
                    exit();
                    break;
            }
        }
    }

    public static int showMenu(String[] options) {
        int choice = -1;

        while (true) {
            System.out.println("Options:");
            for (int i = 0; i < options.length; i++) {
                System.out.println("[" + (i + 1) + "] " + options[i]);
            }
            System.out.print("Choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= options.length) {
                    return choice;
                } else {
                    System.out.println(
                        "Invalid choice. Please enter a number between 1 and " +
                        options.length + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
            System.out.println();
        }
    }

    public static void exit() {
        System.out.println();
        System.out.println("Inventory Report");

        System.out.println();

        for (
            Map.Entry<String, HashMap<String, Integer>> entry :
            inventoryManager.brands.entrySet()
        ) {
            System.out.println(entry.getKey());

            HashMap<String, Integer> values = entry.getValue();

            System.out.println("    Singles: " + values.get("Singles"));
            System.out.println("    Boxes: " + values.get("Boxes"));
            System.out.println("    Total Pieces: "
                + values.get("Total Pieces"));

            System.out.println();
        }

        System.out.println("Thank you for using the program!");
        System.exit(0);
    }
}
