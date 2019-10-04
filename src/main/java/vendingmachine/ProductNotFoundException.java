package vendingmachine;

public class ProductNotFoundException extends Exception {
    ProductNotFoundException(){
        super();
    }
        ProductNotFoundException(String error){
            System.out.println("product not found");
        }
}
