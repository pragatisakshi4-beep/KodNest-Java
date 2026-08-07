import java.util.Scanner;
public class UserInput2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter byte value: ");
    byte a = scan.nextByte();
    System.out.println("Byte Value is " + a);

    System.out.println("Enter Short Value: ");
    short b = scan.nextShort();
    System.out.println("Short value is " + b);

    System.out.println("Enter Integer Value: ");
    int c = scan.nextInt();
    System.out.println("Integer value is " + c);

    System.out.println("Enter Long value: ");
    long d = scan.nextLong();
    System.out.println("Long value is " + d);

    System.out.println("Enter Float value: ");
    float e = scan.nextFloat();
    System.out.println("Float value is " + e);

    System.out.println("Enter double value: ");
    double f = scan.nextDouble();
    System.out.println("Double value is " + f);

    System.out.println("Enter Character value: ");
    char g = scan.next().charAt(0);
    System.out.println("Character value is " + g);

    System.out.println("Enter boolean value: ");
    boolean h = scan.nextBoolean();
    System.out.println("Boolean value is " + h);
  }
}
