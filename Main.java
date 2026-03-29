import java.util.*;

class Vehicle {
    void displayInfo(String type, int year) {
        System.out.println("The vehicle is " + type + " of year " + year);
    }
}

class Bike extends Vehicle {
    void displayInfo(int choice, int year) {
        System.out.println("Bike Details:");

        switch (choice) {
            case 1:
                System.out.println("Hero MotoCorp");
                System.out.println("Fuel-efficient bikes like Splendor Plus");
                System.out.println("Price: 55000");
                break;

            case 2:
                System.out.println("Royal Enfield");
                System.out.println("Classic bikes like Bullet 350");
                System.out.println("Price: 200000");
                break;

            case 3:
                System.out.println("KTM India");
                System.out.println("High-performance bikes like Duke");
                System.out.println("Price: 95000");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

class Car extends Vehicle {
    void displayInfo(int choice, int year) {
        System.out.println("Car Details:");

        switch (choice) {
            case 1:
                System.out.println("Maruti Suzuki");
                System.out.println("Affordable cars like Swift");
                System.out.println("Price: 1500000");
                break;

            case 2:
                System.out.println("Hyundai");
                System.out.println("SUVs like Creta");
                System.out.println("Price: 3500000");
                break;

            case 3:
                System.out.println("Volkswagen");
                System.out.println("Premium German cars");
                System.out.println("Price: 10000000");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cont;

        do {
            System.out.println("\n===== VEHICLE MENU =====");
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.print("Enter your choice: ");
            int typeChoice = sc.nextInt();

            System.out.print("Enter year: ");
            int year = sc.nextInt();

            Vehicle v = new Vehicle();

            switch (typeChoice) {
                case 1:
                    v.displayInfo("Car", year);
                    Car c = new Car();
                    System.out.println("\nSelect Car Brand:");
                    System.out.println("1. Maruti Suzuki");
                    System.out.println("2. Hyundai");
                    System.out.println("3. Volkswagen");
                    int carChoice = sc.nextInt();
                    c.displayInfo(carChoice, year);
                    break;

                case 2:
                    v.displayInfo("Bike", year);
                    Bike b = new Bike();
                    System.out.println("\nSelect Bike Brand:");
                    System.out.println("1. Hero MotoCorp");
                    System.out.println("2. Royal Enfield");
                    System.out.println("3. KTM India");
                    int bikeChoice = sc.nextInt();
                    b.displayInfo(bikeChoice, year);
                    break;

                default:
                    System.out.println("Invalid vehicle type");
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            cont = sc.next().charAt(0);

        } while (cont == 'y' || cont == 'Y');

        System.out.println("Thank you!");
    }
}