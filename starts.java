import java.util.*;
class starts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        if (str.startsWith("Java")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}