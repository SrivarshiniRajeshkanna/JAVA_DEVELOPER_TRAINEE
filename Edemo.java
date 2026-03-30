class Employee {
    int eid;
    String ename;
	
    Employee(int id, String name) {
        eid = id;
        ename = name;
        System.out.println("Employee constructor called");             //1st
    }

    void display() {
        System.out.println("Employee ID: " + eid);                       //3rd
        System.out.println("Employee Name: " + ename);            //4th
    }
}

class Manager extends Employee {
    String role;

    Manager(int id, String name, String role) {
        super(id, name); 
        this.role = role;
		System.out.println("My name is : "+name);                     //2nd
    }
    //@Override
    void display() {
        super.display();  
        System.out.println("Role: " + role);                                  //5th
    }
}
public class Edemo {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Varshini", "Project Manager");
        m.display();
    }
}