class manual {
    public static void main(String[] args) {
        int price[] = {150, 260, 370, 480};
        int copy[] = new int[price.length];
        for(int i = 0; i < price.length; i++) {
            copy[i] = price[i];
        }
        for(int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}