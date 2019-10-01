import java.util.Scanner;
class Circle{
    public static void main(){
        Scanner rad=new Scanner(System.in);
        
        System.out.print("Enter the radius:\n");
        double r=rad.nextDouble();
        double a=(r*r)*Math.PI;
        System.out.print("The area of the circle is:\n"+a);
    }
}