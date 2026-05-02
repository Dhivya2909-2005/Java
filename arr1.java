import java.util.Arrays;
class arr1{
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        int b[]=a.clone();
        System.arraycopy(a,0,b,0,5);
        for(int i=0;i<b.length;i++)
        System.out.println(b[i]);
        b=Arrays.copyOf(a,3);
        for(int i=0;i<b.length;i++)
        System.out.println(b[i]);
}
}