import java.util.*;
class number {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int b[] = a.clone();
        int c[] = Arrays.copyOf(a, a.length);
        int d[] = new int[a.length];
        System.arraycopy(a, 0, d, 0, a.length);
        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}