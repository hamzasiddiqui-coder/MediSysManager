import java.util.Scanner;

public class Employee {
    String id, name, role, gender;
    int salary;

    public Employee() {}
    public Employee(String id, String name, String role, String gender, int salary) {
        this.id=id; this.name=name; this.role=role; this.gender=gender; this.salary=salary;
    }

    void input(Scanner sc) {
        System.out.print("ID: "); id = sc.nextLine();
        System.out.print("Name: "); name = sc.nextLine();
        System.out.print("Role (nurse/worker/security): "); role = sc.nextLine().toLowerCase();
        System.out.print("Gender: "); gender = sc.nextLine();
        salary = MediSysManager.getIntInput("Salary: ");
    }

    void display() {
        System.out.printf("%-10s %-20s %-10s %-10d\n", id, name, gender, salary);
    }
}
