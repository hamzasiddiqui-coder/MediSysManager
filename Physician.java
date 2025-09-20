import java.util.Scanner;

public class Physician {
    String id, name, specialty, shift, degree;
    int room;

    public Physician() {}
    public Physician(String id, String name, String specialty, String shift, String degree, int room) {
        this.id = id; this.name = name; this.specialty = specialty; this.shift = shift; this.degree = degree; this.room = room;
    }

    void input(Scanner sc) {
        System.out.print("ID: "); id = sc.nextLine();
        System.out.print("Name: "); name = sc.nextLine();
        System.out.print("Specialty: "); specialty = sc.nextLine();
        System.out.print("Shift: "); shift = sc.nextLine();
        System.out.print("Degree: "); degree = sc.nextLine();
        room = MediSysManager.getIntInput("Room: ");
    }

    void display() {
        System.out.printf("%-10s %-25s %-20s %-10s %-12s %-6d\n", id, name, specialty, shift, degree, room);
    }
}
