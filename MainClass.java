import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("PIZZA BILL COLLECTOR");
        System.out.println("1.Small");
        System.out.println("2.Regular");
        System.out.println("3.Large");
        System.out.println("Enter your choice : ");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        Pizza obj=new Pizza();
        obj.display(args,input);
    }
}
