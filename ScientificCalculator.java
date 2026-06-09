import java.util.*;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Scientific Calculator ---");
            System.out.println("1.Add 2.Sub 3.Mul 4.Div");
            System.out.println("5.Power 6.Sqrt 7.Sin 8.Cos 9.Tan 10.Log 11.Exit");

            int choice = sc.nextInt();

            if (choice == 11) break;

            double a, b;

            switch (choice) {

                case 1:
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(a + b);
                    break;

                case 2:
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(a - b);
                    break;

                case 3:
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(a * b);
                    break;

                case 4:
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(a / b);
                    break;

                case 5:
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(Math.pow(a, b));
                    break;

                case 6:
                    a = sc.nextDouble();
                    System.out.println(Math.sqrt(a));
                    break;

                case 7:
                    a = sc.nextDouble();
                    System.out.println(Math.sin(Math.toRadians(a)));
                    break;

                case 8:
                    a = sc.nextDouble();
                    System.out.println(Math.cos(Math.toRadians(a)));
                    break;

                case 9:
                    a = sc.nextDouble();
                    System.out.println(Math.tan(Math.toRadians(a)));
                    break;

                case 10:
                    a = sc.nextDouble();
                    System.out.println(Math.log10(a));
                    break;
            }
        }

        sc.close();
    }
}