import java.util.Scanner;
class D6{
    public static void main(){
        for(int i=0;i<10;i++){
        int d=(int)((Math.random()*6));
        d=d+1;
        int i2=i+1;
        System.out.print("Die #"+i2+" is "+d+"\n");
    }
    }
}