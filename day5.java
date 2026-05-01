import java.util.*;
class day5{
    public static void main(String[] args) {
        System.out.println("Enter your message: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        todolist x = new todolist();
        x.todo(a);
    }
}
    class todolist{
        void todo(String b){
        if(b.isBlank()){
            System.out.println("You have not entered task: ");
            return;
        }
        else{
            System.out.println("Your Task: "+b);
            System.out.println("Thanks for entering your task");
            }
        }   
}
