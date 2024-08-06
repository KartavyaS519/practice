import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        int choose;
        double quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("\tHamilton Burgers");
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("""
                Type of Burger  \tPrice
                1.\tVeggie Burger     \t$5.95
                2.\tDeluxe Veggie Burger\t$7.95
                3.\tChicken Burger    \t$6.45
                4.\tCheese Chicken Burger  \t$8.50
                5.\tCheese Bacon Burger     \t$9.25
                6.\tDeluxe Bacon Burger     \t$10.95
                7.\tHealthy Organic Burger\t$12.45
                8.\tQuit\t""");
            double total_price = 0;
            System.out.println("Enter the order for customer " + counter );
            boolean order = true;
            while (order) {
                System.out.print("Select item from the menu : ");
                choose = input.nextInt();
                if (choose == 1) {
                    System.out.println("Enter the quantity for Veggie Burger: ");
                    quantity = input.nextInt();
                    total_price = total_price + quantity * (5.95);
                } else if (choose == 2) {
                    System.out.println("Enter the quantity for Deluxe Veggie Burger: ");
                    quantity = input.nextInt();
                    total_price = total_price + quantity * (7.95);
                } else if (choose == 3) {
                    System.out.println("Enter the quantity for Chicken Burger: ");
                    quantity = input.nextInt();
                    total_price = total_price + quantity * (6.45);
                } else if (choose == 4) {
                    System.out.println("Enter the quantity for Cheese Chicken Burger: ");
                    quantity = input.nextInt();
                    total_price = total_price + quantity * (8.50);
                } else if (choose == 5) {
                    System.out.println("Enter the quantity for Cheese Bacon Burger: ");
                    quantity = input.nextInt();
                    total_price = total_price + quantity * (9.25);
                } else if (choose == 6) {
                    System.out.println("Enter the quantity for Deluxe Bacon Burger: ");
                    quantity = input.nextInt();
                    total_price = total_price + quantity * (10.95);
                } else if (choose == 7) {
                    System.out.println("Enter the quantity for Healthy Organic Burger: ");
                    quantity = input.nextInt();
                    total_price = total_price + quantity * (12.45);
                } else if (choose == 8) {
                    System.out.println("Thank you for purchase");
                    break;
                } else
                    System.out.println("Enter a accurate value");
                total_price = total_price + (total_price * 0.13);
                if (total_price > 100)
                    total_price = total_price - (total_price * 0.1);
                else if (total_price > 50)
                    total_price = total_price - (total_price * 0.05);
            }
            System.out.println("The total bill is " + total_price + " $");
            System.out.println("*_________________________________________*");
        }
    }
}









