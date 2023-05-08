package org.example;
import java.util.Scanner;
public class Methods {
    static float x1, x2, x3, y1, y2,y3,a,b ;
    static Scanner input = new Scanner(System.in);
    public static void getPoints(){
        boolean Cont = true;
        while(Cont){
            System.out.println("Enter the x and y components of the first point: ");
            x1 = input.nextFloat();
            y1 = input.nextFloat();
            System.out.println("Enter the x and y components of the second point: ");
            x2 = input.nextFloat();
            y2 = input.nextFloat();
            if(x1 == x2 && y1 == y2) {
                System.err.println("Please enter two different points!");
                System.out.println();
            } else Cont = false;
        }
        getLine();
    }
    public static void getLine(){
        if (x1 == x2) System.out.printf("Line equation: x = %.1f",x1);
        else if (y1 == y2) System.out.printf("Line equation: y = %.1f%n",y1);
        else {
            a = (y1 - y2) / (x1 - x2);
            b = y1 - (a * x1);
            if(b == 0) System.out.printf("Line equation: y = %.1fx%n", a);
            else System.out.printf("Line equation: y = %.1fx%+.1f%n", a, b);
        }
    }
    public static void checkPoint(){
        getPoints();
        System.out.println("Enter the x and y components of the target point: ");
        x3 = input.nextFloat();
        y3 = input.nextFloat();
        if((a*x3)+b == y3) System.out.println("The target point IS on this line.");
        else System.out.println("The target point IS NOT on this target line.");
    }
}
