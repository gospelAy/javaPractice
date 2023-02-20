package Chapter3;

public class Application {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("YABA", "fuel", 2, 100.0, 5.0);
        System.out.println(petrolPurchase);

        PetrolPurchase petrolPurchase3 = new PetrolPurchase("Magbon", "fule", 5, 200.0, 7.0);
        System.out.println(petrolPurchase3);
    }
}
