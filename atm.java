import java.util.*;
class atm{
    public static void main(String[] args) {
        int pin_no = 2909;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin: ");
        int pin = sc.nextInt();
        sample o = new sample();
        if(pin_no == pin){
            System.out.println("1.Check balance\n2.Deposit");
            System.out.println("Enter your choice ( 1 or 2): ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println(o.getBalance());
            }
            else if (choice == 2) {
                System.out.println("Enter your Amount: ");
                double amt = sc.nextDouble();
                o.deposit(amt);
            }
            else{
                System.out.println("Invalid choice");
            }
        }
        else{
            System.out.println("Invalid pin!");
        }
    }
}
class sample{
    private double balance = 4500.75;
    double getBalance(){
        return balance;
    }
    void deposit(double amount){
        balance+= amount;
    }
}
