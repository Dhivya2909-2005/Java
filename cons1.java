class cons1{
    public static void main(String[] args){
        constructors o = new constructors("Dhivya");
        constructors o2 = new constructors(o);  
        System.out.println(o.name);
        System.out.println(o2.name2);
    }
}
class constructors{
    String name;
    String name2;
    constructors(String nm){
        name = nm;

    }
    constructors(constructors j){
        name2 = j.name;
        
    }
}