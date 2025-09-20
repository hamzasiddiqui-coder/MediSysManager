import java.util.Scanner;

public class LabService {
    String service;
    int fee;

    public LabService() {}
    public LabService(String service, int fee) { this.service=service; this.fee=fee; }

    void input(Scanner sc) {
        System.out.print("Service: "); service = sc.nextLine();
        fee = MediSysManager.getIntInput("Fee: ");
    }

    void display() {
        System.out.printf("%-20s %-8d\n", service, fee);
    }
}
