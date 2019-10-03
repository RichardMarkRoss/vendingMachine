package vendingmachine;

public class ProductNotFoundException extends Exception {
        ProductNotFoundException(String error){
            super(error);
        }
}
