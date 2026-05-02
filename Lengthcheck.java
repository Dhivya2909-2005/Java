import java.util.*;
class Lengthcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        if (str.length() < 5) {
            System.out.println("Short");
        } else {
            System.out.println("Long");
        }
    }
}