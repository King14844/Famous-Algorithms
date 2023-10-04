import java.util.Scanner;

public class FastExponentiation {

    public static double fastPower(double base, int exponent) {

        if (exponent == 0) {
            return 1.0;
        } 
        else if (exponent % 2 == 0) {
            // If the exponent is even, use the formula (a^b)^2 = a^(2b)
            double halfPower = fastPower(base, exponent / 2);
            return halfPower * halfPower;
        }
        else {
            // If the exponent is odd, use the formula a^(2b+1) = a^(b) * a^(b) * a
            double halfPower = fastPower(base, exponent / 2);
            return halfPower * halfPower * base;
        }
    }

    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base value");
        double base = sc.nextDouble();

        System.out.println("Enter the base exponent");
        int exponent = sc.nextInt();

        double result = fastPower(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);

        sc.close();
        
    }
}

