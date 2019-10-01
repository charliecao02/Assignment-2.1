import java.util.Scanner;
class Interest{
    public static void main(){
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter principle:\n");
        double p=scan.nextDouble();
        System.out.print("Enter rate:\n");
        double r=scan.nextDouble();
        System.out.print("Enter number of years:\n");
        double n=scan.nextDouble();
        
        double amount=(p*(Math.pow((1+r),n)));
        System.out.print("The final amount is:\n"+amount);
    }
}