import java.util.*;
public class currencyConverter{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount is dollars");
        int amt=sc.nextInt();
        int res=amt*75;
        System.out.println("Your amount is Rs");
        System.out.println(res);

    }
}