import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product laptop = new Product("12345", "Laptop", "1.0", 1000.00);

        // două licențe pentru același produs
        License licenta1 = new License("KEY-111", "2025-12-31", laptop); // activă
        License licenta2 = new License("KEY-222", "2023-01-01", laptop); // probabil expirată

        // user cu o licență inițială
        User john = new User("John Doe", "john.doe@example.com", licenta1);

        // adăugăm a doua licență
        john.addLicense(licenta2);

        System.out.println("=== Toate licențele lui John ===");
        for (License lic : john.getLicenses()) {
            System.out.println(lic);
        }

        System.out.println("=== Licențe active ===");
        for (License lic : john.getActiveLicenses()) {
            System.out.println(lic);
        }

        // ștergem o licență după key
        john.removeLicense("KEY-222");

        System.out.println("=== După removeLicense(KEY-222) ===");
        for (License lic : john.getLicenses()) {
            System.out.println(lic);
        }
        
        // ===============================
//     POLIMORFISM CU PRODUSE
// ===============================

Product digitalProduct = new Product("D-001", "Digital Installer", "2.0", 199.99);
PhysicalProduct boxedProduct = new PhysicalProduct("P-001", "Boxed Installer", "2.0", 249.99, 0.85);

List<Product> productList = new ArrayList<>();
productList.add(digitalProduct);
productList.add(boxedProduct);

System.out.println("\n=== Lista de produse (Product + PhysicalProduct) ===");
for (Product p : productList) {
    System.out.println(p); 
    // pentru PhysicalProduct se va apela automat toString() suprascris
}

System.out.println("=== Aplicare discount 10% pentru toate produsele ===");
for (Product p : productList) {
    p.applyDiscount(10);  // funcționează pentru ambele tipuri
    System.out.println(p);
}


        // testăm updateEmail
        john.updateEmail("john.new@example.com");

        System.out.println("=== User final ===");
        System.out.println(john);
    }
}
