import java.util.*;
 class New {
    
    public static int add(int a,int b){
    int add= a+b;
    return add;
    }New(){
    System.out.print("this is my constructor");
}

    public static void main(String[] args){
        New n = new New();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int addition = n.add(a,b);
        System.out.println("this is my sum"+addition);
    }

}
