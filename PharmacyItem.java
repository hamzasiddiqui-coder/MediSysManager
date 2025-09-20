import java.util.Scanner;

public class PharmacyItem {
    String name, brand, expiry;
    int price, stock;

    public PharmacyItem() {}
    public PharmacyItem(String name, String brand, String expiry, int price, int stock) {
        this.name=name; this.brand=brand; this.expiry=expiry; this.price=price; this.stock=stock;
    }

    void input(Scanner sc) {
        System.out.print("Name: "); name = sc.nextLine();
        System.out.print("Brand: "); brand = sc.nextLine();
        System.out.print("Expiry: "); expiry = sc.nextLine();
        price = MediSysManager.getIntInput("Price: ");
        stock = MediSysManager.getIntInput("Stock: ");
    }

    void display() {
        System.out.printf("%-15s %-15s %-12s %-8d %-6d\n", name, brand, expiry, price, stock);
    }
}
