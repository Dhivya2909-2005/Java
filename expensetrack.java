//1. Take 2 inputs from the user - Expense name,price for expense(eg: food,150)
//2. Take input until user enters 0
//3. Once the user has entered 0,stop taking input and display the total price of expenses
import java.util.*;
class expensetrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
            while (true) {
            System.out.print("Enter expense name: ");
            String name = sc.next();         
            System.out.print("Enter expense price: ");
            double price =sc.nextDouble();
            if(price==0){
                break;
            } 
            total = total + price;
        }
        System.out.println("Total expenses: "+total);
    }
}
