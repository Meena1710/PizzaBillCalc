import java.util.Scanner;

public class Pizza {

    public static void main(String[] args){
        System.out.println("Thank You!");
        System.out.println("1.Exit");
        System.out.println("2.Visit Again");
        Scanner las=new Scanner(System.in);
        int lis=las.nextInt();
        if(lis==2){
            MainClass.main(args);
        }
        else{
            System.out.println("Exiting....");
            las.close();
        }
    }
    public void display(String[] args,int a){
        System.out.println("Menu for your choice");
        System.out.println("1.Margerita");
        System.out.println("2.Cheese and corn");
        System.out.println("Enter your choice : ");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if(a==1){
            if(input==1){
                System.out.println("Your choice is small Margerita");
                System.out.println("How many quantities ?");
                Scanner s=new Scanner(System.in);
                int i=sc.nextInt();
                System.out.println("Total Amount :"+i*80);

            }
            else{
                System.out.println("Your choice is small Cheese and corn");
                System.out.println("How many quantities ?");
                Scanner s=new Scanner(System.in);
                int i=sc.nextInt();
                System.out.println("Total Amount :"+i*80);
            }
        }
        else if(a==2){
            if(input==1){
                System.out.println("Your choice is Regular Margerita");
                System.out.println("How many quantities ?");
                Scanner s=new Scanner(System.in);
                int i=sc.nextInt();
                System.out.println("Total Amount :"+i*120);

            }
            else{
                System.out.println("Your choice is Regular Cheese and corn");
                System.out.println("How many quantities ?");
                Scanner s=new Scanner(System.in);
                int i=sc.nextInt();
                System.out.println("Total Amount :"+i*120);
            }
        }
        else{
                if(input==1){
                    System.out.println("Your choice is Large Margerita");
                    System.out.println("How many quantities ?");
                    Scanner s=new Scanner(System.in);
                    int i=sc.nextInt();
                    System.out.println("Total Amount :"+i*200);

                }
                else{
                    System.out.println("Your choice is Large Cheese and corn");
                    System.out.println("How many quantities ?");
                    Scanner s=new Scanner(System.in);
                    int i=sc.nextInt();
                    System.out.println("Total Amount :"+i*200);
                }

          }
         main(args);

    }
}
