import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    boolean repeat = true;
    Scanner sc = new Scanner(System.in);
    Calculation calculation = new Calculation() ;

    do {
      try {
        System.out.println("===Menu Program==");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapoized");
        System.out.print("Select menu : ");

        int menu = sc.nextInt();
        switch (menu) {
          case 1:
            System.out.print("Enter the length of the side of the square : ");
            double square = sc.nextDouble();
            calculation.setSquare(square);
            calculation.run();
            System.out.println("Result = " + calculation.getSquare());
            break;

          case 2:
            System.out.print("Enter the radius of circle : ");
            double circle = sc.nextDouble();
            calculation.setCircle(circle);
            calculation.run();
            System.out.println("Result = " + calculation.getCircle());
            break;

          case 3:
            System.out.print("Insert the side of the base of the trapezoid : ");
            double sd = sc.nextDouble();
            System.out.print("Enter the upper side of the trapezoid : ");
            double up = sc.nextDouble();
            System.out.print("Enter the height of the trapezoid : ");
            double hg = sc.nextDouble();

            calculation.setTrapezoid(sd, up, hg);
            calculation.run();
            System.out.println("Result = " + calculation.getTrapezoid());

          default:
            System.out.println("Options not available");
            continue;
        }

    } catch (InputMismatchException e) {
        System.out.println("====Error: Input must be a number====");
        sc.next();
    } catch (IllegalArgumentException e) {
        System.out.println(e);
    } 
  } while (repeat);
  sc.close();
  }
}