import java.util.Scanner;
class scn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.print("Enter your email: ");
        String email = s.nextLine();
        System.out.print("Enter your height: ");
        float height = s.nextFloat();
        System.out.print("Enter your phone number: ");
        long phone = s.nextLong();
        System.out.print("Enter your age: ");
        int age = s.nextInt(); 
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Height: " + height);
        System.out.println("Phone Number: " + phone);
        System.out.println("Age: " + age);
    }
}
