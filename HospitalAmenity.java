import java.util.Scanner;

public class HospitalAmenity {
    String amenity;

    public HospitalAmenity() {}
    public HospitalAmenity(String amenity) { this.amenity=amenity; }

    void input(Scanner sc) {
        System.out.print("Amenity: "); amenity = sc.nextLine();
    }

    void display() {
        System.out.printf("%-30s\n", amenity);
    }
}
