import java.util.Scanner;

public class apcsatrapezoid {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a top value: ");
      double top = in.nextDouble();
      System.out.print("Enter a bottom value: ");
      double bottom = in.nextDouble();
      System.out.print("Enter a height: ");
      double height = in.nextDouble();

      double area = ((top + bottom)/2) * height;
      System.out.println("The area of a trapezoid is " + area + ".");
      in.close();
    }
}
