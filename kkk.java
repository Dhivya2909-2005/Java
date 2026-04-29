class kkk{
    public static void main(String[] args) {
        int a=19;
        int b=7;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(5+10+"a");
        System.out.println("a"+5+"b");

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

        int max = (a > b) ? a : b;
        System.out.println(max);

        System.out.println(a);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);
        System.out.println(a++ + ++a + --a);
    }
}