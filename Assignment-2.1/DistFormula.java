import java.util.Scanner;
class DistFormula{
    public static void main(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter x coordinate for first point:\n");
        int x1=scan.nextInt();
        System.out.print("Enter y coordinate for first point:\n");
        int y1=scan.nextInt();
        System.out.print("Enter x coordinate for second point:\n");
        int x2=scan.nextInt();
        System.out.print("Enter y coordinate for second point:\n");
        int y2=scan.nextInt();
        
        double dist=Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2));
        System.out.print("The distance is:\n"+dist);
    }
}