import com.tnsif.application.GSShopFactory;
import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.ShopFactory;

public class GoShoppingApp {
    public static void main(String[] args) {
        // Create the factory
        ShopFactory shopFactory = new GSShopFactory();

        // Create a Prime account (no delivery charges)
        PrimeAcc primeAcc = shopFactory.getNewPrimeAccount(101, "Amit", 0, true);
        
        // Create a Normal account (with delivery charges)
        NormalAcc normalAcc = shopFactory.getNewNormalAccount(102, "Rahul", 0, 50);

        // Test Prime Account
        System.out.println("--- Prime Account Test ---");
        primeAcc.bookProduct(500);
        System.out.println(primeAcc.toString());

        System.out.println();

        // Test Normal Account
        System.out.println("--- Normal Account Test ---");
        normalAcc.bookProduct(500);
        System.out.println(normalAcc.toString());
    }
}