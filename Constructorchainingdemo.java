import java.util.Scanner;

class Hotel{
	String itemName;
	int itemId;
	double price;
	int qty;
	
	Hotel(int itemId , String itemName , double price , int qty){
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.qty = qty;
	}
	
	double calculateTotal(){
		return price*qty;
	}
	void display(){
		System.out.println(itemName + "-------"+qty+"-------"+price+"-------"+calculateTotal());
	}
}
public class Constructorchainingdemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice , quantity;
		char cont;
		double finalprize=0;
		do{
			System.out.println("\n--- HOTEL MENU ---");
            System.out.println("1. Idli - ₹30");
            System.out.println("2. Dosa - ₹50");
            System.out.println("3. Poori - ₹40");
            System.out.println("4. Pongal - ₹50");
            System.out.println("5. Chapathi - ₹33");
            System.out.println("6. Chole Bature - ₹70");
            System.out.println("7. Mini Idli - ₹25");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
			
			if(choice == 8){
				break;
			}
			System.out.print("Enter the quantity");
			quantity = sc.nextInt();
			
			 Hotel h = null;

            switch (choice) {
                case 1:
                    h = new Hotel(1, "Idli", 30, quantity);
                    break;
                case 2:
                    h = new Hotel(2, "Dosa", 50, quantity);
                    break;
                case 3:
                    h = new Hotel(3, "Poori", 40, quantity);
                    break;
				case 4:
					h = new Hotel(4, "Pongal" , 50, quantity);
					break;
				case 5:
					h = new Hotel(4, "Chapathi" , 33, quantity);
					break;
				case 6:
					h = new Hotel(4, "Chole Bature" , 70, quantity);
					break;
				case 7:
					h = new Hotel(4, "Mini Idli" , 25, quantity);
					break;
                default:
                    System.out.println("Invalid choice!");
            }
			 if (h != null) {
                h.display();
                finalprize += h.calculateTotal();
            }
			System.out.print("\nDo you want to continue? (y/n): ");
            cont = sc.next().charAt(0);
			} while (cont == 'y' || cont == 'Y');
			System.out.println("\nTotal Bill = ₹" + finalprize);
			System.out.println("Thank you! Visit again 😊");
	}
}
		
		