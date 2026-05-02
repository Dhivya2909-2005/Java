class patient{
    public static void main(String[] args) {
        int ids[] = {20,21,22,23,24};
        int search = 25;
        boolean found = false;
        for(int i = 0; i < ids.length; i++) {
            if(ids[i] == search) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Patient ID Found");
        else
            System.out.println("Patient ID Not Found");
    }
}