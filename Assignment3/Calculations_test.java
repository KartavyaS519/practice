import java.util.Scanner;
public class Calculations_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Triangle T1 = new Triangle(base, height);

        System.out.println("Enter the values for rectangle :");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Rectangle R1 = new Rectangle(length, width);

        System.out.println("Enter the value for Square :");
        double lenght2 = sc.nextDouble();
        Square S1 = new Square(lenght2);

        T1.calcualteArea();
        T1.getsides(3);
        R1.calcualteArea();
        R1.getsides(4);
        S1.calcualteArea();
        S1.getsides(4);
        }
 }

