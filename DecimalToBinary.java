import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input decimal number
        System.out.print("Input a Decimal Number: ");
        int decimal = sc.nextInt();

        // Convert to binary
        String binary = Integer.toBinaryString(decimal);

        // Display result
        System.out.println("Binary number is: " + binary);

        sc.close();
    }
}