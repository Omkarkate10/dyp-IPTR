import java.util.*;
public class leap_year {
    public static void main(String args[]){
        System.out.print("enter the year :");
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
       
        if(year%4==0){
            System.out.println("this year is leap year :"+year);
        }else{
            System.out.println("this is not leap year :"+year);
            sc.close();
        }
    
    }
}
