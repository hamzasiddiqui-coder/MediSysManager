import java.util.*;

/**
 * MediSysManager - A unique Hospital Management System
 * Author: MOHD HAMZA SIDDIQUI
 **/
public class MediSysManager {
    private static final Scanner scanner = new Scanner(System.in);

    // Entity lists
    private static final List<Physician> physicians = new ArrayList<>();
    private static final List<PatientRecord> patientRecords = new ArrayList<>();
    private static final List<PharmacyItem> pharmacy = new ArrayList<>();
    private static final List<LabService> labServices = new ArrayList<>();
    private static final List<HospitalAmenity> amenities = new ArrayList<>();
    private static final List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        seedSampleData();
        printWelcomeScreen();

        while (true) {
            printMainMenu();
            int option = getIntInput("Select an option: ");
            switch (option) {
                case 1: doctorMenu(); break;
                case 2: patientMenu(); break;
                case 3: pharmacyMenu(); break;
                case 4: labMenu(); break;
                case 5: amenityMenu(); break;
                case 6: employeeMenu(); break;
                case 0: 
                    printGoodbye();
                    return;
                default: 
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    // --- Menu Methods ---
    private static void printWelcomeScreen() {
        System.out.println("╔════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                  MediSysManager                                           ║");
        System.out.println("║                        Hospital Management System Console App                             ║");
        System.out.println("║                                                                                           ║");
        System.out.println("║        Developed by Mohd Hamza Siddiqui - © 2025 All Rights Reserved                      ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════════╝");
        Calendar cal = Calendar.getInstance();
        System.out.printf("Date: %tF   Time: %tT\n", cal, cal);
        System.out.println("==========================================================================================");
    }

    private static void printMainMenu() {
        System.out.println("\n----------------------------------- MAIN MENU --------------------------------------------");
        System.out.println("1. Physicians");
        System.out.println("2. Patients");
        System.out.println("3. Pharmacy");
        System.out.println("4. Laboratory");
        System.out.println("5. Amenities");
        System.out.println("6. Employees");
        System.out.println("0. Exit");
        System.out.println("------------------------------------------------------------------------------------------");
    }

    private static void printGoodbye() {
        System.out.println("\n==========================================================================================");
        System.out.println("           Thank you for using MediSysManager! Stay healthy and safe!                      ");
        System.out.println("==========================================================================================");
    }

    // Doctor menu
    private static void doctorMenu() {
        while (true) {
            System.out.println("\n--- PHYSICIAN SECTION ---");
            System.out.println("1. Add Physician");
            System.out.println("2. List Physicians");
            System.out.println("0. Back");
            int choice = getIntInput("Choose: ");
            if (choice == 1) {
                Physician doc = new Physician();
                doc.input(scanner);
                physicians.add(doc);
            } else if (choice == 2) {
                System.out.printf("%-10s %-25s %-20s %-10s %-12s %-6s\n", "ID", "Name", "Specialty", "Shift", "Degree", "Room");
                for (Physician doc : physicians) doc.display();
            } else if (choice == 0) break;
        }
    }

    // Patient menu
    private static void patientMenu() {
        while (true) {
            System.out.println("\n--- PATIENT SECTION ---");
            System.out.println("1. Add Patient");
            System.out.println("2. List Patients");
            System.out.println("0. Back");
            int choice = getIntInput("Choose: ");
            if (choice == 1) {
                PatientRecord pr = new PatientRecord();
                pr.input(scanner);
                patientRecords.add(pr);
            } else if (choice == 2) {
                System.out.printf("%-10s %-20s %-15s %-10s %-12s %-5s\n", "ID", "Name", "Ailment", "Gender", "Admitted", "Age");
                for (PatientRecord pr : patientRecords) pr.display();
            } else if (choice == 0) break;
        }
    }

    // Pharmacy menu
    private static void pharmacyMenu() {
        while (true) {
            System.out.println("\n--- PHARMACY SECTION ---");
            System.out.println("1. Add Medicine");
            System.out.println("2. List Medicines");
            System.out.println("0. Back");
            int choice = getIntInput("Choose: ");
            if (choice == 1) {
                PharmacyItem item = new PharmacyItem();
                item.input(scanner);
                pharmacy.add(item);
            } else if (choice == 2) {
                System.out.printf("%-15s %-15s %-12s %-8s %-6s\n", "Name", "Brand", "Expiry", "Price", "Stock");
                for (PharmacyItem item : pharmacy) item.display();
            } else if (choice == 0) break;
        }
    }

    // Lab menu
    private static void labMenu() {
        while (true) {
            System.out.println("\n--- LAB SECTION ---");
            System.out.println("1. Add Lab Service");
            System.out.println("2. List Lab Services");
            System.out.println("0. Back");
            int choice = getIntInput("Choose: ");
            if (choice == 1) {
                LabService lab = new LabService();
                lab.input(scanner);
                labServices.add(lab);
            } else if (choice == 2) {
                System.out.printf("%-20s %-8s\n", "Service", "Fee");
                for (LabService lab : labServices) lab.display();
            } else if (choice == 0) break;
        }
    }

    // Amenity menu
    private static void amenityMenu() {
        while (true) {
            System.out.println("\n--- AMENITIES SECTION ---");
            System.out.println("1. Add Amenity");
            System.out.println("2. List Amenities");
            System.out.println("0. Back");
            int choice = getIntInput("Choose: ");
            if (choice == 1) {
                HospitalAmenity amenity = new HospitalAmenity();
                amenity.input(scanner);
                amenities.add(amenity);
            } else if (choice == 2) {
                System.out.printf("%-30s\n", "Amenity");
                for (HospitalAmenity amenity : amenities) amenity.display();
            } else if (choice == 0) break;
        }
    }

    // Employee menu
    private static void employeeMenu() {
        while (true) {
            System.out.println("\n--- EMPLOYEE SECTION ---");
            System.out.println("1. Add Employee");
            System.out.println("2. List Nurses");
            System.out.println("3. List Workers");
            System.out.println("4. List Security");
            System.out.println("0. Back");
            int choice = getIntInput("Choose: ");
            if (choice == 1) {
                Employee emp = new Employee();
                emp.input(scanner);
                employees.add(emp);
            } else if (choice >= 2 && choice <= 4) {
                String[] roles = {"nurse", "worker", "security"};
                for (Employee emp : employees)
                    if (emp.role.equalsIgnoreCase(roles[choice - 2]))
                        emp.display();
            } else if (choice == 0) break;
        }
    }

    // --- Utility ---
    public static int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try { return Integer.parseInt(line); }
            catch (NumberFormatException e) { System.out.println("Enter a valid number."); }
        }
    }

    private static void seedSampleData() {
        physicians.add(new Physician("21", "Dr. Mohd Nazim Khan", "Psychiatrist", "5-11AM", "MBBS,MD", 17));
        physicians.add(new Physician("32", "Dr. Arpit Bansal", "Cardiologist", "10-3AM", "MBBS,MD", 45));
        patientRecords.add(new PatientRecord("12","Ravi","Typhoid","Male","y",30));
        pharmacy.add(new PharmacyItem("Corex","Cino","9-5-16",55,8));
        labServices.add(new LabService("X-ray",800));
        amenities.add(new HospitalAmenity("Ambulance"));
        employees.add(new Employee("22","Prakash","worker","Male",5000));
    }
}
