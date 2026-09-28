package guided;

public class angka {
    public static void main(String[] args) {
        System.out.println("=== Perulangan For ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Angka: " + i);
        }
        
        System.out.println("\n=== Perulangan While ===");
        int j = 1;
        while (j <= 10) {
            System.out.println("Angka: " + j);
            j++;
        }
        
        System.out.println("\n=== Perulangan Do-While ===");
        int k = 1;
        do {
            System.out.println("Angka: " + k);
            k++;
        } while (k <= 10);
    }
}