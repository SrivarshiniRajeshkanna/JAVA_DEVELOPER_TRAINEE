class Employee {
    int eid;
    String ename;
	
    Employee(int id, String name) {
        eid = id;
        ename = name;
        System.out.println("Employee constructor called");
    }

    void display() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
    }
}

class Manager extends Employee {
    String role;

    Manager(int id, String name, String role) {
        super(id, name); 
        this.role = role;
		System.out.println("My name is : "+name);
    }
    //@Override
    void display() {
        super.display();  
        System.out.println("Role: " + role);
    }
}
public class Edemo {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Varshini", "Project Manager");
        m.display();
    }
}