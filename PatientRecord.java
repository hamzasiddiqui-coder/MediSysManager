import java.util.Scanner;

public class PatientRecord {
    String id, name, ailment, gender, admitted;
    int age;

    public PatientRecord() {}
    public PatientRecord(String id, String name, String ailment, String gender, String admitted, int age) {
        this.id=id; this.name=name; this.ailment=ailment; this.gender=gender; this.admitted=admitted; this.age=age;
    }

    void input(Scanner sc) {
        System.out.print("ID: "); id = sc.nextLine();
        System.out.print("Name: "); name = sc.nextLine();
        System.out.print("Ailment: "); ailment = sc.nextLine();
        System.out.print("Gender: "); gender = sc.nextLine();
        System.out.print("Admitted (y/n): "); admitted = sc.nextLine();
        age = MediSysManager.getIntInput("Age: ");
    }

    void display() {
        System.out.printf("%-10s %-20s %-15s %-10s %-12s %-5d\n", id, name, ailment, gender, admitted, age);
    }
}
