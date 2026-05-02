class delivery {
    public static void main(String[] args) {
        int parcels[] = {40,41,42,43,44};
        parcels[3] = 45;  
        for(int i = 0; i < parcels.length; i++) {
            System.out.println(parcels[i]);
        }
    }
}