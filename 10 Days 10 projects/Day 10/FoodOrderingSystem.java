import java.util.ArrayList;
import java.util.Scanner;

public class FoodOrderingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> menu = new ArrayList<>();
        ArrayList<Integer> prices = new ArrayList<>();

        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Integer> cartPrices = new ArrayList<>();

        // Menu items
        menu.add("Burger");
        prices.add(120);

        menu.add("Pizza");
        prices.add(250);

        menu.add("Pasta");
        prices.add(180);

        menu.add("Sandwich");
        prices.add(90);

        menu.add("Cold Drink");
        prices.add(50);

        while (true) {
            System.out.println("\n--- ONLINE FOOD ORDERING SYSTEM ---");
            System.out.println("1. View Menu");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Place Order");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.println("\nFood Menu:");
                    for (int i = 0; i < menu.size(); i++) {
                        System.out.println((i + 1) + ". " + menu.get(i) + " - $" + prices.get(i));
                    }
                }

                case 2 -> {
                    System.out.print("Enter item number to add: ");
                    int itemNo = sc.nextInt();

                    if (itemNo > 0 && itemNo <= menu.size()) {
                        cart.add(menu.get(itemNo - 1));
                        cartPrices.add(prices.get(itemNo - 1));
                        System.out.println("Item added to cart.");
                    } else {
                        System.out.println("Invalid item number.");
                    }
                }

                case 3 -> {
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {
                        int total = 0;
                        System.out.println("\nYour Cart:");
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.println((i + 1) + ". " + cart.get(i) + " - ₹" + cartPrices.get(i));
                            total += cartPrices.get(i);
                        }
                        System.out.println("Total Bill: $" + total);
                    }
                }

                case 4 -> {
                    if (cart.isEmpty()) {
                        System.out.println("No items to place order.");
                    } else {
                        int total = 0;
                        for (int price : cartPrices) {
                            total += price;
                        }
                        System.out.println("Order placed successfully!");
                        System.out.println("Final Bill Amount: ₹" + total);
                        cart.clear();
                        cartPrices.clear();
                    }
                }

                case 5 -> {
                    System.out.println("Thank you for ordering!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
