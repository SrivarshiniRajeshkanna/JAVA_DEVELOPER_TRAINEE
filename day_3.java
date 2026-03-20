/*class day_3 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        int i = 1;

        while (i <= num) {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}*/
import java.util.Scanner;
class day_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a positive number: ");
            num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Invalid! Please enter a positive number.");
            }
        } while (num <= 0);
        System.out.println("You entered: " + num);
    }
}