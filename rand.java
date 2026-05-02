import java.util.Random;
class rand{
    public static void main(String[] args) {
        Random rn = new Random();
        int n = rn.nextInt();
        System.out.println(n);
        boolean b = rn.nextBoolean();
        System.out.println(b);
        double g = 10+(2*rn.nextGaussian());
        System.out.println(g);
    }}
