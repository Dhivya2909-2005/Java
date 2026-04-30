import java.util.*;
class loop1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n!=0){   
            System.out.println("User : "+n);   
            n = s.nextInt();
        }
    }
}
