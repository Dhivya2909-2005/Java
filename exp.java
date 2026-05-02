import java.util.*;
class exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double foodTotal = 0;
        System.out.print("How many expenses? ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer
        String[] category = new String[n];
        double[] amount = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter category: ");
            category[i] = sc.nextLine();
            System.out.print("Enter amount: ");
            amount[i] = sc.nextDouble();
            sc.nextLine();
            total += amount[i];
            if (category[i].equalsIgnoreCase("Food")) {
                foodTotal += amount[i];
            }
        }
        System.out.println("\nAll Expenses:");
        for (int i = 0; i < n; i++) {
            System.out.println(category[i] + " - " + amount[i]);
        }
        System.out.println("Total Expense: " + total);
        System.out.println("Food Expense: " + foodTotal);
    }
}